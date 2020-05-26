package Aula_Java_Udemy_Intermediaria;

import Entidade.VetorII;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVetorII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        VetorII [] vect = new VetorII[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new VetorII(nome, preco);

        }
        double soma = 0.0;
        for (int i = 0; i<n; i++) {
            soma += vect[i].getPreco();
        }
        double mediaPreco = soma / n;

        System.out.printf("Media de preço é de: %.2f%n", mediaPreco);

        sc.close();
    }
}
