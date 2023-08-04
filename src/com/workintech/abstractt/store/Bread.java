package com.workintech.abstractt.store;

public class Bread extends ProductForSale{
    private String shape;
    public Bread(String type, double price, String description,String shape) {
        super(type, price, description);
        this.shape=shape;
    }

    @Override
    public void showDetails() {
        System.out.println("Price: " + getPrice());
        System.out.println("Shape: " + shape);
    }
}
