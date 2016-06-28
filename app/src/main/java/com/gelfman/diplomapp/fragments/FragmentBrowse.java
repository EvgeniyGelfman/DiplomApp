package com.gelfman.diplomapp.fragments;

import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gelfman.diplomapp.R;
import com.gelfman.diplomapp.activities.AddCounterActivity;
import com.gelfman.diplomapp.adapters.BrowseGridAdapter;
import com.gelfman.diplomapp.adapters.CounterAdapter;
import com.gelfman.diplomapp.classes.Counter;
import com.gelfman.diplomapp.classes.CounterProvider;

import org.xml.sax.ContentHandler;

/**
 * Created by Admin on 21.05.2016.
 */
public class FragmentBrowse extends Fragment implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    private TextView info;

    private GridView gridView;

    private BrowseGridAdapter adapter;

    private Button btnAddCounter;

    private ListView lvCounterList;

    private CounterAdapter counterAdapter;

    final String[] catnames = new String[] {
      "bitch", "dragula"
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("fragment browse", "created");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browse, container, false);

//        gridView = (GridView) view.findViewById(R.id.gvGirdView);
        info = (TextView) view.findViewById(R.id.info);
        btnAddCounter = (Button) view.findViewById(R.id.btnAddCounter);
        lvCounterList = (ListView) view.findViewById(R.id.lvCounterList);
        adapter = new BrowseGridAdapter(getActivity());

        counterAdapter = new CounterAdapter(getContext(), CounterProvider.getInstance().getCounterList());
        lvCounterList.setAdapter(counterAdapter);

       /* ArrayAdapter<Counter> listAdapter = new ArrayAdapter<Counter>(getActivity(),
                android.R.layout.simple_list_item_1,
                CounterProvider.getInstance().getCounterList()
        );
        lvCounterList.setAdapter(listAdapter);*/

//        gridView.setAdapter(adapter);
//        gridView.setOnItemSelectedListener(this);
////        gridView.setOnItemClickListener(gridviewOnItemClickListener);
//        gridView.setOnItemClickListener(this);
        btnAddCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createCounterActivity();
            }
        });
        return view;
    }

    private void createCounterActivity() {
        Intent in = new Intent(getActivity(), AddCounterActivity.class);
        this.startActivityForResult(in, 1);
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
