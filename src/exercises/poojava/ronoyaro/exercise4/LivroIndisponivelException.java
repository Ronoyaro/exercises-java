package com.poojava.ronoyaro.exercise4;

public class LivroIndisponivelException extends Exception{
    public LivroIndisponivelException(){
        super("Livro indisponivel no momento");
    }
}
