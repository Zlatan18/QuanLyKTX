package com.example.ktx.entity;

import javax.persistence.*;

@Entity
@Table (name = "tblzoom")
public class Zoom {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "mazoom")
    private String maZoom;

    @Column (name = "typezoom")
    private String typeZoom;

    @Column (name = "pricezoom")
    private String priceZoom;

    @Column (name = "humanzoom")
    private String humanZoom;

    public Zoom() {
    }

    public Zoom(Long id, String maZoom, String typeZoom, String priceZoom, String humanZoom) {
        this.id = id;
        this.maZoom = maZoom;
        this.typeZoom = typeZoom;
        this.priceZoom = priceZoom;
        this.humanZoom = humanZoom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaZoom() {
        return maZoom;
    }

    public void setMaZoom(String maZoom) {
        this.maZoom = maZoom;
    }

    public String getTypeZoom() {
        return typeZoom;
    }

    public void setTypeZoom(String typeZoom) {
        this.typeZoom = typeZoom;
    }

    public String getPriceZoom() {
        return priceZoom;
    }

    public void setPriceZoom(String priceZoom) {
        this.priceZoom = priceZoom;
    }

    public String getHumanZoom() {
        return humanZoom;
    }

    public void setHumanZoom(String humanZoom) {
        this.humanZoom = humanZoom;
    }
}
