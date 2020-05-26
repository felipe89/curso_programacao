package Aula_Java_Udemy_Intermediaria;

import Entidade.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o numero da conta :");
        int numero = sc.nextInt();
        System.out.print("Entre com o nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Tem deposito inicial (S/N): ");
        char reponse = sc.next().charAt(0);
        if (reponse == 'S'){
            System.out.print("Entre com o valor inicial de deposito: ");
            double inicializaDeposito = sc.nextDouble();
            conta = new Conta(nome, numero, inicializaDeposito);
        }else {
            conta = new Conta(nome, numero);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor de deposito: ");
        double depositaValor = sc.nextDouble();
        conta.deposito(depositaValor);
        System.out.println("Atualização de valores de conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor para saque: ");
        double saqueValor = sc.nextDouble();
        conta.saca(saqueValor);
        System.out.println("Atualização de valores de conta: ");
        System.out.println(conta);

        sc.close();
    }
}
