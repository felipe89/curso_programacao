//package Aula_Java_Udemy;
//
//import java.util.Scanner;
//
//public class Exercicio3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        double valores;
//
//        System.out.println("Digite um valor :");
//        valores = sc.nextDouble();
//
//        if (valores < 0){
//            System.out.println("Valor informado é negativo ");
//        }else if (valores >= 0){
//            System.out.println("Valor informado é positvo");
//        }

//            int x;
//
//        System.out.println("Par ou Impar");
//        x = sc.nextInt();
//
//        if(x % 2 == 0  ){
//            System.out.println("Numero Par");
//        } else{
//            System.out.println("Numero Impar");
//        }

//        int A;
//        int B;
//
//        A = sc.nextInt();
//        B = sc.nextInt();
//
//        if (A % B == 0 || B % A ==0){
//            System.out.println("Numeros Multiplos ");
//        }else{
//            System.out.println("Numero não são Multiplos");
//        }

//        int horaInicial, horaFinal,duracao;
//
//        horaInicial = sc.nextInt();
//        horaFinal = sc.nextInt();
//
//        if (horaInicial < horaFinal){
//            duracao = horaFinal - horaInicial;
//        }else {
//            duracao = 24 - horaInicial + horaFinal;
//        }
//
//        System.out.println("O jogo durou " + duracao + "Hora(s)");

//        int codigo, quantidade;
//        double total;
//
//        codigo = sc.nextInt();
//        quantidade = sc.nextInt();
//
//        if (codigo == 1){
//            total = quantidade * 4.0;
//        }else if (codigo == 2){
//            total = quantidade * 4.5;
//        }
//        else if (codigo == 3) {
//            total = quantidade * 5.0;
//        }
//        else if (codigo == 4) {
//            total = quantidade * 2.0;
//        }
//        else {
//            total = quantidade * 1.5;
//        }
//
//        System.out.printf("Total: R$ %.2f%n", total);

//        sc.close();
//    }
//}
//    }
//}