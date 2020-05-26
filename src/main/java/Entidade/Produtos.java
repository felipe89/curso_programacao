package Entidade;
public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public Produtos() { /*Inserindo construtores*/
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public double totalProdutoEmEstoque(){
        return preco * quantidade;
    }

    public void adicionaProduto (int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto ( int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString (){
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidade, total: $ "
                + String.format("%.2f", totalProdutoEmEstoque());
    }
}