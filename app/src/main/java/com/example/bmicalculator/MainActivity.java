package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight =findViewById(R.id.Weight);
        height =findViewById(R.id.Height);
        calculate =findViewById(R.id.calculate_btn);
        result = findViewById(R.id.Ans);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float h = Float.parseFloat(height.getText().toString());
                float w = Float.parseFloat(weight.getText().toString());


                calculate.setText("sum = "+(w/((h/100)*(h/100))));
            }
        });


    }
}

