package pooemjava.sobrecarga;

import java.util.Locale;
import java.util.Scanner;

import pooemjava.entidades.Produto3;

public class Sobrecarga {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto3 p = new Produto3();
        
        System.out.println("Insira os dados dos produtos:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        
        Produto3 produto3 = new Produto3(nome,preco);
        
        System.out.println();
        System.out.println("Dados do produto: "+produto3.toString());
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto3.addProdutos(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados do produto: "+produto3.toString());
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos: ");
        quantidade = sc.nextInt();
        produto3.remocaoDeProdutos(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados do produto: "+produto3.toString());
        
        sc.close();
    }
    
}
