package Aula_Java_Udemy_Iniciante;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int senha = sc.nextInt();
//
//        while (senha != 2002 ){
//            System.out.println("Senha Invalida");
//            senha = sc.nextInt();
//        }
//        System.out.println("Acesso permitido");
//        sc.close();


//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        while (x != 0 && y != 0) {
//            if (x > 0 && y > 0) {
//                System.out.println("Primeiro");
//            }
//            else if (x < 0 && y > 0 ){
//                System.out.println("Segundo");
//            }
//            else if (x > 0 && y > 0){
//                System.out.println("Terceiro");
//            }
//            else{
//                System.out.println("Quatro");
//            }
//            x = sc.nextInt();
//            y = sc.nextInt();
//        }
//        sc.close();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo ==1){
                alcool += 1;
            }else if (tipo == 2){
                gasolina += 1;
            }else if (tipo == 3){
                diesel += 1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
