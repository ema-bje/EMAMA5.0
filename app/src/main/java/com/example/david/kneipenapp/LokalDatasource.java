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

    private static ArrayList<Lokal> lokalList = new ArrayList<>(); //the list where all bars will be stored

    public static void Main(String[] args) {
        build();
    }

    /**
     * makes all bars
     * @return the arrayList containing all Lokal-Items
     */
    public static ArrayList<Lokal> build() {
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
        return lokalList;
    }

    /**
     * Get the current version of the arrayList containing all bars
     * @return the current version of the arrayList containing all bars
     */
    public static ArrayList<Lokal> getLokalList() {
        return lokalList;
    }

    /**
     * filters the array list. Only the bars matching the number of stars given as parameter will
     * be returned
     * @param stars the number of stars by which the function filters
     * @return the ArrayList containing the bars matching the given number of stars
     */
    public static ArrayList<Lokal> filter(int stars) {
        if(stars == 0){
            return build();
        }

        ArrayList<Lokal> returnList = new ArrayList<Lokal>();

        for(int i = 0; i<lokalList.size();i++){
            if(lokalList.get(i).getStars()==stars){
                returnList.add(lokalList.get(i));
            }
        }

        return returnList;
    }

    public static int findResourceByKneipe(String name){
        int image = -1;
        for (int i=0; i<lokalList.size();i++){
            if(lokalList.get(i).getName().equals(name)){
                image = lokalList.get(i).getImageResource();
            }
        }
        return image;
    }
}
