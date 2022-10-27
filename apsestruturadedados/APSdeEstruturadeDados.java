package pooemjava.apsestruturadedados;

import java.util.Scanner;

public class APSdeEstruturadeDados {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] placar = new int[2];

        boolean sairDoJogo = false;
        char sinal;
        int linha = 0, coluna = 0;

        do {
            System.out.println("================================================");
            System.out.println("1. Para iniciar o jogo.");
            System.out.println("2. Para ver o placar.");
            System.out.println("3. Para sair.");
            System.out.println("================================================");
            int n = sc.nextInt();
            int jogada = 1;
            boolean ganhou = false;

            if (n == 1) {
                char[][] jogo = {{'.','.','.',}, {'.','.','.',}, {'.','.','.',}};

                System.out.println();
                System.out.println("Jogador 1 = X");
                System.out.println("Jogador 2 = O");
                System.out.println(".  |  .  |  .  |  ");
                System.out.println(".  |  .  |  .  |  ");
                System.out.println(".  |  .  |  .  |  ");
                
                do {
                    
                    if (jogada % 2 == 1) {
                        System.out.println();
                        System.out.println("Vez do jogador 1. Escolha a linha e a coluna (1-3).");
                        sinal = 'X';
                    } else {
                        System.out.println();
                        System.out.println("Vez do jogador 2. Escolha a linha e a coluna (1-3).");
                        sinal = 'O';
                    }

                    boolean linhaValida = false;
                    while (!linhaValida) {
                        System.out.println("Entre com a linha (1, 2 ou 3)");
                        linha = sc.nextInt();
                        System.out.println();
                        if (linha >= 1 && linha <= 3) {
                            linhaValida = true;
                        } else {
                            System.out.println("Entrada inválida, tente novamente!");
                            System.out.println();
                        }
                    }

                    boolean colunaValida = false;
                    while (!colunaValida) {
                        System.out.println("Entre com a coluna (1, 2 ou 3)");
                        coluna = sc.nextInt();
                        System.out.println();
                        if (coluna >= 1 && coluna <= 3) {
                            colunaValida = true;
                        } else {
                            System.out.println("Entrada inválida, tente novamente!");
                            System.out.println();
                        }
                    }

                    linha--;
                    coluna--;

                    if (jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O') {
                        System.out.println("Posição já usada, tente novamente");
                        System.out.println();
                    } else {
                        jogo[linha][coluna] = sinal;
                        jogada++;
                    }

                    for (int i = 0; i < jogo.length; i++) {
                        for (int j = 0; j < jogo[i].length; j++) {
                            System.out.print(jogo[i][j] + "  |  ");
                        }
                        System.out.println();
                    }

                    if ((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X')     || //linha 1
                            (jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') || //linha 2
                            (jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') || //linha 3
                            (jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') || //coluna 1
                            (jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') || //coluna 2
                            (jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') || //coluna 3
                            (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') || //diagonal direita para esquerda.
                            (jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X')) {  //diagonal esquerda para direita
                        System.out.println("\nParabéns, jogador 1 ganhou!\n");
                        ganhou = true;
                        placar[0]++;

                    } else if ((jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') || //linha 1
                            (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O')    || //linha 2
                            (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O')    || //linha 3
                            (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O')    || //coluna 1
                            (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O')    || //coluna 2
                            (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O')    || //coluna 3
                            (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O')    || //diagonal direita para esquerda.
                            (jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O')) {  //diagonal esquerda para direita

                        placar[1]++;
                        ganhou = true;
                        System.out.println("\nParabéns, jogador 2 ganhou!\n");
                    } else if (jogada > 9) {
                        ganhou = true;
                        System.out.println("\nEmpate, ninguém ganhou a partida!\n");
                    }
                } while (!ganhou);
            }
            if (n == 2) {
                System.out.println("\nJogador 1 || Jogador 2");
                System.out.println("        " + placar[0] + " || " + placar[1]+"\n");
            } else if (n == 3) {
                sairDoJogo = true;
            } else if (n > 3 || n < 0) {
                System.out.println("\nDigite um número válido!\n");
            }

        } while (!sairDoJogo);

        sc.close();
    }
    
}
