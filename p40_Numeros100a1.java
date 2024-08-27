// Imprime numeros de n a 1, en incrementos de i, el usuario lo decide

import java.util.Scanner;

public class p40_Numeros100a1 {
    public static void main(String[] args) {
        int c, n, i;

        System.out.print("Desde donde ? "); n = new Scanner(System.in).nextInt();
        System.out.print("Decremento  ? "); i = new Scanner(System.in).nextInt();

        c = n;

        while( c >= 1 ) {
            System.out.printf("%d ",c);
            c = c - i;
        }

        System.out.println("\nCiclo terminado ");
        System.out.println(c);
        
    }
}
