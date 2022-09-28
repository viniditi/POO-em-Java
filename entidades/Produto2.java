package pooemjava.entidades;


public class Produto2 {
    
    public String nome;
    public double preco;
    public int quantidade;
    
    //Eu posso adicionar o Construtor de maneira automática clicando nos botões alt + insert.
    
           //O construtor te obriga a colocar valores nos atributos, e por padrão, ele é colocado abaixo dos atributos.
    public Produto2(String nome, double preco, int quantidade){
                    //Eu coloco os atributos no construtor para o parâmetro atribui-los nos atributos.
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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
