package com.example.Pogonyalo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "prisoners")
public class Prisoner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pogonyalo;
    private int yearsToGetOut;
    public Prisoner(String pogonyalo, int yearsToGetOut) {
        this.pogonyalo = pogonyalo;
        this.yearsToGetOut = yearsToGetOut;
    }

    public String getPogonyalo() {
        return pogonyalo;
    }

    public void setPogonyalo(String pogonyalo) {
        this.pogonyalo = pogonyalo;
    }

    public int getYearsToGetOut() {
        return yearsToGetOut;
    }

    public void setYearsToGetOut(int yearsToGetOut) {
        this.yearsToGetOut = yearsToGetOut;
    }
}
