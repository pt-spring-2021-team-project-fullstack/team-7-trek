package com.team7trek.trekDemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String difficulty;
    private String description;
    private String review;
    private String image;
    @ManyToOne
    private Continent continent;
    @ManyToMany
    private Collection<Region> regions;

    public Long getId() {
    return id;
}
    public Trek() {

    }
    public Trek(String image,String title, String difficulty, String description, Continent continent, String review, Region...regions) {
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.continent = continent;
        this.review = review;
        this.image = image;
        this.regions = new ArrayList<>(Arrays.asList(regions));
    }

    public String getTitle() {
        return title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDescription() {
        return description;
    }

    public String getReview() {
        return review;
    }

    public String getImage() {
        return image;
    }

    public Continent getContinent() {
        return continent;
    }

    public Collection<Region> getRegions() {
        return regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}