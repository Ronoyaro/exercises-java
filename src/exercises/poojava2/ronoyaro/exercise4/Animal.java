package com.poojava2.ronoyaro.exercise4;
/*
Crie uma classe Animal com um método fazerSom() que imprime uma mensagem genérica, por exemplo: "O animal faz um som".
Crie duas subclasses que herdam de Animal:
Cachorro → sobrescreve fazerSom() para imprimir "Au au!".
Gato → sobrescreve fazerSom() para imprimir "Miau!".
No main, faça o seguinte:
Crie uma lista ou array de Animal contendo instâncias de Cachorro e Gato.
Percorra a lista e chame fazerSom() de cada animal.
 */

public class  Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}
