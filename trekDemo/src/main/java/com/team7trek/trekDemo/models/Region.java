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
    private String image;

    public Long getId() {
        return id;
    }

    public String getClimate() {
        return climate;
    }

    public String getImage() {
        return image;
    }

    public Region () {

    }

    public Region(String climate,String image) {
        this.climate = climate;
        this.image = image;
    }


    public Region(String northAmerica1, String image, String climate, Continent northAmerica) {
    }
}
