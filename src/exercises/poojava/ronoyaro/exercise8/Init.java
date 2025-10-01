package com.poojava.ronoyaro.exercise8;

public class Init {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Saitama", 9954, 1000);

        contaBancaria.depositar(500);
        try{
            contaBancaria.sacar(1500);
        } catch(SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}
