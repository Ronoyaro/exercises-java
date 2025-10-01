package com.poojava.ronoyaro.exercise5;

public class Cliente {
    public String nome;
    public Pagamento formaPagamento;

    public Cliente(String nome, Pagamento formaPagamento) {
        this.nome = nome;
        this.formaPagamento = formaPagamento;
    }

    public void pagar(double valor) {
        this.formaPagamento.realizarPagamento(valor);
    }
}
