import java.util.Scanner;

public class p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repite = true;
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos renglones ? : ");
            int filas = scanner.nextInt();
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.print("Deseas continuar (s/n) ? ");
            String respuesta = scanner.next().toLowerCase();
            repite = respuesta.equals("s");
        }
        System.out.println("\nProceso terminado ...");
        scanner.close();
    }
}