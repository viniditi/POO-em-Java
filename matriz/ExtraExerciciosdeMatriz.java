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

        sc.close();
    }

}
