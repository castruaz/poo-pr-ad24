
// Mostrar un arreglo usando una función,  lo eleva al cuadrado usando una funcion

public class p86_ArregloMostrar {

    public static void Mostrar(int[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void Cuadrado(int[] a) {
        for(int i=0; i < a.length; i++)
            a[i] = a[i] * a[i];
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,3,5,7};
        int[] arr2 = {1,3,5,7,9,11,12,13};

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nElementos de arr1");  Mostrar(arr1);
        System.out.println("\nElementos de arr2");  Mostrar(arr2);
        System.out.println("\nElementos de arr1 elveados al cuadrado");
        Cuadrado(arr1); Mostrar(arr1);
        System.out.println("\nElementos de arr2 elevados al cuadrado");
        Cuadrado(arr2);Mostrar(arr2);
    }
}