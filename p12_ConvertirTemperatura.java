/**
 * p12_ConvertirTemperatura - Convertir una temperatura de grados fahrenheit a grados celsius
 */

import java.util.Scanner;

public class p12_ConvertirTemperatura {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double celsius, fahrenheit;
        Scanner obj = new Scanner(System.in);

        System.out.println("Convertir una temperatura de farenheit a celicius : \n");
        System.out.print("Dame la temperatura en grados farenheit? "); fahrenheit = obj.nextFloat();

        celsius = (fahrenheit - 32) * ( 5.0 / 9.0) ;

        System.out.printf("\nLa temperatura en grados farenheit es %.2f y su equivelente en grados celcius es %.2f", fahrenheit, celsius);
    }
    
}