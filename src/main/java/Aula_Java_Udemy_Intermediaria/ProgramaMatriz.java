package Aula_Java_Udemy_Intermediaria;

import java.util.Scanner;

public class ProgramaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] mat = new int[n][n];/*Matrix bidimencinal quando adicionamos  dois [][]*/

        for (int i=0; i<mat.length; i++){ /*Declarar o for que percorre as linhas */
            for (int j=0; j<mat[i].length; j++){ /*Declarar o for que percorre as colunas*/
                mat[i][j] = sc.nextInt();

            }
        }
        System.out.println("Diagonal Principal: ");
        for (int i=0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i<mat.length ; i++ ){
            for (int j = 0; j<mat[i].length; j++){
                if (mat[i][j] < 0){
                    count ++;
                }
            }
        }
        System.out.println("Numeros negativos: " + count);
        sc.close();
    }
}
