package Aula_Java_Udemy_Intermediaria;

import Entidade.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionario estao registrados: ");
        int n = sc.nextInt();

        for (int i=1; i <=n; i++){
            System.out.println();
            System.out.println("Funcionario #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id já foi informado tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario (id, nome, salario));
        }
        System.out.println();
        System.out.print("Entre com o ID do funcionario que terá aumento: ");
        int id = sc.nextInt();
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionario == null){
            System.out.println("Funcionario não existe!");
        } else {
            System.out.print("Entre com a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            funcionario.aumentoSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de Funcionarios: ");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }
        sc.close();
    }
    public static boolean hasId(List<Funcionario> list, int id ){
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
