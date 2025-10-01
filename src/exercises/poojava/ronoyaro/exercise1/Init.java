package com.poojava.ronoyaro.exercise1;

public class Init {
    public static void main(String[] args) {
        Animal[] animais = new Animal[]{new Cachorro(), new Passaro()};

        for(Animal animal: animais) {
            animal.emitirSom();
            animal.mover();
            animal.tipo();
        }

    }
}
