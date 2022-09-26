package pooemjava.mediatrimestral;

import java.util.Scanner;
import java.util.Locale;

import pooemjava.entidades.Notas;

public class MediaTrimestral {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Notas nota = new Notas();
        
        System.out.print("Digite seu nome: ");
        nota.nome = sc.nextLine();
        System.out.print("Digite sua primeira nota: ");
        nota.nota1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota.nota2 = sc.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        nota.nota3 = sc.nextDouble();
    
        if (nota.nota1>30 || nota.nota2>35 || nota.nota3>35 ){
            System.out.println("Alguma nota está acima da nota máxima, digite novamente");
        }
        else if (nota.gradeFinal()>60){
            System.out.println(nota.toString());
        }
        else {
            System.out.printf("Grade final:%.2f%nVocê falhou!!!%nPontos para passar:%.2f%n ",nota.gradeFinal(),nota.pontosNecessarios());
        }
    
        sc.close();
    }
    
}
