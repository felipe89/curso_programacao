package Praticando_Exercicios;

import EntidadePraticando.Company;
import EntidadePraticando.Individual;
import EntidadePraticando.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaContribuinte {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer>list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char reponse = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Rendimento anual: ");
            double rendeAnual = sc.nextDouble();

            if (reponse == 'i'){
                System.out.print("Gasto com saúde: ");
                double gastoSaude = sc.nextDouble();
                list.add(new Individual(nome, rendeAnual, gastoSaude ));
            }
            else {
                System.out.print("Numero de empregados: ");
                int numeroEmpregados = sc.nextInt();
                list.add(new Company(nome, rendeAnual, numeroEmpregados));
            }
        }

        double soma = 0.0;
        System.out.println();
        System.out.println("Taxas Paga: ");
        for (TaxPayer tp : list){
            double tax = tp.tax();
            System.out.println(tp.getNome() + ": $" + String.format("%.2f", tax));
            soma += tax;
        }
        System.out.println();
        System.out.println("Total de taxas: $" + String.format("%.2f", soma));

        sc.close();
    }
}
