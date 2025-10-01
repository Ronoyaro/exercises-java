package com.poojava.ronoyaro.exercise6;

public class Peixe implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Sem som");

    }

    @Override
    public void mover() {
        System.out.println("nadando");
    }
}
