package com.gelfman.diplomapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gelfman.diplomapp.R;
import com.gelfman.diplomapp.classes.Counter;
import com.gelfman.diplomapp.classes.CounterProvider;

public class AddCounterActivity extends AppCompatActivity {

    private EditText etCounterName;

    private EditText etCounterModel;

    private EditText etCounterInfo;

    private EditText etCounterCoord;

    private Button btnSaveCounter;

    private Counter newCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_counter);

        etCounterName = (EditText) findViewById(R.id.etCounterName);
        etCounterModel = (EditText) findViewById(R.id.etCounterModel);
        etCounterInfo = (EditText) findViewById(R.id.etCounterInfo);
        etCounterCoord = (EditText) findViewById(R.id.etCounterCoord);
        btnSaveCounter = (Button) findViewById(R.id.btnSaveCounter);

        btnSaveCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCounter();
            }
        });

    }

    private boolean saveCounter() {
        if (etCounterName.getText().toString().trim().equals("")){
            Toast.makeText(this, "Please write counter name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etCounterModel.getText().toString().trim().equals("")){
            Toast.makeText(this, "Please write counter model", Toast.LENGTH_SHORT).show();
            return false;
        }

        newCounter = new Counter(etCounterName.getText().toString(), etCounterModel.getText().toString());
        CounterProvider.getInstance().addCounter(newCounter);
        startMainActivity();
        return true;
    }

    private void startMainActivity() {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}
