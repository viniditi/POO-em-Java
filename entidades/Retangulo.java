
package pooemjava.entidades;


public class Retangulo {
    
    public double altura, largura;
    
    public double area(){
        return altura*largura;
    }
    public double perimetro(){
        return 2*(altura + largura);
    }
    public double diagonal(){
        return Math.sqrt((altura*altura) + (largura*largura));
    }
    
    public String toString(){
        return "Área: "+String.format("%.2f%n",area())+"Perímetro: "
                +String.format("%.2f%n", perimetro())+"Diagonal: "
                +String.format("%.2f%n",diagonal());
    }
    
    
}
