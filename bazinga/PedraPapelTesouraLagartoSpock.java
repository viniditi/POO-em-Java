
package pooemjava.bazinga;


public class PedraPapelTesouraLagartoSpock {
    
    
    public int guarda;
    private int ale;
    

    public PedraPapelTesouraLagartoSpock(int guarda) {
        this.guarda = guarda;
    }
    public int getAle(){
        return ale;
    }
    
    public String meuResultado(int guarda){
        switch (guarda) {
            case 1:
                return"Pedra";
            case 2:
                return"Papel";
            case 3:
                return"Tesoura";
            case 4:
                return"Lagarto";
            case 5:
                return"Spock";
            default:
                return"Digite um número válido";
        }
    }
    
    public String resultado(int getAle){
        if (getAle == 0){
            return"Pedra";
        }
        else if (getAle == 1){
            return"Papel";
        }
        else if (getAle == 2){
            return"Tesoura";
        }
        else if (getAle == 3){
            return"Lagarto";
        }
        else {
            return"Spock";
        }
        
    }
    
    
    
    
}
