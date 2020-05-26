package Aula_Java_Udemy_Iniciante;

import java.util.Scanner;

public class ExercicioSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

            /*Exemplo if else encadeados */
//        if(x == 1) {
//            dia = "Domingo";
//        }else if (x == 2) {
//            dia = "Segunda - feira";
//        }else if (x == 3) {
//            dia = "Terça - feira";
//        }else if (x == 4) {
//            dia = "Quata - feira";
//        }else if (x == 5) {
//             dia = "Quinta - feira";
//        } else if (x == 6){
//            dia = "Sexta - feira";
//        }else if (x == 7){
//            dia = "Sabado";
//        }else {
//            dia = "Valor Invalido";
//        }
//        System.out.println("Dia da semana " + dia);
//        sc.close();

        /*Exemplo utilizando switch case */

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quatar";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Data invalida";
                break;
        }

        System.out.println("Dia da semana " + dia);
        sc.close();
    }
}
