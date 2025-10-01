package com.poojava.ronoyaro.exercise3;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public abstract void calcularPagamento();
}
