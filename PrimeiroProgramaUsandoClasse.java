package pooemjava;

import java.util.Scanner;
import java.util.Locale;
import pooemjava.entidades.Triangulo;

public class PrimeiroProgramaUsandoClasse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        
        System.out.println("Digite o tamanho do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c= sc.nextDouble();
        System.out.println("Digite o tamanho do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areax = x.area();
        double areay = y.area();
        
        System.out.printf("A área do triangulo X é: %.4f%n",areax);
        System.out.printf("A área do triangulo Y é: %.4f%n",areay);
        
        if (areax > areay){
            System.out.println("A maior área é a do triangulo X");
        }
        else {
        System.out.println("A maior área é a do triangulo Y");
        }
    }
    
}
