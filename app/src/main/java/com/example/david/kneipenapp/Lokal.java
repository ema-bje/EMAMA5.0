package com.example.david.kneipenapp;

import android.media.Image;
import android.widget.ImageView;

/**
 * This is the Entity Class of a bar. It contains information about its name, address, type, rating and its image.
 */
public class Lokal {
    private String name;
    private String address;
    private String typ;
    private int stars;
    private int image;

    public Lokal(String name, String address, String typ, int stars, int image) {
        this.name = name;
        this.address = address;
        this.typ = typ;
        this.stars = stars;
        this.image = image;
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
        return image;
    }

}
