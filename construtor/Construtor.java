package pooemjava.construtor;

import java.util.Locale;
import java.util.Scanner;

import pooemjava.entidades.Produto2;

public class Construtor {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
                //Por padrão, os atributos são iniciados "vazios".
        //Produto2 produto2 = new Produto2(); //Agora que temos um contrutor como argumento, nós colocamos a instanciação após lermos os atibutos.

        System.out.println("Insira os dados dos produtos:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();
        
        Produto2 produto2 = new Produto2(nome,preco,quantidade);//Eu instancio o aqui para que eu obrigue o usuário a colocar um valor nos atributos.
        
        System.out.println();
        System.out.println("Dados do produto: "+produto2.toString());
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados no estoque: ");
        quantidade = sc.nextInt();
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
