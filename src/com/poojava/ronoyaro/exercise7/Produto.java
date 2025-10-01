package POOExercises.exercise7;

public abstract class Produto {
    protected String nome;
    protected double preco;

    protected abstract double calcularPrecoVenda();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}
