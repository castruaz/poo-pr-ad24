import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repite = true;
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Ingrese el número de términos: ");
            int terminos = scanner.nextInt();

            int suma = 0;

            System.out.print("Salida: ");
            for (int i = 1; i <= terminos; i++) {
                int numero = 0;
                for (int j = 0; j < i; j++) {
                    numero = numero * 10 + 1;
                }
                suma += numero;
                System.out.print(numero);
                if (i < terminos) {
                    System.out.print(" + ");
                }
            }

            System.out.println();
            System.out.println("Suma: " + suma);
            
            System.out.print("Deseas continuar (s/n) ? ");
            String respuesta = scanner.next().toLowerCase();
            repite = respuesta.equals("s");
        }
        System.out.println("\nProceso terminado ...");
        scanner.close();
    }
}