package Aula_Java_Udemy_Iniciante;
import java.util.Scanner;

public class AulaFuncoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com 3 numeros: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max (a,b,c);
        valorResult(maior);

        sc.close();
    }
    public static int max (int x , int y, int z){

        int aux;

        if (x > y && x > z){
            aux = x;
        }else if (y > z){
            aux =y;
        }else {
            aux = z ;
        }
        return aux;
    }
    public static void valorResult(int value){
        System.out.println("Maior :" + value);
    }
}

