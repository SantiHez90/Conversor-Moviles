package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    //Declarar objetos del Menu
    Button btnTemperatura,btnLongitud,btnPeso,btnDivisas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encuentra los botones por el id
        Button btnTemperatura = findViewById(R.id.btnTemperatura);
        Button btnLongitud = findViewById(R.id.btnLongitud);
        Button btnPeso = findViewById(R.id.btnPeso);
        Button btnDivisas = findViewById(R.id.btnDivisas);


        btnTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Temperatura = new Intent(MainActivity.this, TemperaturaVista.class);
                startActivity(Temperatura);
            }
        });

        btnLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Longitud = new Intent(MainActivity.this, LongitudVista.class);
                startActivity(Longitud);
            }
        });

        btnPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Peso = new Intent(MainActivity.this, PesoVista.class);
                startActivity(Peso);
            }
        });

        btnDivisas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Divisas = new Intent(MainActivity.this, DivisasVista.class);
                startActivity(Divisas);
            }
        });






    }
}