package com.gelfman.diplomapp.classes;

import java.util.Date;

/**
 * Created by Admin on 01.05.2016.
 */
public class Dimensions {

    private static Dimensions instance = null;

    /* first data */

    private float HeatAmount;             //Количество тепла

    private float flowingVolume;          //Протекающий объем

    private float HeatConsumption;        //Годиний расход теплоносія

    private float HeatPower;              //Теплова потужність

    /* second data */
    private float InnerTemp;              //Температура подачи

    private float OuterTemp;              //Температура обработки

    private Date date;

    private boolean isLast;

    private float tempStreet;             // temperatura ulyci

    public Dimensions(float HeatAmount, Date date) {
        this.HeatAmount = HeatAmount;
        this.date = date;
    }

    public Dimensions(float HeatAmount, float flowingVolume, Date date) {
        this.HeatAmount = HeatAmount;
        this.flowingVolume = flowingVolume;
        this.date = date;
    }

    public Dimensions(float HeatAmount, float HeatConsumption, float HeatPower, Date date) {
        this.HeatAmount = HeatAmount;
        this.HeatConsumption = HeatConsumption;
        this.HeatPower = HeatPower;
        this.date = date;
    }

    public Dimensions(float HeatAmount, float flowingVolume, float HeatConsumption, float HeatPower, Date date) {
        this.HeatAmount = HeatAmount;
        this.HeatConsumption = HeatConsumption;
        this.HeatPower = HeatPower;
        this.date = date;
    }

    public Dimensions(float HeatAmount, float flowingVolume, float HeatConsumption, float HeatPower, float innerTemp, float outerTemp, Date date) {
        this.HeatAmount = HeatAmount;
        this.HeatConsumption = HeatConsumption;
        this.HeatPower = HeatPower;
        this.InnerTemp = innerTemp;
        this.OuterTemp = outerTemp;
        this.date = date;
    }



//    public static Dimensions getInstance(){
//        if (instance == null)
//            instance = new Dimensions();
//        return instance;
//    }

    public void heatDimensions(float HeatAmount, float HeatConsumption, float HeatPower){
        this.HeatAmount = HeatAmount;
        this.HeatConsumption = HeatConsumption;
        this.HeatPower = HeatPower;
    }



    public void setHeatAmount(float ha){
        this.HeatAmount = ha;
    }

    public float getHeatAmount(){
        return this.HeatAmount;
    }

    public void setHeatConsumption(float hc){
        this.HeatConsumption = hc;
    }

    private float getHeatConsumption(){
        return this.HeatConsumption;
    }

    public void setHeatPower(float hp){
        this.HeatPower = hp;
    }

    private float getHeatPower(){
        return this.HeatPower;
    }

    private  void setInnerTemp(float it){
        this.InnerTemp = it;
    }

    private float getInnerTemp(){
        return this.InnerTemp;
    }

    private  void setOuterTemp(float ot){
        this.OuterTemp = ot;
    }

    private float getOuterTemp(){
        return this.OuterTemp;
    }

}
