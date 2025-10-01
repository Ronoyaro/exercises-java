package com.poojava2.ronoyaro.exercise5;

public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("O carro esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro esta freando");
    }
}
