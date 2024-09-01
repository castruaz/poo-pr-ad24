// Imprime una piramide de *

import java.util.Scanner;

public class p58_Piramide {
    public static void main(String[] args) {
        int n;
        char car;
        boolean repite = true;
        Scanner obj = new Scanner(System.in);
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos renglones ? "); n = obj.nextInt();
            System.out.print("De que caracter   ? "); car = obj.next().charAt(0);
            for(int i=1; i <= n; i++) {
                for(int j=1; j <= i; j++) {
                    System.out.print(car);
                }
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            String respuesta = obj.next().toUpperCase();
            repite = respuesta.equals("S");
        }
        System.out.println("\nProceso terminado ..");
        obj.close();
    }
}
