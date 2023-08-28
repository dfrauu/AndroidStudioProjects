package com.example.laboratorio6e;

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
        Lista.add(new Datos(1, "BROCOLI", "Posee hierro y proteínas, sustancias que son fundamentales para combatir la anemia.", R.drawable.dbs_1));
        Lista.add(new Datos(2, "PIÑA", "Interfiere en el desarrollo de células malignas (reduciendo el riesgo de metástasis de algunos tipos de cáncer)", R.drawable.dbs_2));
        Lista.add(new Datos(3, "SANDIA", "Es perfecta para que los músculos se relajen y obtengan energía de nuevo.", R.drawable.dbs_3));
        Lista.add(new Datos(4, "TOMATE", "Debido a que tiene pocas calorías, es un alimento sugerido en las dietas destinadas a bajar de peso.", R.drawable.dbs_4));
        Lista.add(new Datos(5, "UVA", " buen depurativo de la sangre y previene la osteoporosis.", R.drawable.dbs_5));
        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);
        listadatos.setAdapter(miadaptador);
    }
}