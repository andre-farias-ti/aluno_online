package com.alunoonline.v1.secretaria.models;

public class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;

    void sacar(double valor){
        double novoSaldo = this.saldo -valor;
        this.saldo = novoSaldo;
    }

    void depositar (double dValor) {
        this.saldo += dValor;
    }

}
