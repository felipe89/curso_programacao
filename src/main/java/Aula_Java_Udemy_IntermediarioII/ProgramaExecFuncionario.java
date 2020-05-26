package Aula_Java_Udemy_IntermediarioII;

import Entidade.Departamento;
import Entidade.Enums.NivelCargo;
import Entidade.HorasContrato;
import Entidade.Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaExecFuncionario {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome departamento: ");
        String departamentoNome = sc.nextLine();
        System.out.println("Entre com os dados do funcionario: ");
        System.out.print("Nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelFuncionario = sc.nextLine();
        System.out.print("Base salarial: ");
        double salarioFuncionario = sc.nextDouble();

        /*Instanciar a classe trabalhador*/

        Trabalhador trabalhador = new Trabalhador(nomeFuncionario, NivelCargo.valueOf(nivelFuncionario), salarioFuncionario, new Departamento(departamentoNome));

        System.out.print("Quantos contratos possui? ");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            System.out.println("informe o contrato #" + i + " :");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contratoDate = sdf.parse(sc.next());
            System.out.print("Valor por horas: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Quantidade de horas: ");
            int horas = sc.nextInt();
            HorasContrato contrato = new HorasContrato(contratoDate, valorPorHora, horas);
            trabalhador.addContrato(contrato);

        }
        System.out.println();
        System.out.print("Entre com o mes e ano para calcular o salario (MM/YYYY): ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda: " + mesEano + "- " + String.format("%.2f", trabalhador.renda(mes, ano)));

        sc.close();
    }
}
