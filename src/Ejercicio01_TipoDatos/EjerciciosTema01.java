package Ejercicio01_TipoDatos;

public class EjerciciosTema01 {

    public static void main(String[] args) {

        byte numeroPequeño = 4;
        short enteroMayorCapacidad = 8;
        int entero = 10;
        long enteroGrande = 987654321;

        float decimalSimple = 10.00f;
        double decimal = 10.00123456789012d;

        boolean bool = true;
        String texto = "Hola Mundo!";



        System.out.println("Esto es un numero entero " +numeroPequeño);
        System.out.println("Esto es un numero entero " +enteroMayorCapacidad);
        System.out.println("Esto es un numero entero " +entero);
        System.out.println("Esto es un numero entero grande " +enteroGrande);
        System.out.println("Esto es un numero decimal simple " +decimalSimple);
        System.out.println("Esto es un numero decimal " +decimal);
        System.out.println("Esto es un tipo booleano " +bool);
        System.out.println("Esto es una cadena de texto " +texto);

    }
}