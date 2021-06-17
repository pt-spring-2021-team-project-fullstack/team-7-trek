package com.team7trek.trekDemo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String climate;

    public Region () {

    }

    public Region(String climate) {
        this.climate = climate;
    }
}
