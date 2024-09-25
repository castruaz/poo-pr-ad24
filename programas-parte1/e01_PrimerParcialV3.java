import java.awt.*;
import java.awt.event.*;

public class e01_PrimerParcialV3 extends Frame implements ActionListener {
    // Definir los componentes de la interfaz
    Label lblNombre, lblEdad, lblSexo, lblTipo;
    TextField txtNombre, txtEdad;
    Choice chSexo, chTipo;
    Button btnInscribir, btnFinalizar, btnSalir, btnAyuda;
    TextArea taResultados;
    
    // Variables para almacenar los resultados
    int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
    int totalHombres = 0, totalMujeres = 0;
    int totalParticipantes = 0, totalRechazados = 0;
    double sumaEdades = 0;
    double totalDineroAlumnos = 0, totalDineroDocentes = 0, totalDineroTrabajadores = 0;
    
    public e01_PrimerParcialV3() {
        // Configuración de la ventana
        setTitle("Inscripción al Curso de Programación");
        setSize(500, 600);
        setLayout(new FlowLayout());
        
        // Crear componentes
        lblNombre = new Label("Nombre:");
        txtNombre = new TextField(20);
        
        lblEdad = new Label("Edad:");
        txtEdad = new TextField(3);
        
        lblSexo = new Label("Sexo:");
        chSexo = new Choice();
        chSexo.add("Hombre");
        chSexo.add("Mujer");
        
        lblTipo = new Label("Tipo de Participante:");
        chTipo = new Choice();
        chTipo.add("Alumno");
        chTipo.add("Docente");
        chTipo.add("Trabajador");
        
        btnInscribir = new Button("Inscribir");
        btnFinalizar = new Button("Finalizar");
        btnSalir = new Button("Salir");  // Botón para salir del programa
        btnAyuda = new Button("Ayuda");  // Botón para mostrar la ventana de ayuda
        
        taResultados = new TextArea(10, 40);
        taResultados.setEditable(false);
        
        // Añadir componentes a la ventana
        add(lblNombre); add(txtNombre);
        add(lblEdad); add(txtEdad);
        add(lblSexo); add(chSexo);
        add(lblTipo); add(chTipo);
        add(btnInscribir); add(btnFinalizar);
        add(btnSalir); add(btnAyuda);  // Añadir los nuevos botones
        add(taResultados);
        
        // Añadir listeners
        btnInscribir.addActionListener(this);
        btnFinalizar.addActionListener(this);
        btnSalir.addActionListener(this);  // Listener para el botón de salir
        btnAyuda.addActionListener(this);  // Listener para el botón de ayuda
        
        // Hacer visible la ventana
        setVisible(true);
        
        // Cerrar la ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInscribir) {
            // Obtener los datos ingresados
            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String sexo = chSexo.getSelectedItem();
            String tipoParticipante = chTipo.getSelectedItem();
            
            // Verificar si el participante es aceptado
            if (edad >= 23) {
                taResultados.append("Bienvenido " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Tipo: " + tipoParticipante + "\n");
                
                // Contar tipo de participante
                if (tipoParticipante.equals("Alumno")) {
                    totalAlumnos++;
                    totalDineroAlumnos += 40;
                } else if (tipoParticipante.equals("Docente")) {
                    totalDocentes++;
                    totalDineroDocentes += 60;
                } else if (tipoParticipante.equals("Trabajador")) {
                    totalTrabajadores++;
                    totalDineroTrabajadores += 80;
                }

                // Contar por sexo
                if (sexo.equals("Hombre")) {
                    totalHombres++;
                } else if (sexo.equals("Mujer")) {
                    totalMujeres++;
                }

                // Sumar edad y aumentar participantes
                sumaEdades += edad;
                totalParticipantes++;
            } else {
                taResultados.append("Lo sentimos, " + nombre + " no cumple con el requisito de edad.\n");
                totalRechazados++;
            }
            
            // Limpiar los campos
            txtNombre.setText("");
            txtEdad.setText("");
        } else if (e.getSource() == btnFinalizar) {
            // Calcular totales
            double totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
            double promedioEdades = (totalParticipantes > 0) ? (sumaEdades / totalParticipantes) : 0;

            // Mostrar resultados en el TextArea
            taResultados.append("\nResumen Final:\n");
            taResultados.append("Total Alumnos: " + totalAlumnos + "\n");
            taResultados.append("Total Docentes: " + totalDocentes + "\n");
            taResultados.append("Total Trabajadores: " + totalTrabajadores + "\n");
            taResultados.append("Total Hombres: " + totalHombres + "\n");
            taResultados.append("Total Mujeres: " + totalMujeres + "\n");
            taResultados.append("Total Participantes: " + totalParticipantes + "\n");
            taResultados.append("Promedio de Edades: " + promedioEdades + "\n");
            taResultados.append("Total Rechazados: " + totalRechazados + "\n");
            taResultados.append("Total Dinero Alumnos: $" + totalDineroAlumnos + "\n");
            taResultados.append("Total Dinero Docentes: $" + totalDineroDocentes + "\n");
            taResultados.append("Total Dinero Trabajadores: $" + totalDineroTrabajadores + "\n");
            taResultados.append("Total Dinero General: $" + totalDineroGeneral + "\n");

            // Mostrar mensaje de ganancias
            String mensajeFinal;
            if (totalDineroGeneral < 50) {
                mensajeFinal = "El evento concluye con ganancias BAJAS.";
            } else if (totalDineroGeneral <= 1000) {
                mensajeFinal = "El evento concluye con ganancias MODERADAS.";
            } else {
                mensajeFinal = "El evento concluye con BUENAS ganancias.";
            }
            taResultados.append(mensajeFinal + "\n");
        } else if (e.getSource() == btnSalir) {
            // Salir del programa
            dispose();
        } else if (e.getSource() == btnAyuda) {
            // Mostrar ventana de ayuda con información del programador y el objetivo del programa
            String mensajeAyuda = "Programador: Juan Pérez\n" +
                                  "Objetivo del programa: Gestionar las inscripciones al curso de programación\n" +
                                  "Se recaban datos de los participantes y se calculan los totales de acuerdo al tipo de participante.";
            // Mostrar un cuadro de diálogo con la información de ayuda
            new DialogAyuda(this, "Ayuda", mensajeAyuda);
        }
    }

    // Clase para mostrar la ventana de ayuda
    class DialogAyuda extends Dialog implements ActionListener {
        public DialogAyuda(Frame parent, String title, String message) {
            super(parent, title, true);
            setLayout(new FlowLayout());
            setSize(300, 150);

            Label lblMensaje = new Label(message);
            add(lblMensaje);

            Button btnCerrar = new Button("Cerrar");
            btnCerrar.addActionListener(this);
            add(btnCerrar);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new e01_PrimerParcialV3();
    }
}
