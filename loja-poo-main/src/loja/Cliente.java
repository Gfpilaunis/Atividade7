package loja;

public class Cliente extends Pessoa {
    private int id;
   

    public Cliente(String nome, String dataDeNascimento, int id) {
        super(nome, dataDeNascimento, id);
    }

    Cliente(int id) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPessoa(Pessoa pessoa) {
        
    }
}
