package newExercise2.exercise3;

/**
 * Exercício 3 – Herança Simples
 * Crie uma classe Funcionario com os atributos nome e salario.
 * • Depois, crie uma subclasse Gerente, que herda de Funcionario, e adicione o atributo bonus.
 * • Faça um método que retorne o salário total de um gerente (salário + bônus).
 * • Crie um objeto de cada tipo e mostre o salário
 */

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double salarioTotal() {
        return this.salario + this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
