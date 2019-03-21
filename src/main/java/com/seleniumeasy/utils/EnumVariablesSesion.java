package com.seleniumeasy.utils;

public enum EnumVariablesSesion {
    RESULTADO_ESPERADO("resultado-mostrado");

    private String valor;

    private EnumVariablesSesion(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
