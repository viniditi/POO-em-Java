package pooemjava.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /*System.out.print("Digite a quantidade de números que deseja digitar: ");
        int a = sc.nextInt();
        
        int[] vetor = new int[a];
        
        for (int i=0;i<vetor.length;i++){
            System.out.print("Digite o número inteiro: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("\nNúmeros negativos digitados\n");
        
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]<0){
                System.out.println(vetor[i]);
            }
        }*/
        
        /*System.out.print("Digite quantos número você vai digitar: ");
        int b = sc.nextInt();
        
        double[] vetor2 = new double[b];
        
        for (int i=0;i<vetor2.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }
        
        System.out.print("\nValores:");
        
        for (int i=0;i<vetor2.length;i++){
            System.out.print(" "+vetor[i]);
        }
        
        System.out.println("");
        
        double soma=0;
        for (int i=0;i<vetor2.length;i++){
            soma+=vetor[i];
        }
        
        double med = soma/vetor2.length;
        
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+med);*/
        
        System.out.print("Digite o a quantidade de pessoas: ");
        int c = sc.nextInt();

        
        ClasseVetorial[] vetor2 = new ClasseVetorial[c];
        
        double soma=0.0;
        for (int i=0;i<vetor2.length;i++){
            System.out.printf("\nDados da %dª pessoa: %n",i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            vetor2[i] = new ClasseVetorial(nome,idade,altura);
            soma+=vetor2[i].altura/vetor2.length;
        }

        int menos16=0;
        String nomeMenor;
        for (int i=0;i<vetor2.length;i++){
            if(vetor2[i].idade<16){
                menos16++;

            }
        }
        
        double percentualMenores= ((double)menos16/c)*100.0;
        System.out.printf("\nAltura média: %.2f%n",soma);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualMenores);
        
        for (int i=0;i<vetor2.length;i++){
            if(vetor2[i].idade<16){
                System.out.printf("%s%n",vetor2[i].nome);
            }
        }
        
        
        
        
        
        sc.close();
    }
    
}
