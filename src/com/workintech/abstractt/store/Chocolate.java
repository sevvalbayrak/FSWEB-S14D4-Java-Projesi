package com.workintech.abstractt.store;

public class Chocolate extends ProductForSale{
    private String brand;
    public Chocolate(String type, double price, String description,String brand) {
        super(type, price, description);
        this.brand=brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + getType());

    }
}
