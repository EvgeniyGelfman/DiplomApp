package com.gelfman.diplomapp;

/**
 * Created by Admin on 01.05.2016.
 */
public class Dimensions {
    private static Dimensions instance;

    private float HeatAmount;

    private float HeatConsumption;

    private float HeatPower;

    private float InnerTemp;

    private float OuterTemp;

    private float HouseSquare;

    private float PriceForGCal;

    private Dimensions(){}

    private void setHeatAmount(float ha){
        this.HeatAmount = ha;
    }

    private float getHeatAmount(){
        return this.HeatAmount;
    }

    private void setHeatConsumption(float hc){
        this.HeatConsumption = hc;
    }

    private float getHeatConsumption(){
        return this.HeatConsumption;
    }

    private void setHeatPower(float hp){
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

    private void setHouseSquare(float hs){
        this.HouseSquare = hs;
    }

    private float getHouseSquare(){
        return this.HouseSquare;
    }

    private void setPriceForGCal(float pgc){
        this.PriceForGCal = pgc;
    }

    private float getPriceForGCal(){
        return this.PriceForGCal;
    }
}
