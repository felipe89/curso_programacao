package Aula_Java_Udemy_Intermediaria;

import Entidade.Produtos;
import Entidade.ProdutosParteII;

import java.util.Locale;
import java.util.Scanner;

class ProgramaProdutoParteII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProdutosParteII p = new ProdutosParteII();  /*Podemos tbm inserir contrutor padrão sem parametros sem problemas  de compilação*/

        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        ProdutosParteII produtosParteII = new ProdutosParteII(nome, preco); /*Declaração do contrutor no programa*/

        produtosParteII.setNome("Computador"); /*Apos inserir o metodo set agora podemos chamar o metodo da maneira correta e alterar o nome do prod)*/
        System.out.println("Atualização de produto: " + produtosParteII.getNome());/*Apos inserir o metodo get podemos imprimir a alteração do prod*/

        produtosParteII.setPreco(1200.00);
        System.out.println("Atualização do valor de produto: " + produtosParteII.getPreco());


        System.out.println();
        System.out.println("Produtos em estoque: " + produtosParteII);

        System.out.println();
        System.out.print("Entre com a quantidade de produto á adicionar no estoque: ");
        int quantidade = sc.nextInt();
        produtosParteII.adicionaProduto(quantidade);

        System.out.println();
        System.out.println("Atualização quantidade de produtos em estoque: " + produtosParteII);

        System.out.println();
        System.out.print("Entre com a quantidade de produtos á serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produtosParteII.removeProduto(quantidade);

        System.out.println();
        System.out.println("Atualização quantidade de produtos em estoque: " + produtosParteII);

        sc.close();
    }
}
