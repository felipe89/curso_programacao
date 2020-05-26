package Aula_Java_Udemy_Intermediaria;

public class ProgramaForEach {
    public static void main(String[] args) {
        String[]vect = new String[]{"Mario", "Bob", "Alex"};

        for (int i = 0; i<vect.length; i++){
            System.out.println(vect[i]);
        }
        /*Exemplo utilizando o For Each*/

        System.out.println("---------------------------------------------");
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
