/**
 * Innerp48_ImparesAscendente - Imprime los numeros impares de forma ascendente
 */
 

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        int numero = 1;

        while (repetir) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Ingrese el número límite hasta donde desea imprimir números impares: ");
            int limite = scanner.nextInt();

            System.out.println("Números impares hasta " + limite + ":");
            while (numero <= limite) {
                if (numero % 2 != 0) {
                    System.out.print(numero + " ");
                }
                numero++;
            }
            numero = 1; 
            System.out.println();

            System.out.print("Desea repetir el proceso? (s/n)");
            String respuesta = scanner.next().toLowerCase();
            repetir = respuesta.equals("s");
        }
        scanner.close();
    }
}