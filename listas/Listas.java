package pooemjava.listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    
    public static void main(String[] args) {
        
            //Eu coloco entre menor e maior o tipo da minha lista e ela só aceita wrapper classes.
        List<String> lista = new ArrayList</*String (opcional)*/>(); //lista é o nome que eu dei para minha lista.
                                //Para instânciar um tipo, como no caso a lista, eu tenho que colocar uma classe que implementa a interface.ArrayList é apenas um exemplo de vários, e o ArrayList é muito otimizada, ela pega as melhores caracteristicas tanto do vetor como da lista.
        //Essa simples declaração(List<String> lista;)não permite que eu possa utilizar a lista, eu preciso intânciar a lista.
        
        lista.add("Maria");//.add adiciona elementos na minha lista.
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        
        lista.add(2,"Marco");//Eu escolho a posição que eu quero adicionar o elemento na minha lista.
        
        System.out.println(lista.size());//Eu mostro o tamanho da minha lista usando lista.size();.
        
        lista.remove("Anna");//Remove um dado da lista a partir da comparação dos dados.
        lista.remove(1);//Remove um dado da posição que eu desejar.
        
        for (String list : lista){
            System.out.println(list);
        }
        System.out.println("---------------------------------------------------");
        lista.removeIf(x -> x.charAt(0)== 'M');
        //Basicamente o programa está dizendo assim: pega um valor 'x' e remova se esse valor x é igual a 'M', mas só pega a primeira letra que eu puser. 
        
        for (String x : lista){
            System.out.println(x);
        }
        System.out.println("---------------------------------------------------");
        
        System.out.println("Index do Bob: " + lista.indexOf("Bob"));//lista.indexOf() mostra a posição da lista que o elemento está. 
        System.out.println("Index do Bob: " + lista.indexOf("Marco"));//Quando ele não encontra o elemento, ele retorna '-1'.
        
        System.out.println("---------------------------------------------------");
        
        //List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //No caso, esse de cima era para imprimir os nomes começados com a letra 'A', mas não deu certo.
        
        String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //Me retorna o primeiro nome com a letra que eu desejar, nesse caso 'A'(a letra maiúscula importa nesse caso), caso não encontre, ele retorna nulo.
        
        System.out.println(nome);
        
    }
    
}
