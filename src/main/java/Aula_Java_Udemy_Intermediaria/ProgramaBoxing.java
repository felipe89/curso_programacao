package Aula_Java_Udemy_Intermediaria;

public class ProgramaBoxing {
    public static void main(String[] args) {
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int)obj;

        System.out.println(y);
    }
}
