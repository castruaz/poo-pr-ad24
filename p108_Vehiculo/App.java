package p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Compacto cp1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Compacto cp2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        Camioneta cm1 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Camioneta cm2 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        System.out.println("Datos de los Vehiculos de la flota");
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cm1);
        System.out.println(cm2);
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(cp1);
        vehiculos.add(cp2);
        vehiculos.add(cm1);
        vehiculos.add(cm2);

        System.out.println("Calculando el total de precio de todos los vehículos ...");
        double suma=0;
        for (Vehiculo vehiculo : vehiculos) {
            suma += vehiculo.getPrecio();
            System.out.println(vehiculo.getPrecio());
        }
        System.out.println("La suma de precios es : " + suma);

    }
}