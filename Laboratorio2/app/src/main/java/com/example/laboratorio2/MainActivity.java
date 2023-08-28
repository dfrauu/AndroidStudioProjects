package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText co1, co2, co3;
    Button submit;
    ImageView aid1;
    ImageView aid2;
    TextView result;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final DecimalFormat dfx = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        co1 = findViewById(R.id.co1);
        co2 = findViewById(R.id.co2);
        co3 = findViewById(R.id.co3);
        aid1 = findViewById(R.id.aid1);
        aid2 = findViewById(R.id.aid2);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(co1.getText().toString());
                float b = Float.parseFloat(co2.getText().toString());
                float c = Float.parseFloat(co3.getText().toString());

                double discriminant = Math.pow(b, 2) - (4 * a * c);
                double root = (-b + Math.sqrt(discriminant) ) / (2 * a);
                String response = "Discriminante = "+df.format(discriminant)+"\n";

                if(discriminant > 0) {
                    double root1 = (-b - Math.sqrt(discriminant) ) / (2 * a);
                    response += "\nDos raices reales:\nx1 = "+df.format(root)+"\nx2 = "+df.format(root1);
                } else if(discriminant == 0) {
                    response += "\nUnica raiz real:\nx = "+df.format(root);
                } else {
                    response += "\nNo hay raices reales.";
                }

                result.setText(response);
            }
        });
    }
}