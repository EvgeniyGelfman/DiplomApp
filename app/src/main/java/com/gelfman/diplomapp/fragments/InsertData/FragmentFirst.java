package com.gelfman.diplomapp.fragments.InsertData;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gelfman.diplomapp.R;

/**
 * Created by Admin on 16.04.2016.
 */
public class FragmentFirst extends Fragment {

    private TextView tvHeader, tvDate, tvTime;

    private EditText etHeatAmount, etHeatConsuption, etHeatPower;

    private Button btnToSecond;

    private IFirstFragmentAction fragmentActionListener;

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

        btnToSecond = (Button) view.findViewById(R.id.btnToSecondFragment);
        btnToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentActionListener = (IFirstFragmentAction) getActivity();
                fragmentActionListener.onButtonClick();
            }
        });
        return view;
    }

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
