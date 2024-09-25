import java.util.Scanner;

public class p76_NumeroMenor {
    /**
     * Encuentra el número menor entre cuatro números enteros.
     * @param num1 Primer número entero.
     * @param num2 Segundo número entero.
     * @param num3 Tercer número entero.
     * @param num4 Cuarto número entero.
     * @return El número menor.
     */
    public static int encontrarMenor(int num1, int num2, int num3, int num4) {
        int menor = num1;
        
        if (num2 < menor) 
            menor = num2;
         else if (num3 < menor)
            menor = num3;
        else if (num4 < menor) 
            menor = num4;
        
        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir los cuatro números enteros
        System.out.println("Ingrese cuatro números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        
        // Llamar a la función para encontrar el menor
        int menor = encontrarMenor(num1, num2, num3, num4);
        
        // Imprimir el resultado
        System.out.println("El número menor es: " + menor);
        scanner.close();
    }
    
    
}