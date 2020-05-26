package Aula_Java_Udemy_Iniciante;
import java.util.Locale;

public class Exercicio1 {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Officer desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.println(product1 +" "+ prince1);
        System.out.println(product2 + " "+ prince2);
        System.out.println(age + " " +  code + " " + gender + " : ");
        System.out.println(measure);
        System.out.printf("%.3f%n", measure);
        Locale.setDefault(Locale.US);

    }
}