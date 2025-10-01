package newExercise2.exercise2;

/**
 * Exercício 2 – Modificadores e Composição
 * Crie uma classe Endereco com atributos rua, cidade e cep.
 *     • Crie uma classe Pessoa com os atributos nome e um objeto do tipo Endereco.
 *     • Use modificadores de acesso apropriados (private, public) e implemente getters e setters.
 *     • Crie uma instância de Pessoa e associe um endereço a ela, exibindo todas as informações.
 * */

public class Endereco {
    private String rua;
    private String cidade;
    private String cep;

    public Endereco(String rua, String cidade, String cep){
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getCep(){
        return this.cep;
    }

    public String getRua(){
        return this.rua;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep=" + cep +
                '}';
    }
}
