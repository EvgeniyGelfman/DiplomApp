package com.gelfman.diplomapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gelfman.diplomapp.fragments.InsertData.FragmentFirst;
import com.gelfman.diplomapp.fragments.InsertData.FragmentSecond;
import com.gelfman.diplomapp.fragments.calendar.FragmentCalendar;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity implements FragmentFirst.IFirstFragmentAction, FragmentSecond.ISecondFragmentAction, ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {

    private BottomBar mBottomBar;

    private TextView mMessageView;

    private RadioGroup radiogroup;

    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentMain fragmentMain = new FragmentMain();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.flFragmentContainer, fragmentMain, "firstFragment");
        ft.commit();

        vp = (ViewPager) findViewById(R.id.viewPager);
        vp.setAdapter(new SwipeAdapter(getSupportFragmentManager()));
        vp.addOnPageChangeListener(this);

        radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        radiogroup.setOnCheckedChangeListener(this);



        /*mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.bottombar_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch ( menuItemId ){
                    case (R.id.bb_menu_inputData):
                        switchFragment(new FragmentFirst());
                        break;
                    case (R.id.bb_menu_Expences):
                        switchFragment(new FragmentFirst());
                        break;
                    case (R.id.bb_menu_Calendar):
                        switchFragment(new FragmentCalendar());
                        break;
                      case (R.id.bb_menu_Analytics):
                          switchFragment(new FragmentCalendar());
                          break;

              }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.bb_menu_inputData) {
                    // The user reselected item number one, scroll your content to top.
                }
            }
        });

        // Setting colors for different tabs when there's more than three of them.
        // You can set colors for tabs in three different ways as shown below.
        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorAccent));
        mBottomBar.mapColorForTab(1, 0xFF5D4037);
        mBottomBar.mapColorForTab(2, "#7B1FA2");*/

    }

   /* private void switchFragment(Fragment fragment) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flFragmentContainer, fragment)
                    .addToBackStack(null)
                    .commit();
    }

    private boolean isLoaded(Fragment fragment) {
        if ( fragment.isInLayout())
            return true;
        return false;
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Necessary to restore the BottomBar's state, otherwise we would
        // lose the current tab on orientation change.
        mBottomBar.onSaveInstanceState(outState);
    }*/

    @Override
    public void onButtonClick() {
        FragmentSecond fragmentSecond = new FragmentSecond();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.flFragmentContainer, fragmentSecond, "secondFragment");
        ft.commit();
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
