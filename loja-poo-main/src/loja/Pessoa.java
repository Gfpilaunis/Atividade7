package loja;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private Endereco endereco;
    private Telefone telefone;

    public Pessoa(String nome, String dataDeNascimento, int id) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    Pessoa() { 
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
