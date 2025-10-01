package newExercise2.exercise3;

/**
 * Exercício 3 – Herança Simples
 * Crie uma classe Funcionario com os atributos nome e salario.
 * • Depois, crie uma subclasse Gerente, que herda de Funcionario, e adicione o atributo bonus.
 * • Faça um método que retorne o salário total de um gerente (salário + bônus).
 * • Crie um objeto de cada tipo e mostre o salário
 */

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
