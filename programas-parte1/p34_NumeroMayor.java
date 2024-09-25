/**
 * p34_NumeroMayor - Dados tres números enteros, verificar cual es el mayor.
 */

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Dados tres números enteros, verificar cual es el mayor:\n");
        System.out.print("Dame numero 1 ? "); n1 = obj.nextInt();
        System.out.print("Dame numero 2 ? "); n2 = obj.nextInt();
        System.out.print("Dame numero 3 ? "); n3 = obj.nextInt();

        if(n1>n2 && n1>n3)
            System.out.printf("\nEl mayor es  n1 = %d ",n1);
        else if(n2>n1 && n2>n3) 
            System.out.printf("\nEl mayor es  n2 = %d ",n2);
        else if(n3>n1 && n3>n2) 
            System.out.printf("\nEl mayor es  n3 = %d ",n3);
        else if(n1==n2 && n1==n3) 
            System.out.printf("\nLos numeros son iguales n1 = %d, n2 = %d, n3 = %d ",n1, n2, n3);
        else
            System.out.printf("\nNingun numero es mayor, es posible 2 iguales");

        System.out.println("\nGracias por utilizar este programa");
        obj.close();
    }
}