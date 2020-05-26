package Aula_Java_Udemy_Iniciante;

public class AulaFuncoesString {
    public static void main(String[] args) {


        String original = "GILMAR felipe Trindade SILVA";
        String s01 = original.toLowerCase();/*Função para converter a string em letras minusculas*/
        String s02 = original.toUpperCase();/*Função para converter s string em letras maiusculas */
        String s03 = original.trim(); /*Função para remover os espaços*/
        String s04 = original.substring(2);/*Função inicia a String da posição ordenada no argumento*/
        String s05 = original.substring(2, 9);/*A substring também determina o inicio da string e até aonde serio o encerramento*/
        String s06 = original.replace('e', 'x'); /*Função para alterar o caracteres dentro da string por determinação*/
        String s07 = original.replace("SILVA", "LUZ"); /*Replace tambem pode ser utilizado para alterar uma substring*/
        int i = original.indexOf("A");/*Função Indexof determino o inicio da ocorrencia ou posição do caracteres*/
        int j = original.lastIndexOf("A");/*Função LastIndexof determino o fim da ocorrencia ou posição do caracteres*/

        System.out.println("Original: " + original);
        System.out.println("Função toLowerCase: " + s01);
        System.out.println("Função toUpperCase: " + s02);
        System.out.println("Função trim : - " + s03 +" - ");
        System.out.println("substring :" + s04);
        System.out.println("subtring inicio e fim (2 , 9) : " + s05);
        System.out.println("Função Replace (e, x): "+ s06);
        System.out.println("Função Replace alterando substring (Silva, LUZ): " + s07);
        System.out.println("Index of (A) : " + i);
        System.out.println("Last Index of (A): " + j);
    }
}
