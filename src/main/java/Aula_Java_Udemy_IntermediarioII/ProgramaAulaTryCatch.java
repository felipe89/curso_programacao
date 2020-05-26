package Aula_Java_Udemy_IntermediarioII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaAulaTryCatch {
    public static void main(String[] args) {

        metodo2();
        System.out.println("Fim de programa");
    }

    public static void metodo2() {
        System.out.println("****Metodo 2 Iniciou******");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
        } catch (InputMismatchException e) {
            System.out.println("Dado Invalido! ");
        }
        System.out.println("****Metodo 2 Terminou******");
        sc.close();
    }
}
