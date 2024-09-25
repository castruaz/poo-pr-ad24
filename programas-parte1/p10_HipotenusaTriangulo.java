/**
 * p10_HipotenusaTriangulo - Calcula la hipotenusa de un triángulo
 */

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double longlado1, longlado2, hipotenusa;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calculando la hipoténusa de un triángulo: ");
        System.out.print("Dame la lingitud del lado 1 : ? "); longlado1 = obj.nextFloat();
        System.out.print("Dame la lingitud del lado 2 : ? "); longlado2 = obj.nextFloat();

        hipotenusa = (longlado1 * longlado1 + longlado2 * longlado2);

        System.out.printf("\nPara un trianguilo con longitud de lado1 = %.2f y longitud de lado2 = %.2f", longlado1, longlado2);
        System.out.printf("\nLa hipotenusa es = %.2f \n", hipotenusa);
    }
}