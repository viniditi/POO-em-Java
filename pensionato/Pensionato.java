package pooemjava.pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        QuartosdoPensionato[] vetor = new QuartosdoPensionato[10];
        
        System.out.print("Quantos quartos serão alugados?: ");
        int n = sc.nextInt();
        
        for (int i=1;i<=n;i++){
            System.out.println("\nAlugue do "+i+"º quarto");
            System.out.print("Digite o nome da pessoa: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite o e-mail: ");
            String email = sc.next();
            System.out.print("Quarto escolhido: ");
            int quarto = sc.nextInt();
            
            vetor[quarto] = new QuartosdoPensionato(nome,email);
        }
        System.out.println();
        for (int i=0;i<10;i++){
            if(vetor[i] != null)
                System.out.println(i+": "+vetor[i]);
        }
        sc.close();
    }
    
}
