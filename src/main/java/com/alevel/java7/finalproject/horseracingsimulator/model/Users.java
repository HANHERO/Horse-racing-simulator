package com.alevel.java7.finalproject.horseracingsimulator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
//@ToString
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String login;
    @Column
    private String password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Horses horse;

    protected Users() {
    }

    public Users(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHorse(Horses horse) {
        this.horse = horse;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Horses getHorse() {
        return horse;
    }


    @Override
    public String toString() {
        return String.format(
                "Users[id=%d, login='%s', password='%s', horse='%s']",
                id, login, password, horse);
    }

}
