package com.example.dianhuro.appbiental;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class ActividadCompleja extends AppCompatActivity {

    EditText nombre, edad; //Variables para las cajas de texto.
    String[] info; // Para almacenar el nombre y la edad.

    final static String ACT_INFO = "com.example.crearactividades.ACTIVIDADINFO"; // Ruta y Nombre de la activad a la cual voy a enviar la info.



    public void pasarActividadInfo(View v){

        //Obtengo lo que hay en las cajas de texto.

        info[0] = nombre.getText().toString();
        info[1] = edad.getText().toString();

        //Creo y asigno la información a enviar.

        Intent act = new Intent(this, ActividadInfo.class);
        act.putExtra(ACT_INFO, info);
        startActivity(act);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_compleja);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        nombre = (EditText) findViewById(R.id.nombre);
        edad = (EditText) findViewById(R.id.edad);

        info = new String[2];
    }

}
