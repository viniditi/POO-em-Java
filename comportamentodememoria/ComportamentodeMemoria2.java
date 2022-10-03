package pooemjava.comportamentodememoria;

import java.util.Locale;
import java.util.Scanner;

import pooemjava.entidades.Product;

public class ComportamentodeMemoria2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int n = sc.nextInt();
        
        Product[] vetor = new Product[n];
        
        double soma=0;   //vetor.length é a quantidade de elementos do vetor, nesse caso n que o usuário digitar.
        for (int i=0; i<vetor.length;i++){//Não faz diferença se eu usar o nome da variável no vetor ou usar vetor.length.
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            //Eu instâncio colocando o vetor[posição do vetor] e depois = new Product(parâmetros).
            vetor[i] = new Product(nome,preco);
            soma += vetor[i].getPreco();
        }
        
        double med= soma / vetor.length;
        
        System.out.printf("A média dos preços dos produtos é: %.2f%n",med);
        
        sc.close();
    }
    
}
