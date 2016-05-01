package com.gelfman.diplomapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.IdRes;
import android.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.gelfman.diplomapp.fragments.InsertData.FragmentFirst;
import com.gelfman.diplomapp.fragments.InsertData.FragmentSecond;
import com.gelfman.diplomapp.fragments.calendar.FragmentCalendar;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity implements FragmentFirst.IFirstFragmentAction, FragmentSecond.ISecondFragmentAction {

    private BottomBar mBottomBar;

    private TextView mMessageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentFirst fragmentFirst = new FragmentFirst();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.flFragmentContainer, fragmentFirst, "firstFragment");
        ft.commit();

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.bottombar_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch ( menuItemId ){
                      case (R.id.bb_menu_Calendar):
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
        mBottomBar.mapColorForTab(2, "#7B1FA2");

    }

    private void switchFragment(android.app.Fragment fragment) {
            getFragmentManager().beginTransaction()
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
