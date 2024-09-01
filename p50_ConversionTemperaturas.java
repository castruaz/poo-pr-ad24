/**
 * p50_ConversionTemperaturas - Convierte temeraturas 
 */
 
import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Ingrese la temperatura inicial en grados centígrados: ");
            double inicial = scanner.nextDouble();

            System.out.println("Ingrese la temperatura final en grados centígrados: ");
            double finalTemperatura = scanner.nextDouble();

            // Validar rango
            while (finalTemperatura < inicial) {
                System.out.println("Error: La temperatura final no puede ser menor que la inicial.");
                System.out.println("Ingrese la temperatura final en grados centígrados: ");
                finalTemperatura = scanner.nextDouble();
            }

            System.out.println("-------------------------------");
            System.out.println("| Temperatura (°C) | Temperatura (°F) |");
            System.out.println("-------------------------------");
            while (inicial <= finalTemperatura) {
                double fahrenheit = (inicial * 9 / 5) + 32;
                System.out.printf("| %-15.1f | %-15.1f |\n", inicial, fahrenheit);
                inicial++;
            }
            System.out.println("-------------------------------");

            System.out.println("Desea repetir el proceso? (s/n)");
            String respuesta = scanner.next().toLowerCase();
            repetir = respuesta.equals("s");
        }

        scanner.close();
    }
}