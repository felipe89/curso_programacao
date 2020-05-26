package Aula_Java_Udemy_Iniciante;

public class AulaEscopoInicializacao {

    public static void main(String[] args) {

        double prince = 400.0;
        double discount = 0;

        if (prince < 200.0) {
            discount = prince * 0.1;
        }else {
            discount = 0; /*Exemplo de inicialização de variavel quando a mesma não foi declarada*/
        }
        System.out.println(discount);
    }
}
