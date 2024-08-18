/**
 * p14_CalculoTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos
 */

 import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double horas, dias, minutos, segundos;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos: \n");
        System.out.print("Dame las horas ? "); horas = obj.nextFloat();

        dias = horas / 24;
        minutos = horas * 60 ;
        segundos = minutos * 60;

        System.out.printf("\nHoras    : %.2f", horas);
        System.out.printf("\nDias     : %.2f", dias);
        System.out.printf("\nMinutos  : %.2f", minutos);
        System.out.printf("\nSegundos : %.2f", segundos);
    }
}