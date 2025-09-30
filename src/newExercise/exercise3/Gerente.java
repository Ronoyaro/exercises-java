package newExercise.exercise3;

public class Gerente extends Funcionario{
    protected double bonus;
    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }
    @Override
    public void calcularPagamento(){
        System.out.println(this.salario + bonus);
    }

}
