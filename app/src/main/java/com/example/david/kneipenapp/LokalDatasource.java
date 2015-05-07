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

    private ArrayList<Lokal> lokalList = new ArrayList<>();

    public LokalDatasource() {

        String[] names = {
                "Alte Färbe",
                "Falkenbengel",
                "Biercafe Engel",
                "Cop Bar",
                "Irish Pub",
                "The Golden Loon",
                "Gasthaus Dogfood",
                "Hard Rock Cafe",
        };

        String[] addresses = {
                "Allmendstraße 15",
                "Allmendstraße 1",
                "Baumannstraße 20",
                "Baumannstraße 11",
                "Baumannstraße 11",
                "Baumannstraße 11",
                "Baumannstraße 11",
                "Baumannstraße 11",
        };

        String[] types = {
                "Restaurant/Bar",
                "Bar",
                "Bar",
                "Gasthaus",
                "Pub",
                "Gasthaus",
                "Bar",
                "Pub"
        };

        int[] ratings = {
                4,
                3,
                5,
                3,
                3,
                3,
                3,
                3
        };

        int[] imgresources = {
                R.drawable.alte_faerbe,
                R.drawable.falkenbengel,
                R.drawable.biercafe_engel,
                R.drawable.falkenbengel,
                R.drawable.falkenbengel,
                R.drawable.falkenbengel,
                R.drawable.falkenbengel,
                R.drawable.falkenbengel,
        };

        for (int i=0;i<names.length;i++) {
            lokalList.add(new Lokal(names[i], addresses[i], types[i], ratings[i], imgresources[i]));
        }
    }

    public ArrayList<Lokal> getLokalList() {
        return lokalList;
    }

    public ArrayList<Lokal> filter(int stars) {
        ArrayList<Lokal> returnList = new ArrayList<Lokal>();
        return returnList;
    }
}
