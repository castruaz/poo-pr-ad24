// Suma de n términos de factorial

import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args) {
        int i,j,n;
        float f,r;
        boolean repite=true;
        String sf="", st="";
        Scanner obj = new Scanner(System.in);
        while(repite){
            System.out.print("\033[H\033[2J");System.out.flush();
            r=0;
            System.out.print("Cuantos números ? "); n = obj.nextInt();
            for(i=1; i<=n; i++) {
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                sf = sf + String.format(" 1 / %d! %s",i, (i==n)?"":"+");
                st = st + String.format(" 1 / %.0f %s",f, (i==n)?"":"+");
                r += (1 / f);
            }
            System.out.println(sf);
            System.out.print(st);
            System.out.printf("= %f\n",r);
            System.out.print("\nDeseas continuar (S/N) ?");
            String respuesta = obj.next().toUpperCase();
            repite = respuesta.equals("S");
        }
        System.out.println("\nProceso terminado ..");
        obj.close();
    }
}
