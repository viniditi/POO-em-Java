package pooemjava.entidades;


public class Notas {
    public String nome;
    public double nota1,nota2,nota3,grade;
    
    public double gradeFinal(){
        return grade = nota1 + nota2 + nota3;
    }
    
    public double pontosNecessarios(){
        if (gradeFinal()<60.0){
            return 60.0 - gradeFinal();
        }
        else{
            return 0.0;
        }
    }
    
    public String toString(){
        return "Grade final: "+String.format("%.2f%n",gradeFinal())+"Você passou!!!";
    }
}
