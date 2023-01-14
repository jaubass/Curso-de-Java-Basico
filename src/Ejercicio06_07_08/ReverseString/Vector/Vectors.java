package Ejercicio06_07_08.ReverseString.Vector;
import java.util.Vector;

// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

public class Vectors {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("Jazz");
        vector.add("Funk");
        vector.add("Reggae");
        vector.add("Classic");
        vector.add("Disco");

        System.out.println("Vector elements:"); // print all vector content (5 elements)
        System.out.println(vector);
        System.out.println();
        System.out.println("Print only one element:");
        System.out.println(vector.get(2));

        vector.remove(1); // remove second vector element (Funk)
        vector.remove(1); // remove third vector element (Reggae)
        System.out.println();
        System.out.println("Remove second and third vector element (Funk and Reggae)");
        System.out.println(vector); // print all vector content (3 elements)





    }


}
