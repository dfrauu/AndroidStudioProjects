package com.example.lab_sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String CED="" ;
    public static final String FECHA="";
    private EditText et1, et2;
    Button btg, btb, bta, btr;
    TextView txt1, txt2;
    String cedula="";
    String fecha="";
    String nuevo="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btg=findViewById(R.id.btg);
        btb= findViewById(R.id.btb);
        bta= findViewById(R.id.bte);
        btr= findViewById(R.id.btr);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        txt1= findViewById(R.id.txt1);
        txt2= findViewById(R.id.txt2);
        btg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                cedula = et1.getText().toString();
                fecha = et2.getText().toString();
                SharedPreferences.Editor editor = preferencias.edit();
                editor.putString("cedula", cedula);
                editor.putString("fecha", fecha);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Grabado", Toast.LENGTH_SHORT).show();
            }
        });
        btr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                cedula = preferencias.getString("cedula", "No existe cedula!");
                fecha = preferencias.getString("fecha", "No existe fecha!");
                // Use hints
                et1.setText(cedula);
                et2.setText(fecha);
            }
        });
        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencias.edit();
                editor.clear();
                Toast.makeText(getApplicationContext(),"preferencias Borradas", Toast.LENGTH_SHORT).show();
                editor.commit();
            }
        });
        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                cedula = et1.getText().toString();
                fecha = et2.getText().toString();
                SharedPreferences.Editor editor = preferencias.edit();
                editor.putString("cedula", cedula);
                editor.putString("fecha", fecha);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Cambios realizados",Toast.LENGTH_SHORT).show();
            }
        });
    }
}