package com.example.sphere;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Area_Result extends AppCompatActivity {
A
    TextView radio;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_result);

        result = findViewById(R.id.result);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String A = extras.getString("resultado");

            result.setText("Area de la esfera: "+A);
        }
    }
}