package com.gelfman.diplomapp.fragments.calendar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.gelfman.diplomapp.R;

/**
 * Created by Admin on 26.04.2016.
 */
public class FragmentCalendar extends Fragment {

    private CalendarView calendarView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calendar, container, false);

        calendarView = (CalendarView) v.findViewById(R.id.cvCalendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getActivity(), dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_SHORT ).show();
            }
        });

        return v;
    }
}
