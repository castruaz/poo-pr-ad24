// Calcula e imprime el factorial de n numeros

import java.util.Scanner;

public class p59_FactorialNumeros {
    public static void main(String[] args) {
        int n,f;
        Scanner obj = new Scanner(System.in);
        boolean repite=true;
        while(repite) {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Hasta que numero deseas el factorial ? "); n = obj.nextInt();
            for(int k=1; k <= n; k++) {
                f = 1;
                System.out.printf("%d! = ",k);
                for(int i=1; i <= k; i++) {
                    System.out.printf(" %d %s",i, (i==k)?"":"*");
                    f = f * i;
                }
                System.out.printf("= %d \n",f);
            }
            System.out.print("\nDeseas continuar (S/N) ?"); 
            String respuesta = obj.next().toUpperCase();
            repite = respuesta.equals("S");
        }
        System.out.println("\nProceso terminado ..");
        obj.close();
    }
}
