package pooemjava.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import pooemjava.entidades.Produto4;

public class Encapsulamento {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto4 p = new Produto4();
        
        System.out.println("Insira os dados dos produtos:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        
        Produto4 produto4 = new Produto4(nome,preco);
        
        //O atributo não pode mais ser acessado por causa do modelo de atributo como o que eu coloquei abaixo, o private.
        //produto4.nome = "Computador";
        
        produto4.setNome("Computador");//É dessa maneira que eu coloco um argumento com o atributo privado.
        System.out.println("Nome atualizado: "+produto4.getNome());//O get mostra o atributo private.
        produto4.setPreco(1200.00);
        System.out.println("Preço atualizado: "+produto4.getPreco());
        
        System.out.println();
        System.out.println("Dados do produto: "+produto4.toString());
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto4.addProdutos(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados do produto: "+produto4.toString());
        
        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos: ");
        quantidade = sc.nextInt();
        produto4.remocaoDeProdutos(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados do produto: "+produto4.toString());
        
        sc.close();
    }
    
}
