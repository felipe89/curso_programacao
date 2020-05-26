package Praticando_Exercicios;

import EntidadePraticando.Accont;
import EntidadePraticando.ExceptionsAccont;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaAccont {
    public static void main(String[] args)throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();

        Accont acc = new Accont(number, holder, balance, withdrawLimit );

        System.out.println();
        System.out.print("Enter amoint for withdraw: ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
        }
        catch (ExceptionsAccont e){
            System.out.println("WithDraw error: " + e.getMessage());
        }

        sc.close();
    }
}
