package Entidade;

public class Conta {

    private String nome;
    private int numero;
    private double saldo;

    public static final double TAXA = 5.00;

    public Conta(String nome, int numero, double inicializaDeposito) {
        this.nome = nome;
        this.numero = numero;
        deposito(inicializaDeposito);
    }

    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void deposito(double amount){
        saldo += amount;
    }
    public void  saca(double amount){
        saldo -= amount + TAXA;
    }
    public String toString(){
        return "Conta "
                + numero
                + ", Nome: "
                + nome
                + ", Saldo: $"
                + String.format("%.2f", saldo);
    }
}

