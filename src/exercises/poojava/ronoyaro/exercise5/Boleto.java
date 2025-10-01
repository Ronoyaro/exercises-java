package com.poojava.ronoyaro.exercise5;

public class Boleto implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Você realizou o pagamento no boleto no valor de: " + valor);
    }

}
