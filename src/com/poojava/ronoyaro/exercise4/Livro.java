package POOExercises.exercise4;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestar() throws LivroIndisponivelException {
        if (!disponivel) {
            throw new LivroIndisponivelException();
        }
        this.disponivel = false;
        System.out.println("Livro disponível, aproveite a sua leitura!");

    }

    public void devolver() {
        if (!disponivel) {
            this.disponivel = true;
            System.out.println("Obrigado pela preferência, espero que tenha gostado!");
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

}
