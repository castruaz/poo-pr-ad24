// Imprime numeros de N a 1 con paso de p

import java.util.Scanner;

public class p53_NumerosNa1 {
    public static void main(String[] args) {
        int n,i, p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime numeros de N a 1 con paso de p");
        System.out.print("Desde donde ? "); n = obj.nextInt();
        System.out.print("Paso        ? "); p = obj.nextInt();

        for(i = n; i >= 0 ; i -= p) 
            System.out.printf("%d ",i);
        
        System.out.println("\nProceso terminado");
        obj.close();
    }
}
