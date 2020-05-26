package Aula_Java_Udemy_IntermediarioII;

import Entidade.Enums.Cores;
import Entidade.Forma;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import Entidade.Rectangle;
import Entidade.Circle;
import java.util.Scanner;

public class ProgramaFormas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.print("Inseria o numero de formas: ");
        int n = sc.nextInt();

        for (int i=1; i<= n; i++){
            System.out.println("Forma #" + i + " encontre");
            System.out.print("Retangulo ou Circulo (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Cores BLACK/BLE/RED: ");
            Cores cores = Cores.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Rectangle(cores, largura, altura));
            }
            else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circle(cores,raio));
            }
        }

        System.out.println();
        System.out.println("Area de Formas: ");
        for (Forma forma : list){
            System.out.println(String.format("%.2f", forma.area()));
        }
        sc.close();
    }
}
