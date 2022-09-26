package pooemjava.entidades;


public class Salario {
    
    public String nome;
    public double bruto,imposto,porcentagem;
    
    public double salarioLiquido(){
        return bruto - imposto;
    }
    public void aumentoPorcentagemSalarial(double porcentagem){
        bruto += bruto * porcentagem/100;
    }
    public String toString(){
        return "Dados atualizados: "+nome+", "+String.format("$%.2f", salarioLiquido());
    }
    
}
