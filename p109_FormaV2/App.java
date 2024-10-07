package p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo("Rojo", true, 10.23));
        formas.add(new Circulo("Verde", false, 99.12));
        formas.add(new Rectangulo("Amarillo", false, 10, 20));
        formas.add(new Rectangulo("Azul", true, 15, 44));

        System.out.println("\nTodas las formas :");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        System.out.println("\nCalculando áreas y perimetros de las figuras:");
         
        for (Forma forma : formas) {
            System.out.println("La forma es un " + (forma instanceof Circulo?"Circulo":"Rectangulo"));
            System.out.println("El áea es       : " + forma.getArea() );
            System.out.println("El perimetro es : " + forma.getPerimetro() );
        }
    }
}
