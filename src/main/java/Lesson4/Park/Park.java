package Lesson4.Park;


public class Park {
    private String name;
    private Attractions[] atrArray;
    private double cost;
    private int time;

    private class Attractions {
        private String attractionsName;
        private double attractionsCost;
        private int attractionWorkTime;


        public Attractions(String attractionsName, double attractionsCost, int attractionWorkTime) {
            super();
            this.attractionsName = attractionsName;
            this.attractionsCost = attractionsCost;
            this.attractionWorkTime = attractionWorkTime;
        }

        public String getAttractionsName() {
            return this.attractionsName;
        }

        public double getAttractionsCost() {
            return this.attractionsCost;
        }

        public int getAttractionWorkTime() {
            return this.attractionWorkTime;
        }
    }

    public Park() {
        super();
        this.name = "null";
        this.cost = 0;
        this.time = 0;

    }

    public Park(String name) {
        super();
        this.name = name;
    }

    public void attractionInfo() {
        Attractions bomber = new Attractions("BOMBER", 100.50, 5);
        Attractions slingshot = new Attractions("Slingshot", 300, 10);
        Attractions cars = new Attractions("Cars", 80.50, 15);

        Attractions[] allAtr = new Attractions[3];
        allAtr[0] = bomber;
        allAtr[1] = slingshot;
        allAtr[2] = cars;

        for (int i = 0; i < allAtr.length; i++) {
            System.out.println("Attraction: " + allAtr[i].attractionsName + " Price: " + allAtr[i].attractionsCost +
                    " dilution duration: " + allAtr[i].attractionWorkTime + " minutes");

        }


    }


}

