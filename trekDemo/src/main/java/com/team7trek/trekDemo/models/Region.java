package com.team7trek.trekDemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String climate;
    private String image;
    @ManyToOne
    private Continent continent;
    @OneToMany(mappedBy = "region")
    private Collection<Trek> treks;
    public Region(){}
    public Region(String title,String climate, String image, Continent continent,Trek... treks) {
        this.continent = continent;
        this.treks = new ArrayList<>(Arrays.asList(treks));
        this.title = title;
        this.climate = climate;
        this.image = image;
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getClimate() {
        return climate;
    }
    public String getImage() {
        return image;
    }
    public Collection<Trek> getTreks(){
        return treks;
    }
    public Continent getContinent() {
        return continent;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
