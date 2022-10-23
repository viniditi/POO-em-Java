package pooemjava.matriz;

import java.util.Scanner;
import java.util.Random;

public class ExtraExerciciosdeMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Exercício 01
        
        int[][] mat = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        int maior = 0;
        int lin =0;
        int col = 0;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]>maior){
                    maior = mat[i][j];
                    lin = i;
                    col = j;
                }
            }
        }
        
        System.out.println("\nMaior valor: "+maior);
        System.out.println("Linha: "+lin);
        System.out.println("Coluna: "+col);

        //Exercício 02
        
        int[][] mat1 = new int[10][10];
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        int maior1 = 0;
        int menor1 = 100;
        
        for (int i = 0; i < mat1[5].length; i++) {
            if (mat1[5][i] > maior1) {
                maior1 = mat1[5][i];
            }
            if (mat1[5][i] < menor1) {
                menor1 = mat1[5][i];
            }
        }

        System.out.println("\nMaior valor da linha 5: " + maior1 + ", Menor: " + menor1);
        
        int maior7=0;
        int menor7=100;
        
        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i][7] > maior7) {
                maior7 = mat1[i][7];
            }
            if (mat1[i][7] < menor7) {
                menor7 = mat1[i][7];
            }
        }
        
        System.out.println("Maior valor da coluna 7: " + maior7 + ", Menor: " + menor7);
        
        //Exercício 03
        
        int[][] mat2 = new int[3][3];

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int quantiPar = 0;
        int quantiImpar = 0;

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                if (mat2[i][j] % 2 == 0) {
                    quantiPar++;
                } else {
                    quantiImpar++;
                }
            }
        }

        System.out.println("Pares: " + quantiPar);
        System.out.println("Impares: " + quantiImpar);

        //Exercício 04
        
        String[][] mat4 = new String[31][24];

        boolean sair = false;

        while (!sair) {
            
            System.out.println("\nDigite 1 para adicionar um compromisso.");
            System.out.println("Digite 2 para verificar os compromissos.");
            System.out.println("Digite 0 para sair.\n");
            
            byte opcao = sc.nextByte();
            
            if(opcao == 1){
                
                boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                    System.out.print("Entre com o dia do mês: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia<=31){
                        diaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while(!horaValido){
                    System.out.print("Entre com o a hora: ");
                    hora = sc.nextInt();
                    if(hora > 0 && hora<=24){
                        horaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                    System.out.print("Digite o compromisso: ");
                }
                    mat4[--dia][hora] = sc.next();
            }
            else if(opcao ==2){
                boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                    System.out.print("Entre com o dia do mês: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia<=31){
                        diaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                
                boolean horaValido = false;
                int hora = 0;
                while(!horaValido){
                    System.out.print("Entre com o a hora: ");
                    hora = sc.nextInt();
                    if(hora > 0 && hora<=24){
                        horaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                System.out.print("Compromisso agendado: ");
                System.out.println(mat4[--dia][hora]);
            }
            else if(opcao ==0){
                sair = true;
            }
            else{
                System.out.println("Opção inválida, digite novamente");
            }
        }
        
        //Exercício 05
        
        String[][][] mat5 = new String[12][31][24];

        boolean sair1 = false;

        while (!sair1) {
            
            System.out.println("\nDigite 1 para adicionar um compromisso.");
            System.out.println("Digite 2 para verificar os compromissos.");
            System.out.println("Digite 0 para sair.\n");
            
            byte opcao = sc.nextByte();
            
            if(opcao == 1){
                
                boolean mesValido = false;
                int mes =0;
                while(!mesValido){
                    System.out.print("Entre com o mês: ");
                    mes = sc.nextInt();
                    if(mes > 0 && mes<=12){
                        mesValido = true;
                    }
                    else{
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                    System.out.print("Entre com o dia do mês: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia<=31){
                        diaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while(!horaValido){
                    System.out.print("Entre com o a hora: ");
                    hora = sc.nextInt();
                    if(hora > 0 && hora<=8){
                        horaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                    System.out.print("Digite o compromisso: ");
                }
                mat5[--mes][--dia][hora] = sc.next();
            }
            else if(opcao ==2){
                boolean mesValido = false;
                int mes =0;
                while(!mesValido){
                    System.out.print("Entre com o mês: ");
                    mes = sc.nextInt();
                    if(mes > 0 && mes<=12){
                        mesValido = true;
                    }
                    else{
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                    System.out.print("Entre com o dia do mês: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia<=31){
                        diaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                
                boolean horaValido = false;
                int hora = 0;
                while(!horaValido){
                    System.out.print("Entre com o a hora: ");
                    hora = sc.nextInt();
                    if(hora > 0 && hora<=8){
                        horaValido = true;
                    }
                    else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                System.out.print("Compromisso agendado: ");
                System.out.println(mat5[--mes][--dia][hora]);
            }
            else if(opcao ==0){
                sair1 = true;
            }
            else{
                System.out.println("Opção inválida, digite novamente");
            }
        }
        
        //Exercício 06
        
        char[][] jogo = new char[3][3];
        
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;
        
        while(!ganhou){
            if(jogada %2 ==1){
                System.out.println();
                System.out.println("Vez do jogador 1. Escolha a linha e a coluna (1-3).");
                sinal = 'X';
            }
            else{
                System.out.println();
                System.out.println("Vez do jogador 2. Escolha a linha e a coluna (1-3).");
                sinal = 'O';
            }
            
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = sc.nextInt();
                System.out.println();
                if(linha>=1 && linha<=3){
                    linhaValida = true;
                }
                else{
                    System.out.println("Entrada inválida, tente novamente!");
                    System.out.println();
                }
            }
            
            boolean colunaValida = false;
            while(!colunaValida){
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = sc.nextInt();
                System.out.println();
                if(coluna>=1 && coluna<=3){
                    colunaValida = true;
                }
                else{
                    System.out.println("Entrada inválida, tente novamente!");
                    System.out.println();
                }
            }
            
            linha--;
            coluna--;
            
            if(jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O'){
                System.out.println("Posição já usada, tente novamente");
            }
            else{
                jogo[linha][coluna] = sinal;
                jogada++;
            }
            
            for(int i=0;i<jogo.length;i++){
                for(int j=0;j<jogo[i].length;j++){
                    System.out.print(jogo[i][j] +"  |  ");
                }
                System.out.println();
            }  
            
            if((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') ||      //linha 1
                    (jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') || //linha 2
                    (jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') || //linha 3
                    (jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') || //coluna 1
                    (jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') || //coluna 2
                    (jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') || //coluna 3
                    (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') || //diagonal direita para esquerda.
                    (jogo[0][2] == 'X' && jogo[1][1] == 'X' && jogo[2][0] == 'X')){  //diagonal esquerda para direita
              ganhou = true;  
                System.out.println("Parabéns, jogador 1 ganhou!");
            }
            else if ((jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') ||      //linha 1
                    (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O') || //linha 2
                    (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') || //linha 3
                    (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') || //coluna 1
                    (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') || //coluna 2
                    (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') || //coluna 3
                    (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O') || //diagonal direita para esquerda.
                    (jogo[0][2] == 'O' && jogo[1][1] == 'O' && jogo[2][0] == 'O')){  //diagonal esquerda para direita
            
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");    
            }
            else if(jogada>9){
                ganhou = true;
                System.out.println("Empate, ninguém ganhou a partida!");
            }   
        }
        
        sc.close();
    }

}
