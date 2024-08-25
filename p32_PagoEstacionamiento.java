// Administra el pago de impuesto por estacionamiento de acuerdo a la Zona

import java.util.Scanner;

public class p32_PagoEstacionamiento {
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        float pago=0, tasa=0, impuesto=0, total=0;

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Administra el pago de impuesto por estacionamiento de acuerdo a la Zona\n");
        System.out.println("1 - Estacionamiento Tacuba            - 3%");
        System.out.println("2 - Estacionamiento Portales          - 5%");
        System.out.println("3 - Estacionamiento Conaquistadores   - 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos    - 15%");
        System.out.print("Elije una opción ? "); op = obj.nextInt();
        System.out.print("Pago efectuado   ? "); pago = obj.nextFloat();
        switch(op) {
            case 1: tasa = 0.03f; break;
            case 2: tasa = 0.05f; break;
            case 3: tasa = 0.10f; break;
            case 4: tasa = 0.15f; break;
        }
        impuesto = pago * tasa;
        total = pago + impuesto;

        System.out.printf("El pago total por estacionamiento incluido el impuesto es de %.2f",total);
    }
}
