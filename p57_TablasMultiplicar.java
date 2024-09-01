 // Imprime las tablas de multiplicar del 1 al 10, de 1 hasta 10

import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        int n, m;
        boolean repite=true;
        Scanner obj = new Scanner(System.in);
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Hasta que tabla quieres ? "); n = obj.nextInt();
            System.out.print("Hasta donde la quieres  ? "); m = obj.nextInt();

            for(int i=1; i <= n; i++) {
                System.out.printf("Tabla del %d\n",i);
                for(int j=1; j <= m; j++) {
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            String respuesta = obj.next().toUpperCase();
            repite = respuesta.equals("S");
        }
        System.out.println("\nProceso terminado");
        obj.close();
    }
}
