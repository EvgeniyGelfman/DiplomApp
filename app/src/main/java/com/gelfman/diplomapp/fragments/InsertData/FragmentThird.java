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
 * Created by Admin on 23.04.2016.
 */
public class FragmentThird extends Fragment {
    private TextView tvHeader;

    private EditText etSquare, etPrice;

    private Button btnSave;

    private IThirdFragmentAction fragmentActionListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        tvHeader = (TextView) view.findViewById(R.id.tvHeader);

        etSquare = (EditText) view.findViewById(R.id.etSquare);
        etPrice = (EditText) view.findViewById(R.id.etPrice);

        btnSave = (Button) view.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentActionListener = (IThirdFragmentAction) getActivity();
                fragmentActionListener.onButtonClick();
            }
        });
        return view;
    }

    public static Fragment newInstance(String text) {
        FragmentThird f = new FragmentThird();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);
        return f;
    }

    public interface IThirdFragmentAction {
        void onButtonClick();
    }
}
