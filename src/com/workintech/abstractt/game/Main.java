package com.workintech.abstractt.game;


    public class Main {
        public static void main(String[] args) {
            MonsterCreature monster = new MonsterCreature("Werewolf", 100, 20);
            System.out.println("Monster Name: " + monster.getName());
            System.out.println("Monster Hit Points: " + monster.getHitPoints());
            System.out.println("Monster Damage: " + monster.getDamage());

            double totalDamage = monster.attack();
            System.out.println("Total Damage: " + totalDamage);
        }
    }

