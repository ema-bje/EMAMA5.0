package com.example.david.kneipenapp;

import android.widget.ImageView;

/**
 * Created by David on 30.04.2015.
 */
public class Lokal {
    private String name;
    private String adress;
    private String typ;
    private ImageView image;

    public Lokal() {
    }

    public Lokal(String name, String adress, String typ, ImageView image) {
        this.name = name;
        this.adress = adress;
        this.typ = typ;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
