package com.gelfman.diplomapp.fragments.InsertData;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gelfman.diplomapp.classes.Dimensions;
import com.gelfman.diplomapp.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by Admin on 16.04.2016.
 */
public class FragmentFirst extends Fragment {

    private TextView tvHeader, tvDate, tvTime;

    private EditText etHeatAmount, etHeatConsuption, etHeatPower;

    private Button addData;

    private IFirstFragmentAction fragmentActionListener;

    private Dimensions dimensions;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvHeader = (TextView) view.findViewById(R.id.tvHeader);
        tvDate   = (TextView) view.findViewById(R.id.tvCurrentDate);
        tvTime   = (TextView) view.findViewById(R.id.tvCurrentTime);

        etHeatAmount = (EditText) view.findViewById(R.id.etHeatAmount);
        etHeatConsuption = (EditText) view.findViewById(R.id.etHeatTransferConsumption);
        etHeatPower =  (EditText) view.findViewById(R.id.etHeatPower);

       /* addData = (Button) view.findViewById(R.id.btnToSecondFragment);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              *//*  fragmentActionListener = (IFirstFragmentAction) getActivity();
                fragmentActionListener.onButtonClick();*//*
                addData();
            }
        });*/

        etHeatAmount.setTag(1);
        etHeatConsuption.setTag(2);
        etHeatPower.setTag(3);

        View.OnFocusChangeListener listener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
//                if(!hasFocus)
//                    addToDimension((int)v.getTag());
            }
        };

        etHeatAmount.setOnFocusChangeListener(listener);
        etHeatConsuption.setOnFocusChangeListener(listener);
        etHeatPower.setOnFocusChangeListener(listener);

        /* Date and Time */
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String newDate = dateFormat.format(calendar.getTime());

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm a");
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String newTime = timeFormat.format(calendar.getTime());
        tvDate.setText(newDate);
        tvTime.setText(newTime);

        return view;
    }

//    private void addToDimension(int tag) {
//       switch (tag){
//           case 1:
//               if (etHeatAmount.getText().length() != 0)
//                    Dimensions.getInstance()
//                            .setHeatAmount(Float.valueOf(etHeatAmount.getText().toString()));
//               break;
//           case 2:
//               if (etHeatConsuption.getText().length() != 0)
//                    Dimensions.getInstance()
//                            .setHeatConsumption(Float.valueOf(etHeatConsuption.getText().toString()));
//               break;
//           case 3:
//               if (etHeatPower.getText().length() != 0)
//                    Dimensions.getInstance()
//                            .setHeatPower(Float.valueOf(etHeatPower.getText().toString()));
//               break;
//       }
//    }

    /*private void addData() {
        float heatAmount = 0,
              heatConsumption = 0,
              heatPower = 0;
        try {
            heatAmount =  Float.parseFloat(etHeatAmount.getText().toString());
        } catch (NumberFormatException e) {
            Log.d("not a valid number", String.valueOf(e));
        }

        try {
            heatConsumption = Float.parseFloat(etHeatConsuption.getText().toString());
        } catch (NumberFormatException e) {
            Log.d("not a valid number", String.valueOf(e));
        }

        try {
            heatPower = Float.parseFloat(etHeatPower.getText().toString());
        } catch (NumberFormatException e) {
            Log.d("not a valid number", String.valueOf(e));
        }

//        dimensions = new Dimensions();
//        dimensions.heatDimensions(heatAmount, heatConsumption, heatPower);
    }*/

    public static Fragment newInstance(String text) {
        FragmentFirst f = new FragmentFirst();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);
        return f;
    }

    public interface IFirstFragmentAction {
        void onButtonClick();
    }
}
