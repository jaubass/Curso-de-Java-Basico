package POO;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

public class Main {

    public static void main(String[] args) {

        SmartPhone iphone8 = new SmartPhone("Apple Inc", "iPhone 8", 2018, 256d, "iOS 16");
        SmartWatch iWatch4 = new SmartWatch("Apple Inc", "Apple Watch Series 8", 2022, "396 x 484 píxeles", "Square");

        System.out.println("Fabricante: " +iphone8.maker);
        System.out.println("Modelo: " +iphone8.model);
        System.out.println("Año: " +iphone8.year);
        System.out.println("Capacidad: " +iphone8.capacity);
        System.out.println("Software: " +iphone8.software);
        System.out.println("---------------");
        System.out.println("Fabricante: " +iWatch4.maker);
        System.out.println("Modelo: " +iWatch4.model);
        System.out.println("Año: " +iWatch4.year);
        System.out.println("Tamaño pantalla: " +iWatch4.screenSize);
        System.out.println("Forma: " +iWatch4.screenForm);


    }
}
