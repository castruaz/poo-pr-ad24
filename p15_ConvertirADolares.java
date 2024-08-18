/**
 * p15_ConvertirADolares - Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.
 */

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double peso, dollar, tc = 18.64;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares ? \n");
        System.out.print("Cuantos Pesos ? "); peso = obj.nextFloat();

        dollar = peso / tc;

        System.out.printf("\n%.2f pesos, equivale %.2f dollars", peso, dollar);
    }    
}