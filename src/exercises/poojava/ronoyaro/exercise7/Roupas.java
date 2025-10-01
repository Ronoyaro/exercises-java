package com.poojava.ronoyaro.exercise7;

public class Roupas extends Produto {
    private String tamanho;
    private final double TAXA = 0.05;

    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoVenda() {
        double valorFinal = (this.preco * this.TAXA) + this.preco;
        System.out.println("Valor: " + valorFinal);
        return valorFinal;
    }
}
