/**
 * p49_ParesDescendente - Imprime los núemeros pares de forma descendente
 */
import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Ingrese el número límite hasta donde desea imprimir números pares: ");
            int limite = scanner.nextInt();

            System.out.println("Números pares descendentes hasta " + limite + ":");
            int numero = limite;
            while (numero >= 0) {
                if (numero % 2 == 0) {
                    System.out.print(numero + " ");
                }
                numero--;
            }
            System.out.println();

            System.out.println("Desea repetir el proceso? (s/n)");
            String respuesta = scanner.next().toLowerCase();
            repetir = respuesta.equals("s");
        }

        scanner.close();
    }
}