package newExercise2.exercise1;

public class ContaBancariaInit {

    /*
* Exercício 1 – Encapsulamento (Getters e Setters)
Crie uma classe newExercise2.exercise1.ContaBancaria com os atributos privados numeroConta, titular e saldo.
    • Implemente métodos públicos para depositar e sacar valores.
    • Garanta que não seja possível sacar valores maiores que o saldo.
    • Teste criando um objeto e simulando algumas operações.
* */
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Luiz", 4490, 4500);

        conta1.saque(500.56);

        System.out.println(conta1);
    }
}
