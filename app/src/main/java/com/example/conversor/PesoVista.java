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

public class PesoVista extends AppCompatActivity {

    Button btnVolver, btnConvertirPeso;
    TextView txtResultado;
    Spinner spinnerPeso;
    EditText txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_vista);



        //Declaro las variables a los objetos
        Spinner spinnerPeso = findViewById(R.id.spinnerPeso);
        Button btnVolver = findViewById(R.id.btnVolver);
        Button btnConvertirPeso = findViewById(R.id.btnConvertirPeso);
        TextView txtResultado = findViewById(R.id.txtResultado);
        EditText txtValor = findViewById(R.id.txtValor);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Peso, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerPeso.setAdapter(adapter);

        btnConvertirPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String opcion = spinnerPeso.getSelectedItem().toString();

                String ValorString = txtValor.getText().toString();

                System.out.println(ValorString);


                if (ValorString.equals("")) {
                    txtResultado.setText("Asigne Valor");
                    return;
                }

                double valor = Double.parseDouble(txtValor.getText().toString());


                if (opcion.equals("Kilogramos a Libras")) {
                    Peso peso = new Peso("Kilogramos", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Libras a Kilogramos")) {
                    Peso peso = new Peso("Libras", "Kilogramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Gramos a Libras")) {
                    Peso peso = new Peso("Gramos", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Libras a Gramos")) {
                    Peso peso = new Peso("Libras", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Kilogramos a Gramos")) {
                    Peso peso = new Peso("Kilogramos", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Gramos a Kilogramos")) {
                    Peso peso = new Peso("Gramos", "Kilogramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Kilogramos")) {
                    Peso peso = new Peso("Toneladas", "Kilogramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Kilogramos a Toneladas")) {
                    Peso peso = new Peso("Kilogramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Libras a Onzas")) {
                    Peso peso = new Peso("Libras", "Onzas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Onzas a Libras")) {
                    Peso peso = new Peso("Onzas", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Gramos a Onzas")) {
                    Peso peso = new Peso("Gramos", "Onzas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Onzas a Gramos")) {
                    Peso peso = new Peso("Onzas", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Libras")) {
                    Peso peso = new Peso("Toneladas", "Libras");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Libras a Toneladas")) {
                    Peso peso = new Peso("Libras", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Gramos")) {
                    Peso peso = new Peso("Toneladas", "Gramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Gramos a Toneladas")) {
                    Peso peso = new Peso("Gramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Toneladas a Miligramos")) {
                    Peso peso = new Peso("Toneladas", "Miligramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Miligramos a Toneladas")) {
                    Peso peso = new Peso("Miligramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }

                if (opcion.equals("Kilogramos a Miligramos")) {
                    Peso peso = new Peso("Kilogramos", "Miligramos");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }
                if (opcion.equals("Miligramos a Kilogramos")) {
                    Peso peso = new Peso("Miligramos", "Toneladas");
                    txtResultado.setText(String.valueOf(peso.convertir(valor)));
                }


            }
        });
        //Abrir Menu (que pendiente cerrarla)
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PesoVista.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
}