package com.alevel.java7.finalproject.horseracingsimulator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
//@ToString
@Entity
public class Horses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private Integer strength;
    @Column
    private Integer agility;
    @Column
    private Integer stamina;
    @Column
    private Integer intelligence;
    @Column
    private Integer luck;
    @Column
    private Integer experience;
    @Column
    private Integer money;
    @Column
    private Integer countPoints;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Users user;

    protected Horses() {
    }

    public Horses(Integer strength, Integer agility, Integer stamina, Integer intelligence, Integer luck, Integer experience, Integer money, Integer countPoints, Users user) {
        this.strength = strength;
        this.agility = agility;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.luck = luck;
        this.experience = experience;
        this.money = money;
        this.countPoints = countPoints;
        this.user = user;
    }


    @Override
    public String toString() {
        return "Horses{" +
                "id=" + id +
                ", strength=" + strength +
                ", agility=" + agility +
                ", stamina=" + stamina +
                ", intelligence=" + intelligence +
                ", luck=" + luck +
                ", experience=" + experience +
                ", money=" + money +
                ", countPoints=" + countPoints +
                ", user=" + user +
                '}';
    }
}
