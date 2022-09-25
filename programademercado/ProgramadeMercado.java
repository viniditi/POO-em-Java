package pooemjava.programademercado;

import java.util.Locale;
import java.util.Scanner;

import pooemjava.entidades.Produto;

public class ProgramadeMercado {

    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //O Produto, traz a classe para ser usada e o produto2 é um nome que eu dou para utilizar no método na main class.
        Produto produto2 = new Produto();
        
        System.out.println("Insira os dados dos produtos:");
        System.out.print("Nome: ");
        produto2.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto2.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto2.quantidade = sc.nextInt();
        
        System.out.println();
        //O toString chamou a função do toString na classe Produto para aparecer aqui.Eu posso usar também o exemplo abaixo que dá certo.
        System.out.println("Dados do produto: "+produto2.toString());//System.out.println(produto2);
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto2.addProdutos(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados do produto: "+produto2.toString());
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos: ");
        quantidade = sc.nextInt();
        produto2.remocaoDeProdutos(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados do produto: "+produto2.toString());
        
        sc.close();
    }
}
