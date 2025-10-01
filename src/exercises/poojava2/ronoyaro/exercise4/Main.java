package com.poojava2.ronoyaro.exercise4;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[]{new Gato(), new Cachorro()};
        for (Animal animal : animais) {
            animal.fazerSom();
        }


    }
}
