package Lesson4.Payment;

import java.util.Scanner;

public class Payment {
    private String name;
    private Product[] prodArray;
    private double cost;

    private class Product {
        private String productName;
        private double productCost;

        public Product() {
            super();
            productName = "null";
            productCost = 0;
        }

        public Product(String productName, double productCost) {
            super();
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public double getProductCost() {
            return this.productCost;
        }
    }

    public Payment() {
        super();
        this.name = "null";
        this.cost = 0;

    }

    public Payment(String name) {
        super();
        this.name = name;
    }

    public void setPayment() {
        this.cost = 0;
        System.out.println("Enter number of products you want to buy");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        prodArray = new Product[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Product " + (i + 1) + ": ");
            System.out.println("Name: ");
            String nameOfProduct = s.next();
            System.out.println("Price: ");
            double productCost = s.nextDouble();
            prodArray[i] = new Product(nameOfProduct, productCost);
            this.cost = this.cost + prodArray[i].productCost;
        }
    }

    public void basket() {
        if (this.prodArray.length != 0) {
            System.out.println(this.name);
            System.out.println("You have in the basket: ");
            for (int i = 0; i < this.prodArray.length; i++) {
                System.out.println(this.prodArray[i].productName + " Price: " + this.prodArray[i].productCost);
            }
            System.out.println("Total cost is: " + this.cost);
        }
    }
}