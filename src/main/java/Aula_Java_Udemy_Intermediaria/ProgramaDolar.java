package Aula_Java_Udemy_Intermediaria;

import Entidade.ConversorMoeda;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar o valor do dolar: ");
        double cotacao = sc.nextDouble();

        System.out.println("Qual o valor de comprar: ");
        double compra = sc.nextDouble();
        sc.close();

        double dolarCalculado = ConversorMoeda.valorDolar(cotacao, compra);
        double valorTaxa = ConversorMoeda.taxa(dolarCalculado);

        System.out.printf("Valor total a pagar: %.2f%n", dolarCalculado + valorTaxa);
        System.out.printf("Valor dolar:  %.2f%n", dolarCalculado);
        System.out.printf("Valor taxas: %.2f%n",  valorTaxa);
    }
}
