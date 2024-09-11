//pe01_SumaTerminos1 - control de lainscripción de los participantes y el dinero recaudado.
//Alumno: Said Emiliano Torres Esparza 3.-C

import java.util.Scanner;
public class t {
    public static void main(String[] args) {
        char nombre, tipoS, tipoP;
        int hombres, mujeres, aceptados, rechazados, edadAlumno, PromEdad, alumnos, docentes, trabajadores, Total;
        hombres=mujeres=aceptados=rechazados=edadAlumno=PromEdad=alumnos=docentes=trabajadores=0;
        Scanner obj = new Scanner(System.in);


        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("============================================\nEscuela Secundaria Benito Juarez\nSistema de Inscripcion\n============================================");

        boolean repite=true;
        while (repite) {
            System.out.println("\nNombre del estudiante      : "); nombre = obj.next().charAt(0);
            System.out.println("\nEdad                         :"); edadAlumno= new Scanner(System.in).nextInt();
            if (edadAlumno < 23){ 
                System.out.println("Solo se acepta a mayores de 23 años");
                rechazados++;
            }
            else if (edadAlumno >= 23) {
            PromEdad = (PromEdad + edadAlumno);
            aceptados++;
            System.out.println("Sexo?  [H]ombre  [M]ujer     :"); 
            tipoS = Character.toUpperCase( obj.next().charAt(0) );
            switch (tipoS) {
                case 'H': hombres++;   break;
                case 'M': mujeres++;   break;   
                default: break;}

            System.out.println("Tipo de participante?\n[A]lumno\n[D]ocente\n[T]rabajador"); 
            tipoP = Character.toUpperCase( obj.next().charAt(0) );
            switch (tipoP) {
                case 'A': alumnos++;    break;
                case 'D': docentes++;   break;   
                case 'T': trabajadores++;   break;  
                default: break;}
            System.out.printf("Bienvenido! %c Eres un(a) %c Tienes %d años y eres un %c", nombre, tipoS, edadAlumno, tipoP);
            }
                System.out.println("\nOtra inscripcion (s/n) ?:");
                String resp = obj.next().toLowerCase();
                repite = resp.equals("s"); 
        }
        Total= (alumnos*40)+(docentes*60)+(trabajadores*80);
        System.out.println("============================================\nResumen de Inscripciones\n============================================");
        System.out.printf("Total de Alumnos: %d\nTotal de docentes: %d\nTotal de Trabajadores: %d\nTotal de Hombres en general: %d\nTotal de Mujeres en general: %d\nTotal de Todos los participantes: %d\nPromedio de la edad de los aceptados: %d\nTotal de rechazados: %d\n", alumnos, docentes, trabajadores, hombres, mujeres, aceptados, PromEdad/aceptados, rechazados);
        System.out.println("============================================\n");
        System.out.printf("Total, dinero recaudado de Alumnos: %d\nTotal, dinero recaudado de Docentes: %d\nTotal, dinero recaudado de Trabajadores: %d\nTotal, dinero en general de todos los participantes: %d\n", alumnos*40, docentes * 60, trabajadores * 80, Total);

        if (Total < 50){ 
            System.out.println("Ganancias BAJAS");
        }
        else if (Total >= 50 && Total <1000) {
            System.out.println("Ganancias MODERADAS");
        }
        else if (Total >= 1000) {
            System.out.println("Ganancias ALTAS");
        }
    }  
}