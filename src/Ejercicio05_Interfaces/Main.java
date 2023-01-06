package Ejercicio05_Interfaces;

import java.util.List;

/**
 * Crear una interfaz CocheCRUD.
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 * Como métodos de CocheCRUD podemos poner:
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 */

public class Main {

    static CocheCRUD cocheCRUD;

    public static void main(String[] args) {

        cocheCRUD.findAll();
        cocheCRUD.save(new Coche());

        CocheCRUDMySQL cocheCRUD = new CocheCRUDMySQL();

        Coche car1 = new Coche("Seat", "Leon", 5, 2000);
        Coche car2 = new Coche("Fiat", "500", 3, 2010);
        Coche car3 = new Coche("Honda", "Civic", 5, 2012);

        cocheCRUD.save(car1);
        cocheCRUD.save(car2);
        cocheCRUD.save(car3);

        List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);


    }
}

