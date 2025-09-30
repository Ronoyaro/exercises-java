package newExercise.exercise7;

public class Init {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[]{new Eletronico("Computador", 3500), new Roupas("Camiseta", 350)};
        for (Produto produto: produtos) {
            System.out.println("Produto: " +produto.getNome());
            produto.calcularPrecoVenda();
        }

    }
}
