/**
 * p23_ConvertirTemperaturaV2 - Convierte de grados centigrados a grados farenheit y viceversa
 */

import java.util.Scanner;

public class p23_ConvertirTemperaturaV2 {
    public static void main(String[] args) {
        float temp, res;
        int op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Convirtiendo temperaturas : ");
        System.out.println(" [ 1 ] Farenheit a Centigrads");
        System.out.println(" [ 2 ] Centigrados a Farenheit");
        System.out.print("Elije una opcion ? "); op = obj.nextInt();

        if( op == 1 ) {
            System.out.println("Convirtiendo de Farenheit a Centigrados");
            System.out.print("Dame la temperatura en Farenheit ? "); temp = obj.nextFloat();
            res = (temp - 32) * 5f / 9f ;
            System.out.printf("%.2f Farenheit equivale a %.2f Centigrados", temp, res);
        }
        else  if( op == 2 ) {
            System.out.println("Convirtiendo de Centigrados a Farenheit");
            System.out.print("Dame la temperatura en Centigrados ? "); temp = obj.nextFloat();
            res = ( temp * 9f / 5f ) + 32 ;
            System.out.printf("%.2f Centigrados equivale a %.2f Farenheit", temp, res);
        }
        else 
            System.out.println("\nElegiste una opcion invalida ...");

        System.out.println("\nGracias por utilizar este progrma");
    }
}