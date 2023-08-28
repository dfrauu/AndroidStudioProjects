package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Spinner spp;
    CheckBox cb1;
    Button button1;
    TextView tv4;

    // Decimal format
    DecimalFormat df = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        spp = findViewById(R.id.spinner);
        cb1 = findViewById(R.id.cb1);
        button1 = findViewById(R.id.button1);
        tv4 = findViewById(R.id.tv4);

        tv4.setText("Total a pagar: ");

        String[] options = {"Regular", "Jubilado"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android
                .R.layout.simple_spinner_item, options);
        spp.setAdapter(adapter);

        button1.setOnClickListener(view -> {
            float precio = Float.parseFloat(et1.getText().toString());
            String selec = spp.getSelectedItem().toString();
            float factor = 1;

            if (selec.equals("Jubilado")) {
                factor = (float) (factor - 0.2);
            }

            if (cb1.isChecked()) {
                factor = (float) (factor + 0.07);
            }

            String total = df.format(precio * factor);
            // Turn total into a string

            tv4.setText("Total a pagar: B/. " + total);
        }

        );
    }
}