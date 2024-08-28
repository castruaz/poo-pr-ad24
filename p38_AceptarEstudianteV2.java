
/**
 * p27_AceptarEstudiante - Acepta un estudiante en base a su edad y dos calificaciones
 * edad>=18  y las calificaciones c1>8   y c2>8
 */

 import java.util.Scanner;

 public class p38_AceptarEstudianteV2 {
     public static void main(String[] args) {
         String nombre;
         int edad, sexo;
         double c1, c2, c3, prom=0;
         Scanner obj = new Scanner(System.in);
 
         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("Universidad Patito SA de CV\nSistema de Admision\n");
         System.out.print("Dame tu nombre ? ");        nombre = obj.nextLine();
         System.out.print("Sexo 1-hombre 2-mujer ? "); sexo = obj.nextInt();
         System.out.print("Dame tu edad   ? ");        edad = obj.nextInt();
 
         if (edad < 21 || sexo==1 )
             System.out.println("\nNo aceptamos Hombres ni edades menores a 21 en esta Universidad..");
         else {
            System.out.print("Dame calificacion 1 ? ");   c1 = obj.nextFloat();
            System.out.print("Dame calificacion 2 ? ");   c2 = obj.nextFloat();
            System.out.print("Dame calificacion 3 ? ");   c3 = obj.nextFloat();
            prom = ( c1 + c2 + c3 ) / 3;
             if (prom < 8 )
                System.out.println("\nNo tines el promedio adecuado para estar en esta Universidad...");
             else {
                System.out.printf("%s bienvenid@ a esta Universidad tus calificaciones %.2f , %.2f , %.2f lo permiten", nombre, c1, c2, c3);
                System.out.printf("\nPromedio : %.2f", prom);
             }

         }
         System.out.println("\nGracias por utilizar este sistema ..");
     }
 }