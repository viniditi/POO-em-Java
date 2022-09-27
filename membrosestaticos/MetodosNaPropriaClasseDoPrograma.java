package pooemjava.membrosestaticos;

import java.util.Scanner;
import java.util.Locale;

public class MetodosNaPropriaClasseDoPrograma {
                  //A palavra "final" significa que o valor não pode ser mudado, ele é constante.
    public static final double PI = 3.14159;
                                //O padrão de nome para constantes é escrever tudo em letra maiúsculas, caso tenha um espaço. utilize "_".
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        
        double c = circunferencia(raio);
        
        double v = volume(raio);
        
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n",PI);
        
        
    
        sc.close();
    }
    
    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double volume(double raio){
        return 4.0 * PI * raio* raio* raio/3.0;
    }
}
