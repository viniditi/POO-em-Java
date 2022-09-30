package pooemjava.contabancaria;

public class Saque {
    
    public final int numeroConta;
    private String nomeTitular;
    public double deposito;
    public double saque;
    
    public Saque(int getNumeroConta, String setNomeTitular){
        this.numeroConta = getNumeroConta;
        this.nomeTitular = setNomeTitular;
    }
    
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public String getNometitular(){
        return nomeTitular;
    }

    public int getNumeroConta(){
        return numeroConta;
    }
    
    public void depositoInicial(double deposito){
        this.deposito = deposito;
    }
    
    public void deposito(double deposito){
        this.deposito += deposito;
    }
    
    public void valorSaque(double saque){
        this.deposito -= (5.0 + saque);
    }
    
    public String toString(){
        return"Conta "+numeroConta
        +", Titular: "+nomeTitular
        +String.format(", Saldo: %.2f",deposito); 
    }
    
    public String novaString(){
        return"Conta "+numeroConta
        +", Titular: "+nomeTitular
        +String.format(", Saldo: %.2f",deposito);
    }
    
    
    
}
