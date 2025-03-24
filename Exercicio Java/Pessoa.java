public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    //Construtor
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public Pessoa(){}

    //Metodo get
    public String getnome() {
        return nome;
    }

    public int getidade() {
        return idade;
    }

    public String getemail() {
        return email;
    }

    //Metodo set
    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public void setemail(String email) {
        this.email = email;
    }
}
