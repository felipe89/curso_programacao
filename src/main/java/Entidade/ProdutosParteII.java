package Entidade;

public class ProdutosParteII {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutosParteII(){ /*Construtor padrão*/
    }

    public ProdutosParteII(String nome, double preco, int quantidade) { /*Inserindo construtores com todos os paramentros*/
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public ProdutosParteII(String nome, double preco) { /*Inserindo construtores de sobrecarga com menos parametros*/
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
     return nome;
    }

    public void setNome(String nome)    {
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double totalProdutoEmEstoque() {
        return preco * quantidade;
    }

    public void adicionaProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidade, total: $ "
                + String.format("%.2f", totalProdutoEmEstoque());
    }
}