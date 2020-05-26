package Aula_Java_Udemy_Iniciante;

import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Exercicio - 01 */
//        int x = sc.nextInt();
//
//        for (int i=1; i<x; i++) {
//            if (i % 2 != 0){
//                System.out.println(i);

        /*Exercicio - 02*/
//        int n = sc.nextInt();
//        int in = 0;
//        int out = 0;
//
//        for(int i = 0; i<n; i++){
//                int x = sc.nextInt();
//                if (x >=10 && x <= 20){
//                    in = in +1;
//            }else {
//                    out = out +1;
//                }
//        }
//        System.out.println(in + " in");
//        System.out.println(out + " out");
//        sc.close();

        /*Exercicio - 07*/

//        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++) {
//            int primeiro = i;
//            int segundo = i * i;
//            int terceiro = i * i * i;
//            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
//        }
//        sc.close();

        /*Exercicio - 06*/

//        int n = sc.nextInt();
//
//        for (int i= 1; i <= n; i++) {
//            if (n % i==0){
//                System.out.println(i);
//            }
//        }
//        sc.close();

        /*Exercicio - 05*/

        int n = sc.nextInt();
        int fat = 1;

        for (int i= 1; i<=n; i++ ){
            fat *= i;
        }
        System.out.println(fat);
        sc.close();

    }

}
