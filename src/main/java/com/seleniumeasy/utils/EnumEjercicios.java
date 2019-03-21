package com.seleniumeasy.utils;

public enum EnumEjercicios {
    INPUT_FORMS("Simple Form Demo");

    private String valor;

    private EnumEjercicios(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
