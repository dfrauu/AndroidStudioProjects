package com.example.laboratorio6;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listadatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listadatos = (ListView) findViewById(R.id.lsdatos);
        Lista = new ArrayList<Datos>();

        Lista.add(new Datos(1, "1. Asma", "Enfermedad crónica que causa inflamación y estrechamiento de las vías respiratorias, lo que dificulta la respiración.", R.drawable.disease1));
        Lista.add(new Datos(2, "2. Neumonía", "Infección en los pulmones generalmente causada por bacterias, virus u hongos, que provoca fiebre, tos, dificultad para respirar y dolor en el pecho.", R.drawable.disease2));
        Lista.add(new Datos(3, "3. Fibrosis pulmonar", "Enfermedad en la que los tejidos pulmonares se vuelven rígidos y cicatrizados, lo que dificulta la respiración progresivamente, acompañada de tos seca y fatiga.", R.drawable.disease3));
        Lista.add(new Datos(4, "4. Silicosis aguda", "Resulta de la exposición a cantidades muy grandes de sílice durante corto tiempo. Los pulmones se inflaman y se pueden llenar de líquido, lo que causa grave dificultad respiratoria y una bajo nivel de oxígeno en la sangre.", R.drawable.disease4));
        Lista.add(new Datos(5, "5. Bronquitis crónica", "Inflamación persistente de los bronquios, a menudo causada por el tabaquismo o la exposición a irritantes, que se manifiesta mediante tos crónica con producción de esputo, dificultad para respirar y fatiga.", R.drawable.disease5));
        Lista.add(new Datos(6, "6. Enfisema", "Enfermedad pulmonar crónica que provoca daño y destrucción de los alvéolos pulmonares, lo cual reduce la capacidad respiratoria y produce dificultad para respirar, tos crónica y fatiga.", R.drawable.disease6));
        Lista.add(new Datos(7, "7. Síndrome de apnea del sueño (SAS)", "Trastorno respiratorio en el que la respiración se interrumpe repetidamente durante el sueño, causando ronquidos fuertes, somnolencia diurna, falta de concentración y cansancio.", R.drawable.disease7));
        Lista.add(new Datos(8, "8. Rinitis alérgica", "Inflamación de la mucosa nasal debido a una reacción alérgica a sustancias como polen, polvo o ácaros, que se manifiesta con estornudos, picazón en la nariz, secreción y congestión nasales.", R.drawable.disease8));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);
        listadatos.setAdapter(miadaptador);
    }
}