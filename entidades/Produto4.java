package pooemjava.entidades;

public class Produto4 {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto4(){
    }
    public Produto4(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto4(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    //Por padrão, o encapsulamento é posto após os construtores.
    public void setNome(String nome){
                //A palavra set, significa que eu posso modificar O atributo que eu desejar no private.
        this.nome = nome;
    }
    public String getNome(){
                  //Já a palavra get, significa que eu posso mostrar o atributo private se eu chamar ele no mainClass.
        return nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    
    public int getQuantidade(){//Eu não posso colocar o valor que eu quiser na quantidade por ser uma regra de negócio.
        return quantidade;
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
