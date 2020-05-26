package Aula_Java_Udemy_Intermediaria;

import Entidade.Pensao;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPensao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados: ");

        int n = sc.nextInt();
        Pensao[] ps = new Pensao[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Insira o nome do Hospede: ");
            String nome = sc.nextLine();
            System.out.print("Insira e-mail para contado: ");
            String email = sc.nextLine();
            System.out.print("Informa o numero do quarto: ");
            int quartoAlugado = sc.nextInt();
            ps[quartoAlugado] = new Pensao(nome, email, quartoAlugado);
        }
        System.out.println();
        System.out.println("Quartos Ocupados:");

        for (int i = 0; i < ps.length; i++) {
            if (ps[i] != null) {
                System.out.println(ps[i].toString());
            }
        }
        sc.close();
    }
}
