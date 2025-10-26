package pt.com.myproject.model;

public class Pessoa {
    private String nome;
    private int idade;

    //CONSTRUCTOR
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // GETTERS
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }

    // SETTERS
    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty())
            this.nome = nome;
    }
    public void setIdade(int idade)
    {
        if(idade >= 0)
            this.idade = idade;
    }
    //all methods
    public void apresentar() {
        System.out.println("Olá ! meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
    }
}
