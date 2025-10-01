package newExercise2.exercise3;

public class GerenteInit {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Sanji", 3500, 900);

        System.out.println(funcionario);

        System.out.println(((Gerente) funcionario).salarioTotal());

    }
}
