package com.poojava.ronoyaro.exercise2;

public class Init {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();

        veiculo1.exibirInfo();
        System.out.println("-------------------------------");
        veiculo2.exibirInfo();
    }
}
