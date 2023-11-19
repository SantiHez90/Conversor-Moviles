package com.example.conversor;

public class Divisas extends Conversor{

    public Divisas(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }
    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Dolar") && unidadDestino.equals("Euro")){
            return (cantidad * 0.98);
        } else if (unidadOrigen.equals("Euro") && unidadDestino.equals("Dolar")) {
            return (cantidad * 1.06);
        } else if (unidadOrigen.equals("Dolar") && unidadDestino.equals("Peso colombiano")) {
            return (cantidad * 4073.34);
        } else if (unidadOrigen.equals("Peso colombiano") && unidadDestino.equals("Dolar")) {
            return (cantidad * 0.00025);
        } else if (unidadOrigen.equals("Euro") && unidadDestino.equals("Peso colombiano")) {
            return (cantidad * 4312.24);
        } else if (unidadOrigen.equals("Peso colombiano") && unidadDestino.equals("Euro")) {
            return (cantidad * 0.00023);
        }else {
            throw new IllegalArgumentException("Divisas no compatibles");
        }
    }
}
