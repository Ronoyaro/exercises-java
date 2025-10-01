package POOExercises.exercise7;

public class Eletronico extends Produto {
    private int garantia;
    private final double TAXA = 0.1;

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoVenda() {
        double valorFinal = (this.preco * this.TAXA) + this.preco;
        System.out.println("Valor: " + valorFinal);
        return valorFinal;
    }
}
