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

public class TemperaturaVista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura_vista);

        //Encuentro los objetos
        Button btnVolver = findViewById(R.id.btnVolver);
        Button btnConvertirTemperatura = findViewById(R.id.btnConvertirTemperatura);
        Spinner spinnerTemperatura = findViewById(R.id.spinnerTemperatura);
        EditText txtValor = findViewById(R.id.txtValor);
        TextView txtResultado = findViewById(R.id.txtResultado);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Temperatura, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerTemperatura.setAdapter(adapter);

        btnConvertirTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String opcion = spinnerTemperatura.getSelectedItem().toString();
                String ValorString = txtValor.getText().toString();

                if (ValorString.equals("")) {
                    txtResultado.setText("Asigne Valor");
                    return;
                }

                double valor = Double.parseDouble(txtValor.getText().toString());

                if (opcion.equals("Celsius-Fahrenheit")) {
                    Temperatura temperatura = new Temperatura("Celsius", "Fahrenheit");
                    txtResultado.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (opcion.equals("Fahrenheit-Celsius")) {
                    Temperatura temperatura = new Temperatura("Fahrenheit", "Celsius");
                    txtResultado.setText(String.valueOf(temperatura.convertir(valor)));
                }

                if (opcion.equals("Celsius-Kelvin")) {
                    Temperatura temperatura = new Temperatura("Celsius", "Kelvin");
                    txtResultado.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (opcion.equals("Kelvin-Celsius")) {
                    Temperatura temperatura = new Temperatura("Kelvin", "Celsius");
                    txtResultado.setText(String.valueOf(temperatura.convertir(valor)));
                }

                if (opcion.equals("Fahrenheit-Kelvin")) {
                    Temperatura temperatura = new Temperatura("Fahrenheit", "Kelvin");
                    txtResultado.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (opcion.equals("Kelvin-Fahrenheit")) {
                    Temperatura temperatura = new Temperatura("Kelvin", "Fahrenheit");
                    txtResultado.setText(String.valueOf(temperatura.convertir(valor)));
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
