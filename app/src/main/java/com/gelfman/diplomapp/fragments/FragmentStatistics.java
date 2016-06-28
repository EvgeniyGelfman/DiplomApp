package com.gelfman.diplomapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gelfman.diplomapp.R;
import com.gelfman.diplomapp.classes.Dimensions;

/**
 * Created by Admin on 07.05.2016.
 */
public class FragmentStatistics extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_statistics, container, false);

        TextView heatAmountLast = (TextView) v.findViewById(R.id.tvHeatAmountLast);
//        heatAmountLast.setText(Float.toString(Dimensions.getInstance().getHeatAmount()));

        return v;
    }
}
