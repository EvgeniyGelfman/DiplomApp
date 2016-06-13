package com.gelfman.diplomapp.classes;

/**
 * Created by eugene on 6/13/16.
 */
public class HouseParams {

    private float HouseSquare;            //Площа дома

    private float PriceForGCal;           //Ціна за гкал

    String heatSeason;                    //Отопительный сезон

    public HouseParams(float houseSquare, float priceForGCal, String heatSeason){
        this.heatSeason = heatSeason;
        this.HouseSquare = houseSquare;
        this.PriceForGCal = priceForGCal;
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

    private void setHeatSeason(String heatSeason){
        this.heatSeason = heatSeason;
    }

    private String getHeatSeason() {
        return this.heatSeason;
    }
}
