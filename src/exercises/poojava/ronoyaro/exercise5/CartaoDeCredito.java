package com.poojava.ronoyaro.exercise5;

public class CartaoDeCredito implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Você realizou o pagamento no cartao de crédito no valor de: " + valor);
    }
}
