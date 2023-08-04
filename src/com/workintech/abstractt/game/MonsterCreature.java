package com.workintech.abstractt.game;

public class MonsterCreature extends Monster  {

    public MonsterCreature(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {

        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}

