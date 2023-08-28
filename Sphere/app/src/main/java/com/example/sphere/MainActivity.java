package com.example.sphere;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import android.content.Intent;


// Use intent to capture the radius input, transfer it to the second activity and calculate the area of the sphere

public class MainActivity extends AppCompatActivity {
    EditText radius;
    Button submit;
    ImageView aid;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radius = findViewById(R.id.radius);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float radio = Float.parseFloat(radius.getText().toString());
                final float PI = (float) 3.1415926;
                float area = (float) (4 * PI * Math.pow(radio, 2));

                Intent myIntent = new Intent(MainActivity.this, Area_Result.class);
                myIntent.putExtra("resultado", df.format(area));
                startActivity(myIntent);
            }
        });
    }
}