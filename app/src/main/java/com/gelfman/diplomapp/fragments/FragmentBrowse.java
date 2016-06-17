package com.gelfman.diplomapp.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.gelfman.diplomapp.R;
import com.gelfman.diplomapp.adapters.BrowseGridAdapter;

/**
 * Created by Admin on 21.05.2016.
 */
public class FragmentBrowse extends Fragment implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    private TextView info;

    private GridView gridView;

    private BrowseGridAdapter adapter;

    private Button btnAddCounter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("fragment browse", "created");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browse, container, false);

        gridView = (GridView) view.findViewById(R.id.gvGirdView);
        info = (TextView) view.findViewById(R.id.info);
        btnAddCounter = (Button) view.findViewById(R.id.btnAddCounter);
        adapter = new BrowseGridAdapter(getActivity());

        gridView.setAdapter(adapter);
        gridView.setOnItemSelectedListener(this);
//        gridView.setOnItemClickListener(gridviewOnItemClickListener);
        gridView.setOnItemClickListener(this);
        return view;
    }

   /* private GridView.OnItemClickListener gridviewOnItemClickListener = new GridView.OnItemClickListener(){
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           info.setText("You choose " + adapter.getItem(position));
           Log.d(adapter.getItem(position) + " clicked", "");
       }
    };*/

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        info.setText("You choose " + adapter.getItem(position));
        Log.d(adapter.getItem(position) + " clicked", "");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        info.setText("You choose " + adapter.getItem(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        info.setText("You choose nothing");
    }


}
