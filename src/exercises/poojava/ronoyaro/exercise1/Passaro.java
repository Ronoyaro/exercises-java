package com.poojava.ronoyaro.exercise1;

public class Passaro implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Gralhando");
    }
    @Override
    public void mover() {
        System.out.println("Voando");
    }
}
