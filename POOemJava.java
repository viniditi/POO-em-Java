package pooemjava;

import java.util.Scanner;
import java.util.Locale;

public class POOemJava {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double xa,xb,xc,ya,yb,yc;
        
        System.out.println("Digite o tamanho do triangulo X:");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Digite o tamanho do triangulo Y:");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();
        
        double p = (xa + xb + xc) / 2.0;
        double areax = Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
        
        p = (ya + yb + yc) / 2.0;
        double areay = Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));
        
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
