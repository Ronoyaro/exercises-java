package newExercise2.exercise2;

public class EnderecoInit {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua da paz", "Salvador", "41100-999");
        Pessoa pessoa = new Pessoa("Kanye West", endereco);
        pessoa.enderecoCompleto();
    }
}
