package pooemjava;

import java.util.Scanner;
import java.util.Locale;

import pooemjava.util.Conversao;

public class CotacaodoDolar {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Qual o valor do Dolar?: ");
        double dolar = sc.nextDouble();
        System.out.print("Qauntos dolares você pretende comprar?: ");
        double dolComprado = sc.nextDouble();
        
        double resultado = Conversao.convertendoDolar(dolar,dolComprado);
        
        System.out.printf("Valor a ser pago em reais: %.2f%n", resultado);
    
        sc.close();
    }
    
}
