package com.example.laboratorio4e;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText num1,num2;
    private TextView tvres;
    private RadioButton rb1,rb2;
    // private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        tvres=findViewById(R.id.tvres);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1=num1.getText().toString();
                String valor2=num2.getText().toString();
                int nro1=Integer.parseInt(valor1);
                int nro2=Integer.parseInt(valor2);
                int suma=nro1+nro2;
                String resu=String.valueOf(suma);
                tvres.setText("Resultado="+resu);
            }
        });

        rb2.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view) {
            String valor1=num1.getText().toString();
            String valor2=num2.getText().toString();
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tvres.setText("Resultado="+resu);
        }
        });
    }
}