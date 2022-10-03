package pooemjava.comportamentodememoria;

import java.util.Locale;
import java.util.Scanner;

public class ComportamentodeMemoria {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double sum = 0.0;
        
        System.out.print("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();
        
        //Eu coloco os '[]' pois indica que eu estou declarando um vetor.
        double[] nome_variavel = new double[n]; //E entre '[]' eu coloco o tamanho do vetor, nesse caso o usuário vai indicar o tamanho.
                                     //O double indica o tipo de elementos do vetor, nessa caso double.
        
        for (int i=0;i<n;i++){
            nome_variavel[i] = sc.nextDouble();
                         //Eu coloquei a variável 'i' para indicar em qual posição eu gostaria de colocar os números indicados. OBS: sempre começam no número 0.
        
            sum+= nome_variavel[i];
        }
        
        sum = sum/n;
        
        System.out.printf("%.2f%n",sum);
        
        sc.close();
    }
    
}
