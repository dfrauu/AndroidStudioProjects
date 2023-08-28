package com.example.laboratorio5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView tv3;
    private CheckBox cb1, cb2, cb3, cb4;
    private Button submit;
    private float sum;
    private String result = "";
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);
        cb4 = (CheckBox)findViewById(R.id.cb4);
        tv3 = findViewById(R.id.tv3);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sum = 0;
                if (cb1.isChecked()) {sum = sum + 3;}
                if (cb2.isChecked()) { sum = sum + 4;}
                if (cb3.isChecked()) { sum = (float) (sum + 3.5);}
                if (cb4.isChecked()) { sum = (float) (sum + 1.5);}
                result=" Total: B/. " + df.format(sum);
                tv3.setText(result);
            }
        });
    }
}