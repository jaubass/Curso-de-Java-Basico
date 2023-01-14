package Ejercicio06_07_08.ReverseString.Arrays;

public class ArrayBidimensional {

    // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void main(String[] args) {

        int[][] arrayInt;
        arrayInt = new int[][]{ {1, 2, 3}, {5, 6, 7}};

        System.out.println(arrayInt[1][2]); // Output 7
        System.out.println(arrayInt[0][0]); // Output 1

    }


}
