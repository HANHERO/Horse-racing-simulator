package com.alevel.java7.finalproject.horseracingsimulator.logic;



import java.util.Random;

public class Bots {
    private int strength = 0;
    private int agility = 0;
    private int stamina = 0;

    private int level = 0;
    private double characteristicsPoints = 5;

    public Bots() {
        randomizeCharacteristics();
    }

    private void randomizeCharacteristics() {
        characteristicsPoints += (Logic.userHorse.getLevel() - level) * 0.6;
        level = Logic.userHorse.getLevel();
        while (characteristicsPoints >= 1) {
            Random rnd = new Random();

            int a = 1 + rnd.nextInt(3);

            switch (a) {
                case 1:
                    strength++;
                    break;
                case 2:
                    agility++;
                    break;
                case 3:
                    stamina++;
                    break;
            }
            characteristicsPoints -= 1;
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getStamina() {
        return stamina;
    }
}
