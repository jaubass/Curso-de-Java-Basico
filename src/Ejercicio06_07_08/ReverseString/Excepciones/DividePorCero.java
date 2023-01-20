package Ejercicio06_07_08.ReverseString.Excepciones;

/*
Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será
capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
Finalmente, mostraremos en cualquier caso: "Demo de código".
 */

public class DividePorCero {
    public static void main(String[] args) {

        DividePorCero(4, 2);
    }

    public static int DividePorCero (int A, int B) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException ae) {
            System.out.println("La dividsion no es posible");
        } finally {
            System.out.println("Codigo de demo");
        }
        return resultado;
    }
}
