package pooemjava.exercicolistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class ExerciciodeLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        List<Lista> list = new ArrayList<>();
        
        System.out.print("Quantos funcionários serão registrados?: ");
        int n = sc.nextInt();

        
        for (int i=1;i<=n;i++) {
            System.out.println("\nFuncionário #"+i);
            System.out.print("ID do funcionário: ");
            int id = sc.nextInt();
            
            while(hasId(list, id)){
                System.out.print("ID já existente, tente novamente: ");
                id = sc.nextInt();
            }
            
            System.out.print("Nome do funcionário: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário do funcionário: ");
            double salario = sc.nextDouble();
            list.add(new Lista(id,nome,salario));
        }
        
        System.out.print("\nDigite o nome do funcionário que vai ter o aumento no salário: ");
        int id = sc.nextInt();
        Lista lis = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
        
        if (lis == null){
            System.out.println("\nEsse id não existe!");
        }
        else{
            System.out.print("\nDigite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            lis.aumentoSalario(porcentagem);
        }
        
        System.out.println("\nLista de funcionários:");
        for(Lista obj : list){
            System.out.println(obj);
        } 
        
        sc.close();
    }

    public static boolean hasId(List<Lista> list,int id){
        Lista lis = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return lis != null;
    }
    
}
