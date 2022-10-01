package pooemjava.bazinga;

import java.util.Scanner;
import java.util.Random;

public class Bazinga {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha uma um número das opções abaixo");
        System.out.println("1.Pedra");
        System.out.println("2.Papel");
        System.out.println("3.Tesoura");
        System.out.println("4.Lagarto");
        System.out.println("5.Spock");
        System.out.print("Escolha um número das opções acima: ");
        int guarda = sc.nextInt();

        PedraPapelTesouraLagartoSpock ppt = new PedraPapelTesouraLagartoSpock(guarda);
        
        System.out.println("");
        System.out.println(ppt.meuResultado(guarda));
        System.out.println("");
        
        if (guarda <= 5 && guarda >= 1) {
            int getAle = random.nextInt(4);
            System.out.println(ppt.resultado(getAle));
            System.out.println("");
            if (getAle == 0 && guarda == 1) {
                System.out.println("De novo");
            } else if (getAle == 1 && guarda == 2) {
                System.out.println("De novo");
            } else if (getAle == 2 && guarda == 3) {
                System.out.println("De novo");
            } else if (getAle == 3 && guarda == 4) {
                System.out.println("De novo");
            } else if (getAle == 4 && guarda == 5) {
                System.out.println("De novo");
            } else if (getAle == 0 && guarda == 4) {
                System.out.println("Pedra esmaga lagarto");
                System.out.println("Raj Trapaceou!");
            } else if (getAle == 0 && guarda == 3) {
                System.out.println("Pedra esmaga Tesoura");
                System.out.println("Raj Trapaceou!");
            } else if (getAle == 1 && guarda == 1) {
                System.out.println("Papel cobre a Pedra");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 2 && guarda == 3) {
                System.out.println("Tesoura corta Papel");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 3 && guarda == 5) {
                System.out.println("Veneno do Lagarto mata Spock");
                System.out.println("Raj Trapaceou!");
            } else if (getAle == 4 && guarda == 3) {
                System.out.println("Spock esmaga Tesouras");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 2 && guarda == 4) {
                System.out.println("Tesoura decapita Lagarto");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 3 && guarda == 2) {
                System.out.println("Lagarto come Papel");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 1 && guarda == 5) {
                System.out.println("Papel refuta Spock");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 4 && guarda == 1) {
                System.out.println("Spock vaporiza a Pedra");
                System.out.println("Raj Trapaceou");
            } else if (getAle == 1 && guarda == 3) {
                System.out.println("Tesoura corta Papel");
                System.out.println("BAZINGA!");
            } else if (getAle == 1 && guarda == 1) {
                System.out.println("Papel cobre Pedra");
                System.out.println("BAZINGA!");
            } else if (getAle == 0 && guarda == 4) {
                System.out.println("Pedra esmaga Lagarto");
                System.out.println("BAZINGA!");
            } else if (getAle == 4 && guarda == 4) {
                System.out.println("Lagarto envenena o Spock");
                System.out.println("BAZINGA!");
            } else if (getAle == 2 && guarda == 5) {
                System.out.println("Spock esmaga Tesouras ");
                System.out.println("BAZINGA!");
            } else if (getAle == 3 && guarda == 3) {
                System.out.println("Tesoura decapita Lagarto");
                System.out.println("BAZINGA!");
            } else if (getAle == 1 && guarda == 4) {
                System.out.println("Lagarto come Papel");
                System.out.println("BAZINGA!");
            } else if (getAle == 4 && guarda == 2) {
                System.out.println("Papel refuta Spock");
                System.out.println("BAZINGA!");
            } else if (getAle == 0 && guarda == 5) {
                System.out.println("Spock vaporiza a Pedra");
                System.out.println("BAZINGA!");
            } else if (getAle == 2 && guarda == 1) {
                System.out.println("Pedra esmaga tesoura");
                System.out.println("BAZINGA!");
            }
        }
        else
            

        sc.close();
    }

}
