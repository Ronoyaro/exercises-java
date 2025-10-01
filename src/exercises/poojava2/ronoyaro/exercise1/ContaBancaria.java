package com.poojava2.ronoyaro.exercise1;/*
* Exercício 1 – Encapsulamento (Getters e Setters)
Crie uma classe ContaBancaria com os atributos privados numeroConta, titular e saldo.
    • Implemente métodos públicos para depositar e sacar valores.
    • Garanta que não seja possível sacar valores maiores que o saldo.
    • Teste criando um objeto e simulando algumas operações.
* */

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldoAtual;

    public ContaBancaria(String titular, int numeroConta, double deposito) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoAtual = deposito;
    }

    public void saque(double valor) {
        if (valor > saldoAtual) {
            System.out.println("Não foi possivel sacar o valor desejado, pouis seu saldo atal é de :" + saldoAtual);
        } else {
            saldoAtual -= valor;
            System.out.println("Saque realizado no valor de " + valor + " realizado com sucesso");

        }
    }

    public void deposito(double deposito) {
        if (deposito <= 0) {
            System.out.println("So aceitamos valores a partir de 1 Real");
        } else {
            saldoAtual += deposito;
            System.out.println("Valor de " + deposito + " realizado com sucesso");
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    @Override
    public String toString() {
        return "newExercise2.exercise1.ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldoAtual=" + saldoAtual +
                '}';
    }
}