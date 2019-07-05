package com.alevel.java7.finalproject.horseracingsimulator.data.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Tracks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int length;
    @Column
    private int numberOfObstacles;
    @Column
    private int prize;
    @Column
    private int experience;

    public Tracks() {
    }

    public Tracks(String name, int length, int numberOfObstacles, int prize, int experience) {
        this.name = name;
        this.length = length;
        this.numberOfObstacles = numberOfObstacles;
        this.prize = prize;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfObstacles() {
        return numberOfObstacles;
    }

    public void setNumberOfObstacles(int numberOfObstacles) {
        this.numberOfObstacles = numberOfObstacles;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tracks tracks = (Tracks) o;
        return id == tracks.id &&
                length == tracks.length &&
                numberOfObstacles == tracks.numberOfObstacles &&
                prize == tracks.prize &&
                experience == tracks.experience &&
                Objects.equals(name, tracks.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, length, numberOfObstacles, prize, experience);
    }
}
