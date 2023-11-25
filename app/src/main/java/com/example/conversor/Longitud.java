package com.example.conversor;

import com.example.conversor.Conversor;

public class Longitud extends Conversor {

    public Longitud(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Metros") && unidadDestino.equals("Pies")) {
            return cantidad * (3.28 / 1.0);

        } else if (unidadOrigen.equals("Pies") && unidadDestino.equals("Metros")) {
            return cantidad * (1.0 / 3.28);

        } else if (unidadOrigen.equals("Kilometros") && unidadDestino.equals("Millas")) {
            return cantidad * (1.0 / 1.609);

        } else if (unidadOrigen.equals("Millas") && unidadDestino.equals("Kilometros")) {
            return cantidad * (1.0 / 0.621371);

        } else if (unidadOrigen.equals("Centimetros") && unidadDestino.equals("Pulgadas")) {
            return cantidad * (1.0 / 2.54);

        } else if (unidadOrigen.equals("Pulgadas") && unidadDestino.equals("Centimetros")) {
            return cantidad * (2.54 / 1.0);

        } else if (unidadOrigen.equals("Yardas") && unidadDestino.equals("Metros")) {
            return cantidad * (1.0 / 1.0936);

        } else if (unidadOrigen.equals("Metros") && unidadDestino.equals("Yardas")) {
            return cantidad * (1.0936 / 1.0);

        } else if (unidadOrigen.equals("Millas náuticas") && unidadDestino.equals("kilometros")) {
            return cantidad * (1.0 / 1.852);

        } else if (unidadOrigen.equals("Kilometros") && unidadDestino.equals("Millas náuticas")) {
            return cantidad * (1.0 / 0.5399568);

        } else if (unidadOrigen.equals("Micrometros") && unidadDestino.equals("Milimetros")) {
            return cantidad * 0.001;

        } else if (unidadOrigen.equals("Milimetros") && unidadDestino.equals("Micrometros")) {
            return cantidad * 1000;

        }else if (unidadOrigen.equals("Decimetros") && unidadDestino.equals("Metros")) {
            return cantidad * 0.1;

        } else if (unidadOrigen.equals("Metros") && unidadDestino.equals("Decimetros")) {
            return cantidad * 10;

        }else{
            throw new IllegalArgumentException("Pesos no compatibles");
        }
    }
}
