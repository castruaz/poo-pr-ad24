package p127_MiExcepcion;

// Para crear nuestra propia excepcion, heredamos de la clase Excepcion
// Creamos un constructor, que pase el mensaje de error a la clase base

public class FureraDeRango extends Exception {
    public FureraDeRango(String error) {
        super(error);
    }
}
