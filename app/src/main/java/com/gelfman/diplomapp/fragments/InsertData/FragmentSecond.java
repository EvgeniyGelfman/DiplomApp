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
public class FragmentSecond extends Fragment {

    private TextView tvHeader, tvDate, tvTime;

    private EditText etInnerTemp, etOuterTemp;

    private Button btnToThird;

    private ISecondFragmentAction fragmentActionListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        tvHeader = (TextView) view.findViewById(R.id.tvHeader);
        tvDate   = (TextView) view.findViewById(R.id.tvCurrentDate);
        tvTime   = (TextView) view.findViewById(R.id.tvCurrentTime);

        etInnerTemp = (EditText) view.findViewById(R.id.etInnerTemp);
        etOuterTemp = (EditText) view.findViewById(R.id.etOuterTemp);

        btnToThird = (Button) view.findViewById(R.id.btnToThirdFragment);
        btnToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentActionListener = (ISecondFragmentAction) getActivity();
                fragmentActionListener.onButtonClick();
            }
        });

        return view;
    }

    public static Fragment newInstance(String text) {
        FragmentSecond f = new FragmentSecond();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);
        return f;
    }


    public interface ISecondFragmentAction {
        void onButtonClick();
    }
}
