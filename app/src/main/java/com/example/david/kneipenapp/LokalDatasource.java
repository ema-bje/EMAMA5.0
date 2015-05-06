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
    private ArrayList<Lokal> lokalList = new ArrayList<Lokal>();

    public LokalDatasource(Context context) {
        String name1 = "Alte F#rbe";
        String adress1 = "Allmendstraße 15";
        String typ1 = "Restaurant/Bar";
        ImageView image1 = new ImageView(context);
        image1.setImageResource(R.drawable.alte_faerbe);

        String name2 = "Falkenbengel";
        String adress2 = "Allmendstraße 1";
        String typ2 = "Bar";
        ImageView image2 = new ImageView(context);
        image2.setImageResource(R.drawable.falkenbengel);

        String name3 = "Biercafé Engel";
        String adress3 = "Baumannstraße 20";
        String typ3 = "Bar";
        ImageView image3 = new ImageView(context);
        image3.setImageResource(R.drawable.biercafe_engel);

        lokal1 = new Lokal(name1, adress1, typ1, image1);
        lokal2 = new Lokal(name2, adress2, typ2, image2);
        lokal3 = new Lokal(name3, adress3, typ3, image3);

        lokalList.add(lokal1);
        lokalList.add(lokal2);
        lokalList.add(lokal3);
    }



    public ArrayList<Lokal> getLokalList() {
        return lokalList;
    }

    public Lokal getLokal1() {
        return lokal1;
    }

    public Lokal getLokal2() {
        return lokal2;
    }

    public Lokal getLokal3() {
        return lokal3;
    }
}
