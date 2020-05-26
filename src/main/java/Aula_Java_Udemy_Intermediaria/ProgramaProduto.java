package Aula_Java_Udemy_Intermediaria;
import Entidade.Produtos;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();

        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        produtos.nome = sc.nextLine();
        System.out.print("Preço: ");
        produtos.preco = sc.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        produtos.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Produtos em estoque: " + produtos);

        System.out.println();
        System.out.print("Entre com a quantidade de produto á adicionar no estoque: ");
        int quantidade = sc.nextInt();
        produtos.adicionaProduto(quantidade);

        System.out.println();
        System.out.println("Atualização quantidade de produtos em estoque: " + produtos);

        System.out.println();
        System.out.print("Entre com a quantidade de produtos á serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produtos.removeProduto(quantidade);

        System.out.println();
        System.out.println("Atualização quantidade de produtos em estoque: " + produtos);

        sc.close();
    }
}
