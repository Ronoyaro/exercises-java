package com.poojava2.ronoyaro.exercise5;

public class VeiculoInit {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[]{new Carro(), new Bicicleta()};

        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar();
            veiculo.frear();
            System.out.println("--------------------");
        }

    }


}
