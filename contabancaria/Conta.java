package pooemjava.contabancaria;

import java.util.Scanner;
import java.util.Locale;

public class Conta {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char inicial;
        System.out.print("Digite o número da conta: ");
        int getNumeroConta = sc.nextInt();
        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String setNomeTitular = sc.nextLine();
        
        
        Saque sq = new Saque(getNumeroConta,setNomeTitular);
        
        System.out.print("Deseja colocar um depósito inicial (y/n)? ");
        inicial = sc.next().charAt(0);
        
        if (inicial == 'y'){
            System.out.print("Digite o depósito inicial: ");
            sq.depositoInicial(sc.nextDouble());  
        }
        else{
        }
        
        System.out.println("\nDados da conta:\n"+sq.toString());
        
        System.out.print("\nDigite o valor do depósito: ");
        sq.deposito(sc.nextDouble());
        System.out.println("\nDados atualizados da conta:\n"+sq.toString());
        
        System.out.print("\nDigite o valor do saque: ");
        sq.saque = sc.nextDouble();
        sq.valorSaque(sq.saque);
        
        System.out.println("\nDados atualizados da conta:\n"+sq.novaString());
        
        
        
        sc.close();
    }
    
}
