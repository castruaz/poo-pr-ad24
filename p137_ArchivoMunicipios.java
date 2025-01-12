import java.io.*;

public class  p137_ArchivoMunicipios {
    public static void main(String[] args) {

        String[] nombres = { "Zacatecas", "Fresnillo", "Jerez", "Teul de GO", "Miguel Auza", "Tlatenango de SR", "Villanueva", "Apozl", "Cañitas de Felipe", "Santa Maria de la Guerra" };
        
        File arch = new File("municipios.txt");

        if(arch.exists())
            System.out.println("El archivo ya existe !");
        else {
            try {
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : nombres) 
                    fnombres.write(nombre+"\n");
                System.out.println("Los datos fueron escritos correctamente ...");
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        }
        System.out.println("Longitud final el archivo escrito " + arch.length());
    }
}
