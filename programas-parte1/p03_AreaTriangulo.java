// Calcula al area de un Triangulo

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la base   ? ");
        base = obj.nextInt();
        System.out.print("Dame la altura ? ");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println(  String.format("El trianngulo de base %d y altura %d tiene un area de %.2f",base, altura, area) );
    }
}
