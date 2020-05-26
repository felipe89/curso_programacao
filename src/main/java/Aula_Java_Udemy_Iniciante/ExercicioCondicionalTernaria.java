package Aula_Java_Udemy_Iniciante;

import java.util.Scanner;

public class ExercicioCondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double preco = 34.5;
//        double desconto;
//                /*Exemplo de condicional ternaria utilizando o IF ELSE*/
//        if (preço < 20.0){
//            desconto = preço * 0.1;
//        }else {
//            desconto = preço * 0.5;
//        }
//        System.out.println(desconto);
//        sc.close();

        double preco = 34.5;
        double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.5; /*Exemplo utilizando condional ternaria*/

        System.out.println( desconto);
        sc.close();
    }
}
