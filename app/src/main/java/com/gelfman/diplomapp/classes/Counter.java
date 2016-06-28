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

    private ArrayList<Dimensions> dimensions;

    public Counter(String name){
        this.name = name;
    }

    public Counter(String name, String model){
        this.name = name;
        this.model = model;
        dimensions = new ArrayList<>();
    }

    public Counter(String name, String model, String info){
        this.name = name;
        this.model = model;
        this.info = info;
        dimensions = new ArrayList<>();
    }

    public Counter(String name, String model, String info, float coordinates){
        this.name = name;
        this.model = model;
        this.info = info;
        this.coordinates = coordinates;
        dimensions = new ArrayList<>();
    }

    public Counter(String name, String model, String info, ArrayList<Dimensions> dimension){
        this.name = name;
        this.model = model;
        this.info = info;
        this.dimensions = dimension;
        dimensions = new ArrayList<>();
    }

    public void addDimension (Dimensions dimension) {
        dimensions.add(dimension);
    }

    public String getName() { return  this.name; };

    public String getModel() { return this.model; };

    public String getInfo() { return this.info; };

    public float getCoords() { return this.coordinates; };

}