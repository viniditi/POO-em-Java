package pooemjava.alturaelarguraretangulo;

import java.util.Locale;
import java.util.Scanner;

import pooemjava.entidades.Retangulo;

public class AlturaeLarguraRetangulo {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Retangulo retangulo = new Retangulo();
        
        System.out.print("Digite a largura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        retangulo.altura = sc.nextDouble();
        
        System.out.println();
        System.out.println(retangulo.toString());
    }
    
}
