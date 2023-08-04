package com.workintech.abstractt.game;

public  abstract class Monster implements Poisonable, Bleedable {
    public String name;
    public int hitPoints;
    public double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public  double attack(){
        return getDamage()+ bleed()+attack();
    }
}
