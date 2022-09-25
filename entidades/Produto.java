
package pooemjava.entidades;


public class Produto {
  
    public String nome;
    public double preco;
    public int quantidade;
    
    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }
    
    public void addProdutos(int quantidade){
        this.quantidade += quantidade;//This pega a variável que está nos atributos.
    }
    
    public void remocaoDeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){//No toString, eu troco pela impressão que aparece na tela.
        return nome
            + ", $ "
            +String.format("%.2f", preco)//Esse String.format(arg,arg)eu uso para mostrar as casas decimais.
            + ", "
            + quantidade
            + " unidades, Total: $ "
            + String.format("%.2f", valorTotalEmEstoque());//Eu posso colocar tudo na mesma linha também.
    }
}


