package p118_Calculadora;

public class Calculadora implements Calcular {

    public void mostrarResultado(double resultado) {
        System.out.printf("%,.2f\n", resultado);        
    }

    public void restar(double x, double y) {
        double res = x - y;
        mostrarResultado(res);
    }

    public void sumar(double x, double y) {
        double res = x + y;
        mostrarResultado(res);
    }

    public void dividir(double x, double y) {
        double res = x / y;
        mostrarResultado(res);
    }
    
    public void multiplicar(double x, double y) {
        double res = x * y;
        mostrarResultado(res);
    }
}
