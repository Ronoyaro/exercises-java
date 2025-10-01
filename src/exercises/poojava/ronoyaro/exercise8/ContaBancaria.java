package com.poojava.ronoyaro.exercise8;

public class ContaBancaria {
    protected String titular;
    protected int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Valor de: " + valor + " depositado com sucesso!");
        System.out.println("Saldo atual de: " + this.saldo);

    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
        System.out.println("Valor de: " + valor + " sacado com sucesso");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

}
