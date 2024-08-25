/**
 * p24_PagaTrabajadorv2 - Calcula la paga de un trbajador, las horas extra se pagan doble (>40)
 */

import java.util.Scanner;

public class p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        String nombre;
        int horas, extra=0;
        float paga, impuesto, tasa, pagaburta, paganeta;
        Scanner obj = new Scanner(System.in);

        tasa = 0.02f;
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calculando la paga de un trabajador, las horas extra se pagan al donle (>40)");
        System.out.print("Dame tu nombre   ? "); nombre = obj.nextLine();
        System.out.print("Horas Trabajadas ? "); horas = obj.nextInt();
        System.out.print("Paga x Hora      ? "); paga = obj.nextFloat();

        if(horas > 40 )  {
            extra = horas - 40;
            pagaburta = 40 * paga + ( extra * paga * 2 );
        } else {
            pagaburta = horas * paga;
        }
        impuesto = pagaburta * tasa;
        paganeta = pagaburta - impuesto;

        System.out.printf("El trbajador %s trabajo %d horas a una paga de %.2f pesos, a una tasa de %.2f \n", nombre, horas, paga, tasa);
        System.out.println("Paga bruta = " + pagaburta);
        System.out.println("Impuesto   = " + impuesto);
        System.out.println("Pata neta  = " + paganeta);

        System.out.println("\nFelicidades por llegar hasta este punto, significa que quieres ser un gran programador MUCHO EXITO CAMPEON !!!");
    }
}