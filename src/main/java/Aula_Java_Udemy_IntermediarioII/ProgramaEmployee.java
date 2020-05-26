package Aula_Java_Udemy_IntermediarioII;

import Entidade.Employee;
import Entidade.OutsourcedEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employeer: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Employer #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char reponse = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHours = sc.nextDouble();

            if (reponse == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            }

            else {
                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENT: ");
        for (Employee emp : list){
            System.out.println(emp.getName() + "- $" + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
