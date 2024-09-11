// Suma de un rango de numeros

import java.util.Scanner;

public class  p68_SumaRango {
    public static float SumaRango(float ini, float fin) {
        float sum=0;
        for(float i=ini; i<=fin; i++)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        float ini, fin;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();

        do {
            System.out.print("Dame el inicio ? "); ini = obj.nextFloat();
            System.out.print("Dame el final  ? "); fin = obj.nextFloat();
        } while( ini > fin);

        System.out.printf("La suma de %.2f a %.2f es %.2f",ini,fin, SumaRango(ini,fin)  );
    }
}
