// Imprime numeros de 1 a n con paso de p

import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args) {
        int n,i, p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime numeros de 1 a n");
        System.out.print("Hasta Donde ? "); n = obj.nextInt();
        System.out.print("Paso        ? "); p = obj.nextInt();

        for(i=0; i<=n; i += p) 
            System.out.printf("%d ",i);
        
        System.out.println("\nProceso terminado");
        obj.close();
    }
}