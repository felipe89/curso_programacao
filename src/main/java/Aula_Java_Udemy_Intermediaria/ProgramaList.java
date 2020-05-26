package Aula_Java_Udemy_Intermediaria;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
         list.add("Felipe");/*Adicionando um elementro em uma determinada lista*/
         list.add("Jady");
         list.add("Ariana");
         list.add("Gilmar");
         list.add(2, "Carol"); /*Adicionar um elemento na lista dando a posição do elemento em seguida a informação a ser adicionada*/

         System.out.println(list.size());/*Verificar o tamanho da lista*/

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-----------------------------");
        list.remove("Felipe"); /*Removendo um elemento da lista informando qual elemento */
        list.remove(3); /*Removendo um elementro a lista por posição*/
        list.removeIf(x -> x.charAt(0) == 'J'); /*Remoção de elemento da lista por predicado lambda*/

        for (String x : list){
            System.out.println(x);

        }
        System.out.println("-----------------------------");
        System.out.println("Procurar um nome na lista: " + list.indexOf("Ariana"));/*Encontrar um elemento na lista*/
        System.out.println("Procurar um nome na lista: " + list.indexOf("Jady"));/*Quando um elemento não é encontrado na lista ele retorna como -1*/
        System.out.println("-----------------------------");

        /*Exemplo de filtrar elemento de uma lista utilizando o strem e com predicado e lambda*/

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("-----------------------------");
        /*Encotrar um elemento com base no predicado caso não encontre ou não exista o elemento citado o mesmo deverá retornar nulo*/
        String nome = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(nome);
    }
}
