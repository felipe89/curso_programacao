package Aula_Java_Udemy_Intermediaria;

import Entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno estudante = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        estudante.nome = sc.nextLine();
        System.out.println();
        System.out.println("Informe as notas");
        System.out.println();

        estudante.nota_1 = sc.nextDouble();
        estudante.nota_2 = sc.nextDouble();
        estudante.nota_3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", estudante.media());
        if (estudante.mediaPontos() < 60.0){
            System.out.println("Reprovado");
            System.out.printf("Ausencia %.2f Pontos%n", estudante.media());
        }else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}
