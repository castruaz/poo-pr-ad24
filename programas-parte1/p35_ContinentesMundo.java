/**
 * p35_ContinentesMundo - Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre
 */
import java.util.Scanner;
public class p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre:\n");
        System.out.print("\nDame el numero de continente? "); 
        int n = new Scanner(System.in).nextInt();

        switch (n) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("Africa");
                break;
            case 3:
                System.out.println("America del Norte");
                break;
            case 4:
                System.out.println("America del Sur");
                break;
            case 5:
                System.out.println("Antartida");
                break;
            case 6:
                System.out.println("Europa");
                break;
            default:
                System.out.println("Continente no valido");
                break;
        }
        System.out.println("Gracias por utilizar este programa");
    }
}