package pooemjava.matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for (int i=0;i<n;i++){//Primeiro eu faço as linhas, e em baixo eu faço as colunas.
                          //Isso é a mesma coisa que a quantidade de colunas na matriz.
            for (int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nDiagonal principal: ");
        for (int i=0; i<n;i++){
            System.out.println(mat[i][i]+" ");
        }
        
        int cont =0;   //O . length funciona em matriz também.
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<n;j++){
                if (mat[i][j]<0){
                    cont++;
                }
            }
        }
        
        System.out.println("\nNùmero negativos: "+cont);
        
        sc.close();
    }
    
}
