package com.gelfman.diplomapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.gelfman.diplomapp.fragments.InsertData.FragmentFirst;
import com.gelfman.diplomapp.fragments.InsertData.FragmentSecond;
import com.gelfman.diplomapp.fragments.InsertData.FragmentThird;

/**
 * Created by Admin on 01.05.2016.
 */
public class SwipeAdapter extends FragmentPagerAdapter {

    private static final int NUMBER_OF_PAGES = 3;


    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragmentFirst.newInstance("FirstFragment, Instance 1");
            case 1:
                return FragmentSecond.newInstance("SecondFragment, Instance 1");
            case 2:
                return FragmentThird.newInstance("ThirdFragment, Instance 1");
            default:
                return  FragmentFirst.newInstance("FirstFragment, Default");
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_PAGES;
    }
}
