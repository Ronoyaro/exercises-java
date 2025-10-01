package newExercise2.exercise2;

 /* Exercício 2 – Modificadores e Composição
 * Crie uma classe Endereco com atributos rua, cidade e cep.
 *     • Crie uma classe Pessoa com os atributos nome e um objeto do tipo Endereco.
        *     • Use modificadores de acesso apropriados (private, public) e implemente getters e setters.
        *     • Crie uma instância de Pessoa e associe um endereço a ela, exibindo todas as informações.
        * */

public class Pessoa {
    private String nome;
    private Endereco endereco;


    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, Endereco endereco){
        this(nome);
        this.endereco = endereco;
    }

    public void enderecoCompleto(){
        if(this.endereco == null) return;
        System.out.println("Rua: " +endereco.getRua());
        System.out.println("Cidade: " +endereco.getCidade());
        System.out.println("CEP: " +endereco.getCep());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
