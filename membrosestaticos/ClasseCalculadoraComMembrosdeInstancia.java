package pooemjava.membrosestaticos;

import java.util.Scanner;
import java.util.Locale;

import pooemjava.util.Caculadora;

public class ClasseCalculadoraComMembrosdeInstancia {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Caculadora cal = new Caculadora();
        
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        
        double c = cal.circunferencia(raio);
        
        double v = cal.volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n",cal.PI);
        
        
    
        sc.close();
    }
    
}
