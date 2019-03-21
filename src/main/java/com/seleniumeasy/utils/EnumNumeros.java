package com.seleniumeasy.utils;

public enum EnumNumeros {
    NUMERO_10("10"),
    NUMERO_100("100"),
    NUMERO_1000("1000"),
    NUMERO_10000("10000");

    private String valor;

    private EnumNumeros(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
