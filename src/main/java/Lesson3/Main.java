package Lesson3;

public class Main {
    public static void main(String[] args) {
        // создаем сотрудников и заполняем все поля
        Employee govard = new Employee("Govard", "Engineer", "govard@mail.com", 123456789, 10000, 25);
        Employee molly = new Employee("Molly", "Filmmaker", "sal53@mail.com", 3453542, 50000, 32);
        Employee sally = new Employee("Sally", "Doctor", "somemail@mail.com", 663445, 30000, 53);
        Employee rick = new Employee("Rick", "Scientist", "notyourbusiness@mail.com", 2345345, 1, 70);
        Employee morty = new Employee("Morty", "Grandson", "mortythegreat@mail.com", 3223435, 0, 16);

        rick.information();
        morty.information();
        System.out.println("Method .information tasted");
        System.out.println("__________________________");

        //4.    Создать массив из 5 сотрудников.
        Employee[] persArray = new Employee[5];
        persArray[0] = govard;
        persArray[1] = molly;
        persArray[2] = sally;
        persArray[3] = rick;
        persArray[4] = morty;



        //5.  С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < persArray.length; i++) {
            persArray[i].printInformationIfAgeMoreThan(40);
        }
        System.out.println("Method .printInformationIfAgeMoreThan tasted");
        System.out.println("__________________________");

    }


}
