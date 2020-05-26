package Aula_Java_Udemy_Intermediaria;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i= 0; i<n; i++){
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += vect[i];
        }
        double medias = soma / n;

        System.out.printf("Calculo de media: %.2f%n",  medias);

        sc.close();
    }
}

