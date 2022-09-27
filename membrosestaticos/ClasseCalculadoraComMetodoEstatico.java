package pooemjava.membrosestaticos;

import java.util.Scanner;
import java.util.Locale;

import pooemjava.util.Calculadora;


public class ClasseCalculadoraComMetodoEstatico {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Calculadora cal = new Calculadora();-- Não preciso disso para usar apenas o método estático.
        
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
                   //Eu não preciso mais chamar o objeto, eu apenas coloco o nome da Classe e depois o nome do método para usar apenas o método que eu desejar.
        double c = Calculadora.circunferencia(raio);
        
        double v = Calculadora.volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n",Calculadora.PI);
        
        sc.close();
    }
    
}
