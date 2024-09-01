// Imprimir numeros de 1 a n o de n a 1, el usuario lo decide

import java.util.Scanner;

public class p54_ArribaAbajo {
    public static void main(String[] args) {
        int n, op;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("[ 1 ] Numeros de 1 a n  ");
            System.out.println("[ 2 ] Numeros de n a 1  ");
            System.out.println("[ 3 ] Salir             ");
            System.out.print("Elije ? ");op = obj.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Hasta donde deseas llegar ?");
                    n = obj.nextInt();
                    for (int i = 1; i <= n; i++)
                        System.out.printf("%d ", i);
                    break;
                case 2:
                    System.out.print("Desde donde deseas desdender ? ");
                    n = obj.nextInt();
                    for (int i = n; i >= 1; i--)
                        System.out.printf("%d ", i);
                    break;
                case 3:
                    System.out.println("\nTe vas por quieres, adios");
                    break;
                default:
                    System.out.println("\nOpcion invalida ...");
            }
            System.out.println("\nPresiona <Enter> para continuar ..");obj.nextLine();obj.nextLine();
        } while (op != 3);
        System.out.println("\nProceso terminado ...");
    }
}
