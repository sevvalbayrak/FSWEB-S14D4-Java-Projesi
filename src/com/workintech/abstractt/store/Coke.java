package com.workintech.abstractt.store;

public class Coke extends ProductForSale {

    private  int volume;
    public Coke(String type, double price, String description,int volume) {
        super(type, price, description);
        this.volume=volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Description: " + getType());

    }
}
