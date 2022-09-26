package pooemjava.salariofuncionario;

import java.util.Scanner;
import java.util.Locale;

import pooemjava.entidades.Salario;

public class SalarioFuncionario {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Salario sal = new Salario();
        
        System.out.print("Digite o nome do Funcionário: ");
        sal.nome = sc.nextLine();
        System.out.print("Digite o salário bruto: ");
        sal.bruto = sc.nextDouble();
        System.out.print("Digite o imposto: ");
        sal.imposto = sc.nextDouble();
        System.out.println("Funcionário: "+sal.nome+", $"+sal.salarioLiquido());
        
        System.out.print("Digite a porcentegem do aumento do salário: ");
        double porcentagem = sc.nextDouble();
        sal.aumentoPorcentagemSalarial(porcentagem);
        
        System.out.println(sal.toString());
        
        
        
    }
    
}
