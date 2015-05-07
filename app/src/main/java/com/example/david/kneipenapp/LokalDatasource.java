package com.example.david.kneipenapp;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * This is the datasource Class for all Bars. It acts like a Database to set the Lokal-Entitiy Class
 * and can return either one of it or all of them in an array
 * Created by David on 30.04.2015.
 */
public class LokalDatasource {

    private Lokal lokal1;
    private Lokal lokal2;
    private Lokal lokal3;
    private ArrayList<Lokal> lokalList = new ArrayList<>();

    public LokalDatasource() {
        String name1 = "Alte Färbe";
        String address1 = "Allmendstraße 15";
        String typ1 = "Restaurant/Bar";
        int stars1 = 4;
        int imgres1 = R.drawable.alte_faerbe;

        String name2 = "Falkenbengel";
        String address2 = "Allmendstraße 1";
        String typ2 = "Bar";
        int stars2 = 3;
        int imgres2 = R.drawable.falkenbengel;

        String name3 = "Biercafé Engel";
        String address3 = "Baumannstraße 20";
        String typ3 = "Bar";
        int stars3 = 5;
        int imgres3 = R.drawable.biercafe_engel;

        lokal1 = new Lokal(name1, address1, typ1, stars1, imgres1);
        lokal2 = new Lokal(name2, address2, typ2, stars2, imgres2);
        lokal3 = new Lokal(name3, address3, typ3, stars3, imgres3);

        lokalList.add(lokal1);
        lokalList.add(lokal2);
        lokalList.add(lokal3);
    }



    public ArrayList<Lokal> getLokalList() {
        return lokalList;
    }

}
