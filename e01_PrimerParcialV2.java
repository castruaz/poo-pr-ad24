import javax.swing.JOptionPane;

public class e01_PrimerParcialV2
 {
    public static void main(String[] args) {
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalParticipantes = 0, totalRechazados = 0;
        double sumaEdades = 0;
        double totalDineroAlumnos = 0, totalDineroDocentes = 0, totalDineroTrabajadores = 0;
        
        boolean continuar = true;
        
        while (continuar) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del participante:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del participante:"));
            String sexo = JOptionPane.showInputDialog("Ingrese el sexo del participante (Hombre/Mujer):");
            String tipoParticipante = JOptionPane.showInputDialog("Ingrese el tipo de participante (Alumno/Docente/Trabajador):");
            
            // Verificar si es aceptado en el curso
            if (edad >= 23) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + ", " +
                        "Edad: " + edad + ", Sexo: " + sexo + ", Tipo: " + tipoParticipante);

                // Conteo por tipo de participante
                if (tipoParticipante.equalsIgnoreCase("Alumno")) {
                    totalAlumnos++;
                    totalDineroAlumnos += 40;
                } else if (tipoParticipante.equalsIgnoreCase("Docente")) {
                    totalDocentes++;
                    totalDineroDocentes += 60;
                } else if (tipoParticipante.equalsIgnoreCase("Trabajador")) {
                    totalTrabajadores++;
                    totalDineroTrabajadores += 80;
                }

                // Conteo por sexo
                if (sexo.equalsIgnoreCase("Hombre")) {
                    totalHombres++;
                } else if (sexo.equalsIgnoreCase("Mujer")) {
                    totalMujeres++;
                }

                // Sumar edades y participantes
                sumaEdades += edad;
                totalParticipantes++;
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, " + nombre + 
                        " no cumple con el requisito de edad.");
                totalRechazados++;
            }

            // Preguntar si desea agregar otro participante
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea inscribir otro participante?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }

        // Cálculos finales
        double totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdades = (totalParticipantes > 0) ? (sumaEdades / totalParticipantes) : 0;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Total Alumnos: " + totalAlumnos +
                "\nTotal Docentes: " + totalDocentes +
                "\nTotal Trabajadores: " + totalTrabajadores +
                "\nTotal Hombres: " + totalHombres +
                "\nTotal Mujeres: " + totalMujeres +
                "\nTotal Participantes: " + totalParticipantes +
                "\nPromedio de Edades: " + promedioEdades +
                "\nTotal Rechazados: " + totalRechazados +
                "\nTotal Dinero Alumnos: $" + totalDineroAlumnos +
                "\nTotal Dinero Docentes: $" + totalDineroDocentes +
                "\nTotal Dinero Trabajadores: $" + totalDineroTrabajadores +
                "\nTotal Dinero General: $" + totalDineroGeneral);

        // Mensaje final
        String mensajeFinal;
        if (totalDineroGeneral < 50) {
            mensajeFinal = "El evento concluye con ganancias BAJAS.";
        } else if (totalDineroGeneral <= 1000) {
            mensajeFinal = "El evento concluye con ganancias MODERADAS.";
        } else {
            mensajeFinal = "El evento concluye con BUENAS ganancias.";
        }

        JOptionPane.showMessageDialog(null, mensajeFinal);

    }
}
