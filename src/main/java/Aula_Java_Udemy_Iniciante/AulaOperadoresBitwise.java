package Aula_Java_Udemy_Iniciante;

import java.util.Scanner;

public class AulaOperadoresBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n1 = 89;
//        int n2 = 60;
//
//        System.out.println(n1 & n2);
//        System.out.println(n1 | n2);
//        System.out.println(n1 ^ n2);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) !=0){
            System.out.println("Verdade o valor do bit's ");
        }else {
            System.out.println("Falso o valor do bit's");
        }

        sc.close();
    }
}
