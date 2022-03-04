package Lesson7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Sebov\\IdeaProjects\\AndersenQA\\file1.csv");
        File f2 = new File("file2");
        try {
            AppData appData = readData(f);
            saveData(appData, f2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData readData(File file) throws IOException {
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            StringBuilder raw = new StringBuilder();
            String delim = "___";
            while (scanner.hasNext()) {
                raw.append(scanner.nextLine());
                raw.append(delim);
            }
            return new AppData(raw.toString().split(delim));
        }
    }

    public static void saveData(AppData appData, File file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(String.join(";", appData.header));
            for (int[] data: appData.data) {
                String[] dataRow = Arrays.stream(data).boxed().map(String::valueOf).toArray(String[]::new);
                writer.write("\n");
                writer.write(String.join(";", dataRow));
            }
        }
    }

    static class AppData {
        private String[] header;
        private int[][] data;

        public AppData(String[] rawData) {
            this.header = rawData[0].split(";");
            this.data = new int[rawData.length - 1][];
            for (int i = 0; i < this.data.length; i++) {
                this.data[i] = Arrays.stream(rawData[i + 1].split(";")).mapToInt(Integer::parseInt).toArray();
            }
        }
    }
}