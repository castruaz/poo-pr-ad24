// Impre numeros pares e impares, y su suma

import java.util.Scanner;

public class p55_SumaParesImpares {
    public static void main(String[] args) {
        int n, op, s;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("[ 1 ] Impares ascendente  ");
            System.out.println("[ 2 ] Pares descendente   ");
            System.out.println("[ 3 ] Salir             ");
            System.out.print("Elije ? ");op = obj.nextInt();
            switch (op) {
                case 1:
                    s = 0;
                    System.out.print("Hasta donde deseas llegar ?"); n = obj.nextInt();
                    for (int i = 1; i <= n; i += 2) {
                        System.out.printf("%d ", i);
                        s += i;
                    }
                    System.out.printf("\nLa suma de los numeros impares es : %d", s);break;
                case 2:
                    s = 0;
                    System.out.print("Desde donde deseas desdender ? ");n = obj.nextInt();
                    n = ( n % 2 == 0 ? n : --n);
                    for (int i = n; i >= 1; i -= 2) {
                        System.out.printf("%d ", i);
                        s += i;
                    }
                    System.out.printf("\nLa suma de los numeros pares es : %d", s);break;
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
