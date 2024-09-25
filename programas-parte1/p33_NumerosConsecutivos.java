/**
 * p33_NumerosConsecutivos - Dados tres números enteros, verificar si son consecutivos
 */

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Dados tres números enteros, verificar si son consecutivos:\n");
        System.out.print("Dame numero 1 ? "); n1 = obj.nextInt();
        System.out.print("Dame numero 2 ? "); n2 = obj.nextInt();
        System.out.print("Dame numero 3 ? "); n3 = obj.nextInt();

        if(n3-n2==1 && n2-n1==1)
            System.out.println("Los numeros son consecutivos");
        else   
            System.out.println("Los numeros no son consecutivos");

        System.out.println("\nGracias por utilizar este programa");
        obj.close();
    }
}