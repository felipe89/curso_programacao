package Aula_Java_Udemy_Intermediaria;

import Entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaRetangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Entre com as medidas width e height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        sc.close();
    }
}
