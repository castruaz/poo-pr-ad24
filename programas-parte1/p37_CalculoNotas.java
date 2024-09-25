/**
 * p37_CalculoNotas - Calcula el promedio de 5 calificaciones y muestra un mensaje
 */
import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calcula el promedio de 5 calificaciones y muestra un mensaje\n");
        System.out.print("Dame el promedio ? ");
        float promedio = new Scanner(System.in).nextFloat();

        if (promedio < 0 || promedio > 10)
            System.out.println("Promedio fuera de rango ...");
        else {
            System.out.print("Con respectoa tu promedio : ");
            if(promedio>0 && promedio<6)
                System.out.println("Quedas reprobado");
            else if(promedio>=6 && promedio<7)
                System.out.println("Pasas de panzaso");
            else if(promedio>=7 && promedio<8)
                System.out.println("Muy bien, pues mejorar");
            else if(promedio>=8 && promedio<9)
                System.out.println("Excelente sigue así");
            else if(promedio>=9 && promedio<=10)
                System.out.println("Perfecto tu esfuerzo valió la pena");
        }
        System.out.println("\nGracias por utilizar este programa ...");
    }
}