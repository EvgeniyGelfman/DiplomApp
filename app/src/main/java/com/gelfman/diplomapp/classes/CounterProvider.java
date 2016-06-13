package com.gelfman.diplomapp.classes;

import java.util.ArrayList;

/**
 * Created by eugene on 6/13/16.
 */
public class CounterProvider {

    private static CounterProvider instance = null;

    public static CounterProvider getInstance(){
        if (instance == null)
            instance = new CounterProvider();
        return instance;
    }

}
