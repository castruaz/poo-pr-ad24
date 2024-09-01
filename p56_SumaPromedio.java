// Calcular la suma y el promedio de n calificaciones 

import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        boolean repite = true;
        Scanner obj = new Scanner(System.in);
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            suma=prom=0;
            System.out.println("Calcular la suma y el promedio de n calificaciones ");
            System.out.print("Cuantas calificaciones deseas procesar ? "); n = obj.nextInt();
            for(int i=1; i<=n; i++) {
                System.out.printf("Calificacion %d ? ",i);
                cal = obj.nextFloat();
                suma += cal;
            }
            prom = suma / n;
            System.out.printf("\nLa suma es %.2f y el promedio es %.2f", suma, prom);
            System.out.print("\nDeseas continuar (s/n) ? "); 
            String resp = obj.next().toLowerCase();
            repite = resp.equals("s");
        } 
        obj.close();
    }
}
