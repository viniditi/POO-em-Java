package pooemjava.entidades;


public class Triangulo {//Nome da classe.
    
    public double a;//Atributos da classe.
    public double b;
    public double c;
    //O prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos.
                  //A "area" é o nome do método, e o "parênteses" é a lista de parâmetros do método.
    public double area(){
           //Tipo do dado que o método retorna (se o método não retorna nada, usa-se a palavra "void").
           
        double p = (a + b + c) / 2.0;//Corpo do método.
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
}
