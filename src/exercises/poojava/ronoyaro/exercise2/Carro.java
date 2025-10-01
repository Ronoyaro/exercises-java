package com.poojava.ronoyaro.exercise2;

public class Carro extends Veiculo {
    protected final int PORTAS = 4;

    public Carro() {
        super("Fiat", "Uno");
    }

    @Override
    protected void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " +this.PORTAS);
    }


}
