package com.alevel.java7.finalproject.horseracingsimulator.logic;

import lombok.Getter;

@Getter
public class UserHorse {
    private int strength = 0;
    private int agility = 0;
    private int stamina = 0;
    private int intelligence = 0;
    private int luck = 0;
    private int experience = 0;
    private int money = 0;
    private int level = 0;
    private int characteristicsPoints = 0;

    public void updateCharacteristics() {
        /*strength =
          agility =
          stamina =
          intelligence =
          luck =
          experience =
          money =
          level =
          characteristicsPoints = */
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

    public int getIntelligence() {
        return intelligence;
    }

    public int getLuck() {
        return luck;
    }

    public int getExperience() {
        return experience;
    }

    public int getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }

    public int getCharacteristicsPoints() {
        return characteristicsPoints;
    }

    public UserHorse() {
        updateCharacteristics();
    }
}
