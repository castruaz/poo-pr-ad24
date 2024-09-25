import java.util.Scanner;

public class p67_ConversionTemperaturas {
    // Función para convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Función para convertir Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("Conversor de temperaturas");
            System.out.println("------------------------");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese temperatura en Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusAFahrenheit(celsius);
                    System.out.println(celsius + "°C son " + fahrenheit + "°F");
                    break;
                case 2:
                    System.out.print("Ingrese temperatura en Fahrenheit: ");
                    double fahrenheit2 = scanner.nextDouble();
                    double celsius2 = fahrenheitACelsius(fahrenheit2);
                    System.out.println(fahrenheit2 + "°F son " + celsius2 + "°C");
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
             // Pausa antes de la siguiente iteración
            System.out.println("Presione Enter para continuar...");
            scanner.nextLine(); // Consumir el salto de línea>
            scanner.nextLine(); // Esperar a que se presione Ente
        } while (opcion != 3);

        scanner.close();
    }
}