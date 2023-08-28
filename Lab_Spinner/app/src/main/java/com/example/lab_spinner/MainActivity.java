package com.example.lab_spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Spinner spp;
    EditText et1, et2;
    TextView tv1, tv2, tv3;
    Button button1;
    float v1, v2;

    // Decimal format
    DecimalFormat df = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        spp = findViewById(R.id.spinner);

        tv3.setText("");
        String[] options = {"Suma", "Resta", "Multiplicacion", "Division", "Cubo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android
                .R.layout.simple_spinner_item, options);
        spp.setAdapter(adapter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selec = spp.getSelectedItem().toString();
                if (selec.equals("Suma")) {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();
                    v1 = Float.parseFloat(valor1);
                    v2 = Float.parseFloat(valor2);
                    float total = v1+v2;
                    tv3.setText("Suma: " + df.format(total));
                } else if (selec.equals("Resta")) {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();
                    v1 = Float.parseFloat(valor1);
                    v2 = Float.parseFloat(valor2);
                    float total = v1 - v2;
                    tv3.setText("Resta: " + df.format(total));
                } else if (selec.equals("Multiplicacion")) {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();
                    v1 = Float.parseFloat(valor1);
                    v2 = Float.parseFloat(valor2);
                    float total = v1 * v2;
                    tv3.setText("Producto: " + df.format(total));
                } else if (selec.equals("Division")) {
                    String valor1 = et1.getText().toString();
                    String valor2 = et2.getText().toString();
                    v1 = Float.parseFloat(valor1);
                    v2 = Float.parseFloat(valor2);
                    float total = v1 / v2;
                    //apply decimal format
                    tv3.setText("Cociente: " + df.format(total));
                } else if (selec.equals("Cubo")) {
                    String valor1 = et1.getText().toString();
                    v1 = Float.parseFloat(valor1);
                    float total = v1 * v1 * v1;
                    tv3.setText("Cubo: " + df.format(total));
                }
            }
        });

        spp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedItem = adapterView.getItemAtPosition(position).toString();
                System.out.println(selectedItem);
                if (selectedItem.equals("Cubo")) {
                    tv2.setVisibility(View.INVISIBLE);
                    et2.setVisibility(View.INVISIBLE);
                } else {
                    tv2.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
