
package pooemjava.entidades;


public class Produto3 {
    
    public String nome;
    public double preco;
    public int quantidade;
    
    //Nota: é possível também incluir um construtor padrão incluindo mais uma sobrecarga.
    public Produto3(){
    }
    
    //Sobrecarga é o mesmo método na mesma classe mas com parâmetros diferentes.
    public Produto3(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto3(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }
    
    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void remocaoDeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome
            + ", $ "
            +String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, Total: $ "
            + String.format("%.2f", valorTotalEmEstoque());
    }
    
}
