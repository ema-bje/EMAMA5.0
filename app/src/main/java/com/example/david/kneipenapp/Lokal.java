package com.example.david.kneipenapp;

public class Lokal {
    private String name;
    private String address;
    private String typ;
    private int stars;
    private int imageResource;

    public Lokal(String name, String address, String typ, int stars, int imageResource) {
        this.name = name;
        this.address = address;
        this.typ = typ;
        this.stars = stars;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTyp() {
        return typ;
    }

    public int getStars() {
        return stars;
    }

    public int getImageResource() {
        return imageResource;
    }

}
