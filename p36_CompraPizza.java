/**
 * p36_CompraPizza - Administra la compra de pizzas
 * // Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
// compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que
// permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de
// compra con descuento.
 */

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        float precio=0, subtotal=0,total=0, desc=0, tasa=0;
        int cantidad = 0, tam;
        String tamaño="";
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Administra la venta de pizzas :\n");
        System.out.println("1 . Chica  ....... $ 5 ");
        System.out.println("2 . Mediana....... $ 10 ");
        System.out.println("3 . Grande ....... $ 20 ");
        System.out.print("Elige ? "); tam = obj.nextInt();
        switch (tam) {
            case 1: precio = 5; tamaño="Chica";break;                
            case 2: precio = 10; tamaño="Mediana";break;                
            case 3: precio = 20; tamaño="Grande";break;                
        }
        System.out.print("Cantidad ? "); cantidad = obj.nextInt();
        subtotal = precio * cantidad;
        if(subtotal>2000) tasa = 0.15f;
        desc = subtotal * tasa;
        total = subtotal - desc;
        System.out.printf("\nCompraste %d pizzas %s\nPrecio: %.2f\nSubtotal: %.2f\nDescuento: %.2f\nTotal: %.2f ", cantidad, tamaño, precio, subtotal, desc, total);
    }
}


