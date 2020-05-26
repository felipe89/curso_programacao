package Entidade;

import Entidade.Enums.StatusContas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PraticandoValidacao {
    public static void perguntas() throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat vencimento = new SimpleDateFormat("dd/MM/YYYY");

        System.out.print("Informe o nome da conta: ");
        String nome = sc.nextLine();
        System.out.print("Status da conta: ");
        String statusConta = sc.nextLine();
        System.out.print("Entre com o valor da conta: ");
        double valorConta = sc.nextDouble();
        System.out.print("Informe a data de vencimento (DD/MM/YYYY): ");
        Date dataVencimento = vencimento.parse(sc.next());


        PraticandoContas contas = new PraticandoContas(nome, valorConta, StatusContas.valueOf(statusConta));

        if (contas.getStatusContas().equals(StatusContas.PAGO)) {
            System.out.println("Conta Paga");
        }
        else {
            System.out.println("Conta não consta como paga!");
        }
        System.out.print("Existe mais contas a serem pagas (S/N)?: ");
        char reponse = sc.next().charAt(0);
        if (reponse == 'S'){
            PraticandoValidacao.perguntas();
        } else {
            System.out.println("Não há contas a vencer: ");
        }

        System.out.println(contas.toString());

        sc.close();
    }
}
