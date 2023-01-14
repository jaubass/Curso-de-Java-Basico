package Ejercicio06_07_08.ReverseString.Arrays;

public class ArrayUnidimensional {
    public static void main(String args[]) {

        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        int[] arrayInt; // one dimensional integer array declaration
        arrayInt = new int[3]; // creating array of size 3

        arrayInt[0] = 1; // put information into array position 0 (1)
        arrayInt[1] = 2; // put information into array position 1 (2)
        arrayInt[2] = 3; // put information into array position 2 (3)

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        String[] arrayString; // one dimensional String array declaration
        arrayString = new String[3]; // creating array of size 3

        arrayString[0] = "Hello";
        arrayString[1] = "World";
        arrayString[2] = "!";

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

    }
}

// Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
// Cuando un Vector incrementa su capacidad por defecto, lo hace duplicando su tamaño momento en el que necesita hacer una copia de sí mismo,
// con lo que se hace un uso excesivo de recursos.