import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repite = true;
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Ingrese el número de términos: ");
            int terminos = scanner.nextInt();

            double suma = 0.0;

            System.out.print("Salida: ");
            for (int i = 1; i <= terminos; i++) {
                suma += 1.0 / i;
                System.out.print("1/" + i);
                if (i < terminos) {
                    System.out.print(" + ");
                }
            }

            System.out.println();
            System.out.printf("Suma: %.6f%n", suma);
            
            System.out.print("Deseas continuar (s/n) ? ");
            String respuesta = scanner.next().toLowerCase();
            repite = respuesta.equals("s");
        }
        System.out.println("\nProceso terminado ...");
        scanner.close();
    }
}