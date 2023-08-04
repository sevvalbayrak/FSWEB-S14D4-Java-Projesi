package com.workintech.abstractt.store;


public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 5.0, "Tasty chocolate", "Nestle");
        products[1] = new Coke("Coke", 2.5, "Refreshing drink", 330);
        products[2] = new Bread("Bread", 3.0, "Healthy whole grain bread", "Whole Grain");

        listProducts(products);
    }
}