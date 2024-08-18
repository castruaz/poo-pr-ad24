/**
 * p11_CalcularAngulo - Calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo
 */
import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calculando el 3er angulo de un triángulo dados los dos primeros: ");
        System.out.print("Dame el angulo 1 : ? "); angulo1 = obj.nextFloat();
        System.out.print("Dame el angulo 2 : ? "); angulo2 = obj.nextFloat();

        angulo3 = 180 - ( angulo1 + angulo2);

        System.out.printf("\nLos angulos, angulo 1 = %.2f y angulo 2 = %.2f", angulo1, angulo2);
        System.out.printf("\nEl angulo 3 es        = %.2f \n", angulo3);
    }
}