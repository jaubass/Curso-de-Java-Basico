package Ejercicio05_Interfaces;

public class Coche {

    // 1. Atributos
    String marca;
    String modelo;
    int puertas;
    int year;

    public Coche(){}

    public Coche(String marca, String modelo, int puertas, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", year=" + year +
                '}';
    }
}
