/**
 * p51_SerieFibonaci - Imprime n terminos de la serie de fibonacci
 */

import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while(repetir) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Ingrese el número de términos que desea imprimir: ");
            int n = scanner.nextInt();

            int a = 0;
            int b = 1;

            System.out.println("Serie de Fibonacci hasta " + n + " términos:");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                // Calcula el siguiente término
                int temp = a;
                a = b;
                b = temp + b;
            }
            System.out.print("\nDesear repetir (s/n) ? ");
            String respuesta = scanner.next().toLowerCase();
            repetir = respuesta.equals("s");
        }
        scanner.close();
     }
}