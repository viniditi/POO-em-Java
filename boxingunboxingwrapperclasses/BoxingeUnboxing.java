package pooemjava.boxingunboxingwrapperclasses;


public class BoxingeUnboxing {

    
    public static void main(String[] args) {
        
        int x = 20;
        
        /*As wrapper classes são classes que tem como objetivo de tratar os tipos primitivos como classes
        só que de uma forma transparente ao compilador, sem precisar se preocupar em ficar fazendo converções e castings.*/ 
        Integer obj = x;
        //Eu uso os tipos classes para que eu posso deixar um valor nulo, ex. a data de nascimento que pode ser opcional em um programa.
        
        System.out.println(obj);
        
        int y = obj * 2;
        
        System.out.println(y);
        
        
    }
    
}
