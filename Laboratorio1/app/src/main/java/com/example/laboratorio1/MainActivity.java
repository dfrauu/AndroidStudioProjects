package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText base, height;
    Button submit;
    ImageView aid;
    TextView result;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final DecimalFormat dfx = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = findViewById(R.id.base);
        height = findViewById(R.id.height);
        aid = findViewById(R.id.aid);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float tb = Float.parseFloat(base.getText().toString());
                float th = Float.parseFloat(height.getText().toString());

                float area = tb * th / 2;

                String r = String.valueOf(area);

                result.setText("Area del triangulo: "+df.format(area));
            }
        });
    }
}