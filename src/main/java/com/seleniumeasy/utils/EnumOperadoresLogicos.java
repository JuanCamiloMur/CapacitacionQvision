package com.seleniumeasy.utils;

public enum  EnumOperadoresLogicos {
    MAYOR("Mayor"),
    MENOR("Menor"),
    IGUAL("Igual");

    private String valor;

    private EnumOperadoresLogicos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
