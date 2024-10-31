package p127_MiExcepcion;

public class App {

    public static int sumar(int a, int b) throws FureraDeRango {
        if(a>100 || b>100) throw new FureraDeRango("Valores fuera de rango");
        return a + b;
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        try {
            System.out.println("La suma es " + sumar(100,100));
            System.out.println("La suma es " + sumar(200,100));
            
        } catch (FureraDeRango e) {
             System.out.println(e.getMessage());
        }

    }
}
