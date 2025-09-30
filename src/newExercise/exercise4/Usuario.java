package newExercise.exercise4;

public class Usuario {
    private String nome;
    public Usuario(String nome) {
        this.nome = nome;
    }
    public void pegarLivro(Livro livro) {
        try {
            livro.emprestar();
            System.out.println(this.nome + " pegou o livro " + livro.getTitulo());
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }

}
