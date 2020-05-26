package Aula_Java_Udemy_Iniciante;
import static java.lang.Math.*;

public class Math {

    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = sqrt(x);
        B = sqrt(y);
        C = sqrt(25.0);
        System.out.println("Raiz quadrada de "+ x + " = " + A);
        System.out.println("Raiz quadrada de "+ y + " = " + B);
        System.out.println("Raiz quadrada de 25 " + C);

        A = pow(x, y);
        B = pow(x, 2.0);
        C = pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = "+ A);
        System.out.println(x + " elevado ao quadrado " + B);
        System.out.println("5 elevado ao quadrado = " + C);

         A = abs(y);
         B = abs(z);
        System.out.println("Valor absoluto de "+ y + " = "+ A);
        System.out.println("Valor absoluto de "+ z + " = "+ B);




    }
}
