package com.gelfman.diplomapp.classes;

import java.util.ArrayList;

/**
 * Created by Admin on 01.05.2016.
 */
public class Counter {

    private String name;

    private String model;

    private String info;

    private float coordinates;

    private ArrayList<Dimensions> dimension;

    public Counter(String name){
        this.name = name;
    }

    public Counter(String name, String model){
        this.name = name;
        this.model = model;
    }

    public Counter(String name, String model, String info){
        this.name = name;
        this.model = model;
        this.info = info;
    }

    public Counter(String name, String model, String info, float coordinates){
        this.name = name;
        this.model = model;
        this.info = info;
        this.coordinates = coordinates;
    }

    public Counter(String name, String model, String info, ArrayList<Dimensions> dimension){
        this.name = name;
        this.model = model;
        this.info = info;
        this.dimension = dimension;
    }
}