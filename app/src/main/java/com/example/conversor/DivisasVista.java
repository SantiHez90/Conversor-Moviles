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

public class DivisasVista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisas_vista);

        //Encuentro los objetos

        Button btnVolver = findViewById(R.id.btnVolver);
        Button btnConvertirDivisa = findViewById(R.id.btnConvertirDivisa);
        Spinner spinnerDivisa = findViewById(R.id.spinnerDivisa);
        EditText txtValor = findViewById(R.id.txtValor);
        TextView txtResultado = findViewById(R.id.txtResultado);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Divisas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerDivisa.setAdapter(adapter);

        btnConvertirDivisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String opcion = spinnerDivisa.getSelectedItem().toString();
                String ValorString = txtValor.getText().toString();


                if (ValorString.equals("")) {
                    txtResultado.setText("Asigne Valor");
                    return;
                }

                double valor = Double.parseDouble(txtValor.getText().toString());

                if (opcion.equals("Dólar estadounidense a Euro")) {
                    Divisas divisa = new Divisas("Dolar", "Euro");
                    txtResultado.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (opcion.equals("Euro a Dólar estadounidense")) {
                    Divisas divisa = new Divisas("Euro", "Dolar");
                    txtResultado.setText(String.valueOf(divisa.convertir(valor)));
                }

                if (opcion.equals("Dólar estadounidense a Peso colombiano")) {
                    Divisas divisa = new Divisas("Dolar", "Peso colombiano");
                    txtResultado.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (opcion.equals("Peso colombiano a Dólar estadounidense")) {
                    Divisas divisa = new Divisas("Peso colombiano", "Dolar");
                    txtResultado.setText(String.valueOf(divisa.convertir(valor)));
                }

                if (opcion.equals("Euro a Peso colombiano")) {
                    Divisas divisa = new Divisas("Euro", "Peso colombiano");
                    txtResultado.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (opcion.equals("Peso colombiano a Euro")) {
                    Divisas divisa = new Divisas("Peso colombiano", "Euro");
                    txtResultado.setText(String.valueOf(divisa.convertir(valor)));
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