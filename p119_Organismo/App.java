package p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miperro = new Perro("Firulais");
        Perico miPerico = new Perico("Chip");
        
        System.out.print("\033[H\033[2J");
        System.out.println("Mi perro se llama " + miperro.getNombre());
        miperro.respiracion();
        miperro.movimiento();
        miperro.crecimiento();
        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();
        System.out.println("");

        System.out.println("Mi perico se llama " + miPerico.getNombre());
        miPerico.respiracion();
        miPerico.movimiento();
        miPerico.crecimiento();
        miPerico.multiCelular();
        miPerico.sangreCaliente();
        miPerico.volar();
        miPerico.dosPatas();
    }
}
