// Cuenta numeros: positivos, negativos, cero. Hasta introducir 999

import java.util.Scanner;

public class p43_ConteoNumeros {
    public static void main(String[] args) {
        int n, c=0, s=0, cp=0, cn=0, cc=0;

        System.out.print("\033[H\033[2J");System.out.flush();
        do {
            System.out.print("Numero ? "); n = new Scanner(System.in).nextInt();
            if(n!=999) {
                c++;
                s+=n;
                if(n==0) cc++;
                else if(n<0) cn++;
                else cp++;
            }
        } while( n != 999);
        System.out.printf("Introdujiste %d numeros \n",c);
        System.out.printf("La suma es %d \n",s);
        System.out.printf("Positivos  %d \n",cp);
        System.out.printf("Negativos  %d \n",cn);
        System.out.printf("Ceros      %d \n",cc);
        System.out.println("\nProceso terminado");
    }
}
