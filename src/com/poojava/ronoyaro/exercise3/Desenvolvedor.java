package POOExercises.exercise3;

public class Desenvolvedor extends Funcionario{
    protected int projetosConcluidos;
    public Desenvolvedor(String nome, double salario, int projetosConcluidos) {
        super(nome, salario);
        this.projetosConcluidos = projetosConcluidos;
    }
    @Override
    public void calcularPagamento(){
        System.out.println(this.salario + (this.projetosConcluidos * 500));
    }
}
