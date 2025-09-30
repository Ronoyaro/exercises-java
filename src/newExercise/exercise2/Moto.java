package newExercise.exercise2;

public class Moto extends Veiculo {
    protected final int CILINDRADAS = 150;

    public Moto() {
        super("Yamaha", "Factor");
    }

    @Override
    protected void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + this.CILINDRADAS);
    }

}
