package Aula_Java_Udemy_Intermediaria;

import Entidade.Calcular;
import Entidade.Calcular;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaRaio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calcular.circuferencia(raio);
        double v = Calcular.volume(raio);

        System.out.printf("Circuferencia : %.2f%n", c);
        System.out.printf("Volume : %.2f%n", v);
        System.out.printf("Volume de  PI : %.2f%n", Calcular.PI);

        sc.close();
    }
}
