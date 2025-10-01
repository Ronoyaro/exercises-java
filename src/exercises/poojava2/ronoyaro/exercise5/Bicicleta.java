package com.poojava2.ronoyaro.exercise5;

public class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A bike esta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A bike esta freando");
    }
}
