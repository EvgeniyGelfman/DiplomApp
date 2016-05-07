package com.gelfman.diplomapp;


import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/**
 * Created by Admin on 02.05.2016.
 */
public class FragmentMain extends Fragment implements  ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener{

    private RadioGroup radiogroup;

    private ViewPager vp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        vp = (ViewPager) v.findViewById(R.id.viewPager);
        vp.setAdapter(new SwipeAdapter(getFragmentManager()));
        vp.addOnPageChangeListener(this);

        radiogroup = (RadioGroup) v.findViewById(R.id.radiogroup);
        radiogroup.setOnCheckedChangeListener(this);

        return v;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                radiogroup.check(R.id.radioButton1);
                break;
            case 1:
                radiogroup.check(R.id.radioButton2);
                break;
            case 2:
                radiogroup.check(R.id.radioButton3);
                break;
            default:
                radiogroup.check(R.id.radioButton1);
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.radioButton1:
                vp.setCurrentItem(0);
                break;
            case R.id.radioButton2:
                vp.setCurrentItem(1);
                break;
            case R.id.radioButton3:
                vp.setCurrentItem(2);
                break;
        }

    }
}
