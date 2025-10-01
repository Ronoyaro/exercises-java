package POOExercises.exercise3;

public class Init {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[]{new Desenvolvedor("Jojo",3000, 4),
                new Gerente("Jotaro", 3500, 350)};

        for(Funcionario funcionario: funcionarios) {
            funcionario.calcularPagamento();
        }
    }
}
