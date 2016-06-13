package com.gelfman.diplomapp.activities;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gelfman.diplomapp.R;
import com.gelfman.diplomapp.fragments.calendar.FragmentCalendar;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class CalendarActivity extends AppCompatActivity {

    private BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragmentContainer, new FragmentCalendar())
                .addToBackStack(null)
                .commit();
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.bottombar_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch ( menuItemId ){
                    case (R.id.bb_menu_inputData):
                        switchActivity(MainActivity.class);
                        break;
                    case (R.id.bb_menu_Statistics):
                        switchActivity(ExpencesActivity.class);
                        break;
                    case (R.id.bb_menu_Calendar):
                        switchActivity(CalendarActivity.class);
                        break;
                     /* case (R.id.bb_menu_Analytics):
                          switchActivity(new FragmentCalendar());
                          break;*/

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

    private void switchActivity(Class someClass) {
        Intent in = new Intent(this, someClass);
        startActivity(in);
    }

}
