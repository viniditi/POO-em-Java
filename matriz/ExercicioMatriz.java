package pooemjava.matriz;

import java.util.Scanner;

public class ExercicioMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int l = sc.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número que deseja procurar na matriz: ");
        int num = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    System.out.println("Posição: " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Baixo: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }

}
