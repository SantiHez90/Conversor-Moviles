package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LongitudVista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud_vista);

        //Encuentro los objetos
        Button btnVolver = findViewById(R.id.btnVolver);
        Button btnConvertirLongitud = findViewById(R.id.btnConvertirLongitud);
        Spinner spinnerLongitud = findViewById(R.id.spinnerLongitud);
        EditText txtValor = findViewById(R.id.txtValor);
        TextView txtResultado = findViewById(R.id.txtResultado);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Longitud, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLongitud.setAdapter(adapter);

        btnConvertirLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String opcion = spinnerLongitud.getSelectedItem().toString();
                String ValorString = txtValor.getText().toString();

                if (ValorString.equals("")) {
                    txtResultado.setText("Asigne Valor");
                    return;
                }

                double valor = Double.parseDouble(txtValor.getText().toString());

                if (opcion.equals("Metros a Pies")) {
                    Longitud longitud = new Longitud("Metros", "Pies");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Pies a Metros")) {
                    Longitud longitud = new Longitud("Pies", "Metros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }

                if (opcion.equals("Kilómetros a Millas")) {
                    Longitud longitud = new Longitud("Kilometros", "Millas");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Millas a Kilómetros")) {
                    Longitud longitud = new Longitud("Millas", "Kilometros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }

                if (opcion.equals("Centímetros a Pulgadas")) {
                    Longitud longitud = new Longitud("Centimetros", "Pulgadas");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Pulgadas a Centímetros")) {
                    Longitud longitud = new Longitud("Pulgadas", "Centimetros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }

                if (opcion.equals("Yardas a Metros")) {
                    Longitud longitud = new Longitud("Yardas", "Metros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Metros a Yardas")) {
                    Longitud longitud = new Longitud("Metros", "Yardas");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }

                if (opcion.equals("Millas Náuticas a Kilómetros")) {
                    Longitud longitud = new Longitud("Millas náuticas", "Kilometros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Kilómetros a Millas Náuticas")) {
                    Longitud longitud = new Longitud("Kilometros", "Millas náuticas");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }

                if (opcion.equals("Micrómetros a Milímetros")) {
                    Longitud longitud = new Longitud("Micrometros", "Milimetros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Milímetros a Micrómetros")) {
                    Longitud longitud = new Longitud("Milimetros", "Micrometros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }

                if (opcion.equals("Decímetros a Metros")) {
                    Longitud longitud = new Longitud("Decimetros", "Metros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (opcion.equals("Metros a Decímetros")) {
                    Longitud longitud = new Longitud("Metros", "Decimetros");
                    txtResultado.setText(String.valueOf(longitud.convertir(valor)));
                }
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}