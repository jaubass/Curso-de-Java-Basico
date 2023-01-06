package Ejercicio05_Interfaces;

import java.util.List;


/**
 * Se declaran los metodos NO se implementan
 * Esta interface dice que hay que hacer pero no implementa
 */
public interface CocheCRUD {

    // Guardar Coche
    void save(Coche coches);

    // Recuperar Coche
    List<Coche> findAll();

    // Borrar Coche
    void delete(Coche coches);

}
