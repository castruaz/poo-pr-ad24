// Imprime la tabla que el usuario pide, hasta donde lo pida

import java.util.Scanner;

public class p69_TablaMultiplicar {

    public static void TablaMultiplicar(int t, int n) {
        System.out.printf("Tabla del %d\n",t);
        for(int i=1; i<=n; i++) 
            System.out.printf("%d x %d = %d\n",t, i, t*i);
    }
    public static void main(String[] args) {
        int t, n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.print("Que tabla quieres ? "); t = obj.nextInt();
        System.out.print("Hasta donde       ? "); n = obj.nextInt();
        
        TablaMultiplicar(t, n);
        
        //TablaMultiplicar(5,8);
        //TablaMultiplicar(8,10);
        //TablaMultiplicar(20,5);
    }
}
