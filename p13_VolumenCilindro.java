/**
 * p13_VolumenCilindro - Calcular el volumen de un cilindro dado su radio y altura
 */

import java.util.Scanner;


public class p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double radio, altura, volumen;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calcular el volumen de un cilindro dado su radio y altura : \n");
        System.out.print("Dame el radio del cilindro? "); radio = obj.nextFloat();
        System.out.print("Dame la altura del cilindro? "); altura = obj.nextFloat();

        volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.printf("\nEl cilindro de %.2f radio y %.2f altura, tiene un volumen de %,.2f", radio, altura, volumen);
    }
}