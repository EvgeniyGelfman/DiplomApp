package com.gelfman.diplomapp.classes;

import java.util.ArrayList;

/**
 * Created by eugene on 6/13/16.
 */
public class CounterProvider {

    private static CounterProvider mInstance = null;

    private ArrayList<Counter> counterList;

    private CounterProvider() {
        counterList = new ArrayList<>();
    }

    public static CounterProvider getInstance(){
        if (mInstance == null) {
            mInstance = new CounterProvider();
        }
        return mInstance;
    }

    public ArrayList<Counter> getCounterList() {
        return counterList;
    }

    public void setCounterList(ArrayList<Counter> counterList) {
        this.counterList = counterList;
    }

    public Counter getCounter(int index) {
        return counterList.get(index);
    }

    public void setCounter(int index, Counter counter) {
        counterList.set(index, counter);
    }

    public void addCounter(Counter counter) {
        counterList.add(counter);
    }

    public int getCounterSize() {
        return counterList.size();
    }
}

