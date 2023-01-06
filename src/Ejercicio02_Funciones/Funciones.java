package Ejercicio02_Funciones;

public class Funciones {

        public static void main(String[] args) {

            double total = 0;
            total = precioConIva(100.00d);
            System.out.println("El precio con IVA es: " +total);


        }

        public static double precioConIva(double precio) {
            double total = precio + (precio * 21 / 100);
            return total;
        }
}
