package com.gelfman.diplomapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gelfman.diplomapp.R;
import com.gelfman.diplomapp.classes.Counter;
import com.gelfman.diplomapp.classes.CounterProvider;

import java.util.ArrayList;

/**
 * Created by Admin on 25.06.2016.
 */
public class CounterAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Counter> counters;

    public CounterAdapter(Context context, ArrayList<Counter> counters) {
        this.context = context;
        this.counters = counters;
    }

    @Override
    public int getCount() {
        return counters.size();
    }

    @Override
    public Object getItem(int position) {
        return counters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.counter_listitem, parent, false);

        TextView counterName = (TextView) convertView.findViewById(R.id.tvCounterName);
        counterName.setText(counters.get(position).getName());

        TextView counterModel = (TextView) convertView.findViewById(R.id.tvCounterModel);
        counterModel.setText(counters.get(position).getModel());

        TextView counterInfo = (TextView) convertView.findViewById(R.id.tvCounterInfo);
        counterInfo.setText(counters.get(position).getInfo());
/*
        TextView counterCoords = (TextView) convertView.findViewById(R.id.tvCounterCoord);
        counterCoords.setText(toString(counters.get(position).getCoords()));*/

        return convertView;
    }
}
