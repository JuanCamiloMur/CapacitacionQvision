package com.seleniumeasy.utils;

public enum EnumVariablesSesion {
    MENSAJE("mensaje-enviado");

    private String valor;

    private EnumVariablesSesion(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
