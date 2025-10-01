package POOExercises.exercise4;

public class Init {
    public static void main(String[] args) {
        Livro livro = new Livro("Cronicas de Gelo e Fogo",
                "George R.R. Martin");
        Usuario user = new Usuario("Ronald");

        user.pegarLivro(livro);
        user.pegarLivro(livro);
    }
}
