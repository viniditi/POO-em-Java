package pooemjava.locoforeach;


public class LacoForEach {

    
    public static void main(String[] args) {
        
        String[] vetor = new String[]{"Maria","Bob","Alex"};
        
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        
        System.out.println("---------------------------------------");
        
             //Primeiro eu coloco o tipo dos elementos do vetor, nesse caso os vetores é String.
        for (String apelido : vetor){//Por fim, eu chamo a coleção que eu desejo chamar.
                    //Eu do um 'apelido' para cada elemento do meu vetor.
            System.out.println(apelido);//Eu coloco o 'apelido' para aparecer o conteúdo da coleção.
        }
        
        // For each, basicamente significa: "para cada objeto do 'apelido' contido em 'coleção', faça:"
        
    }
    
}
