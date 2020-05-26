package Aula_Java_Udemy_Intermediaria;

import Entidade.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEmpregado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empregado emp = new Empregado();

        System.out.println("Nome: ");
        emp.nome = sc.nextLine();
        System.out.println("Salario bruto: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.println("Taxas: ");
        emp.taxas = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado " + emp);
        System.out.println();
        System.out.println("Qual porcentagem para aumentar o salário? ");
        double percente = sc.nextDouble();
        emp.aumentoSalario(percente);

        System.out.println();
        System.out.println("Atualização de dados " + emp);

        sc.close();
    }
}
