package com.example.ktx.entity;

import javax.persistence.*;

@Entity
@Table (name = "extensions")
public class Extensions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "laundry")
    private Boolean laundry;

    @Column (name = "carpark")
    private Boolean carpark;

    @Column (name = "carrental")
    private Boolean carrental;

    @Column (name = "eating")
    private Boolean eating;

    public Extensions() {
    }

    public Extensions(Integer id, Boolean laundry, Boolean carpark, Boolean carrental, Boolean eating) {
        this.id = id;
        this.laundry = laundry;
        this.carpark = carpark;
        this.carrental = carrental;
        this.eating = eating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getLaundry() {
        return laundry;
    }

    public void setLaundry(Boolean laundry) {
        this.laundry = laundry;
    }

    public Boolean getCarpark() {
        return carpark;
    }

    public void setCarpark(Boolean carpark) {
        this.carpark = carpark;
    }

    public Boolean getCarrental() {
        return carrental;
    }

    public void setCarrental(Boolean carrental) {
        this.carrental = carrental;
    }

    public Boolean getEating() {
        return eating;
    }

    public void setEating(Boolean eating) {
        this.eating = eating;
    }
}
