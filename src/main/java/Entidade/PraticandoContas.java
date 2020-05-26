package Entidade;

import Entidade.Enums.StatusContas;

public class PraticandoContas {

    private String nome;
    private double valorConta;
    private StatusContas statusContas;

    public PraticandoContas(){

    }
    public PraticandoContas(String nome, double valorConta, StatusContas statusContas) {
        this.nome = nome;
        this.valorConta = valorConta;
        this.statusContas = statusContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public StatusContas getStatusContas() {
        return statusContas;
    }

    public void setStatusContas(StatusContas statusContas) {
        this.statusContas = statusContas;
    }

    public String toString() {
        return "Nome: " + nome + '\'' +
                ", Valor da Conta: " + valorConta +
                ", Status da Contas: " + statusContas;
    }
}
