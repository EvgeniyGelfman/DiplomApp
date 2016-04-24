package com.gelfman.diplomapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gelfman.diplomapp.fragments.FragmentFirst;
import com.gelfman.diplomapp.fragments.FragmentSecond;

public class MainActivity extends AppCompatActivity implements FragmentFirst.IFirstFragmentAction, FragmentSecond.ISecondFragmentAction {

    private BoottomBar boottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);




        FragmentFirst fragmentFirst = new FragmentFirst();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.flFragmentContainer, fragmentFirst, "firstFragment");
        ft.commit();

    }

    @Override
    public void onButtonClick() {
        FragmentSecond fragmentSecond = new FragmentSecond();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.flFragmentContainer, fragmentSecond, "secondFragment");
        ft.commit();
    }
}
