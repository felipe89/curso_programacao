package Aula_Java_Udemy_IntermediarioII;

import Entidade.HerancaConta;
import Entidade.HerancaContaEmpresa;
import Entidade.HerancaUpcastingDowncastingConta;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramaHeranca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

//        HerancaConta acc1 = new HerancaConta(1001, "Felipe", 1000.0);
//        acc1.withdraw(200.0);
//        System.out.println(acc1.getBalance());
//
//        HerancaConta acc2 = new HerancaUpcastingDowncastingConta(1002,"Felipe", 1000.0,0.01);
//        acc2.withdraw(200.0);
//        System.out.println(acc2.getBalance());
//
//        HerancaConta acc3 = new HerancaContaEmpresa(1003, "Ariana", 1000.0, 500.0);
//        acc3.withdraw(200.0);
//        System.out.println(acc3.getBalance());


        /*Polimorfismo*/

//        HerancaConta x = new HerancaConta(1020, "Felipe", 1000.0);
//        HerancaConta y = new HerancaUpcastingDowncastingConta(1023, "Gilmar", 1000.0, 0.01);
//
//        x.withdraw(50.0);
//        y.withdraw(50.0);
//
//        System.out.println(x.getBalance());
//        System.out.println(y.getBalance());

        /*Classes exemplo de classe Abstrata "É uma classe que não pode ser instanciada", para efetuar isso basta adicionar o public Abstratic class direto na classe criada */

//        HerancaConta acc1 = new HerancaConta(1001, "Felipe", 1000.0);
//        HerancaConta acc2 = new HerancaUpcastingDowncastingConta(1002, "Gilmar", 1000.0, 0.01);
//        HerancaConta acc3 = new HerancaContaEmpresa(1003, "Jady", 1000.0, 500.0);

        List<HerancaConta> list  = new ArrayList<>();

        list.add(new HerancaUpcastingDowncastingConta(1001, "Felipe", 500.0, 0.01));
        list.add(new HerancaContaEmpresa(1002, "Jady", 1000.0, 400.0));
        list.add(new HerancaUpcastingDowncastingConta(1003, "Gilmar", 300.0, 0.01));
        list.add(new HerancaContaEmpresa(1005, "Ariana", 500.0, 500.0));

        double soma = 0;
        for (HerancaConta acc : list){
            soma += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n", soma);

        for (HerancaConta acc : list){
            acc.deposit(10.0);
        }
        for (HerancaConta acc : list){
            System.out.printf("Updated balance for  account  %d: %.2f%n", acc.getNumber());
        }
    }
}