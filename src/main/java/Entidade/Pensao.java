package Entidade;

public class Pensao {

    private String nome;
    private String email;
    private int quarto;

    public Pensao(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getEmail(String email) {
        return email = email;
    }

    public void setEmail() {
        this.email = email;
    }

    public int getQuarto(int quarto) {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String toString() {
        return quarto + ": "
                + nome + ", " + email;
    }
}


