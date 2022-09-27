
package pooemjava.util;


public class Conversao {
    
    public static double IOF = 0.06;
    
    public static double convertendoDolar(double dolComprado, double dolar){
        return dolComprado * dolar * (1.0 + IOF);
    }
    
}
