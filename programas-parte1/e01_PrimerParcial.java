import java.util.Scanner;

public class e01_PrimerParcial
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorAlumnos = 0;
        int contadorDocentes = 0;
        int contadorTrabajadores = 0;
        int contadorHombres = 0;
        int contadorMujeres = 0;
        int contadorRechazados = 0;
        int edadTotal = 0;
        int dineroAlumnos = 0;
        int dineroDocentes = 0;
        int dineroTrabajadores = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el nombre del participante:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad del participante:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el sexo del participante (H/M):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            System.out.println("Ingrese el tipo de participante (Alumno/Docente/Trabajador):");
            String tipo = scanner.nextLine();

            if (edad >= 23) {
                System.out.println("Bienvenido, " + nombre + " de " + edad + " años, " + sexo + ", " + tipo);

                switch (tipo) {
                    case "Alumno":
                        contadorAlumnos++;
                        dineroAlumnos += 40;
                        break;
                    case "Docente":
                        contadorDocentes++;
                        dineroDocentes += 60;
                        break;
                    case "Trabajador":
                        contadorTrabajadores++;
                        dineroTrabajadores += 80;
                        break;
                }

                if (sexo == 'H') {
                    contadorHombres++;
                } else if (sexo == 'M') {
                    contadorMujeres++;
                }

                edadTotal += edad;
            } else {
                System.out.println("Lo sentimos, " + nombre + " no cumple con la edad mínima requerida.");
                contadorRechazados++;
            }

            System.out.println("Desea continuar? (S/N)");
            String respuesta = scanner.nextLine().toUpperCase();
            if (respuesta.equals("N")) {
                continuar = false;
            }

            scanner.nextLine(); // Consumir el salto de línea
        }

        int totalParticipantes = contadorAlumnos + contadorDocentes + contadorTrabajadores;
        double promedioEdad = (double) edadTotal / totalParticipantes;
        int dineroTotal = dineroAlumnos + dineroDocentes + dineroTrabajadores;

        System.out.println("Estadísticas:");
        System.out.println("Total de Alumnos: " + contadorAlumnos);
        System.out.println("Total de Docentes: " + contadorDocentes);
        System.out.println("Total de Trabajadores: " + contadorTrabajadores);
        System.out.println("Total de Hombres: " + contadorHombres);
        System.out.println("Total de Mujeres: " + contadorMujeres);
        System.out.println("Total de Participantes: " + totalParticipantes);
        System.out.println("Promedio de Edad: " + promedioEdad);
        System.out.println("Total de Rechazados: " + contadorRechazados);
        System.out.println("Dinero Recaudado:");
        System.out.println("Alumnos: " + dineroAlumnos);
        System.out.println("Docentes: " + dineroDocentes);
        System.out.println("Trabajadores: " + dineroTrabajadores);
        System.out.println("Total: " + dineroTotal);

        if (dineroTotal < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (dineroTotal >= 50 && dineroTotal < 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }
    }
}