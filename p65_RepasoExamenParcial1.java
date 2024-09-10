import java.util.Scanner;

public class p65_RepasoExamenParcial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int venta = 1;
        int carta = 0;
        int oficio = 0;
        int dobleOf = 0;
        int totalVentas = 0;
        int totalDinero = 0;
        boolean repite = true;
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV   ");
        System.out.println("Sistema de ventas de copias      ");
        System.out.println("---------------------------------");
        while(repite) {
            System.out.println("Venta: " + venta);
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            char tipoCopia = scanner.next().toUpperCase().charAt(0);
            System.out.print("Cantidad ? ");
            int cantidad = scanner.nextInt();
            switch (tipoCopia) {
                case 'C':
                    carta += cantidad;
                    totalDinero += cantidad * 3;
                    break;
                case 'O':
                    oficio += cantidad;
                    totalDinero += cantidad * 4;
                    break;
                case 'D':
                    dobleOf += cantidad;
                    totalDinero += cantidad * 6;
                    break;
            }
            venta++;
            System.out.print("Otra venta (S/N) ? ");
            String respuesta = scanner.next().toUpperCase();
            repite = respuesta.equals("S");
        }
        totalVentas = carta + oficio + dobleOf;
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + (venta - 1));
        System.out.println("---------------------------------------");
        System.out.printf("Carta         %5d - $%5d \n", carta , (carta * 3));
        System.out.printf("Oficio        %5d - $%5d \n", oficio , (oficio * 4));
        System.out.printf("Doble Of      %5d - $%5d \n", dobleOf , (dobleOf * 6));
        System.out.println("---------------------------------------");
        System.out.printf("Tot. Ventas : %5d - $%5d \n",totalVentas,totalDinero);

        System.out.print("\nEsta venta es : ");
        if (totalDinero < 50) {
            System.out.println("Venta moderada");
        } else if (totalDinero >= 50 && totalDinero <= 100) {
            System.out.println("Venta frecuente");
        } else {
            System.out.println("Venta superada");
        }

    }
}