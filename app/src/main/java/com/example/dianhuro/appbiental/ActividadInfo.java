package com.example.dianhuro.appbiental;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActividadInfo extends AppCompatActivity {

    String[] info; // Para recibir la información.

    TextView nombre, edad; //Para mostrar en pantalla la información.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        nombre = (TextView) findViewById(R.id.mostrarNombre);
        edad = (TextView) findViewById(R.id.mostrarEdad);

        //Obtengo la información de la Actividad anterior y se la asigno a la variable info.
        Intent men = getIntent();
        info = men.getStringArrayExtra(ActividadCompleja.ACT_INFO);

        //Muestro la información en la interfaz.
        nombre.setText(info[0]);
        edad.setText(getString(R.string.mostrar_edad, info[1]));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
