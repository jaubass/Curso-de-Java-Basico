package Ejercicio06_07_08.ReverseString.EntradaSalida;

import java.io.*;
import java.util.Scanner;

public class ficheros {

    public static void main(String[] args) {

        /*
        Muestro por pantalla el archivo passwd
        */

        InputStream fichero;

        {
            try {
                fichero = new FileInputStream("/etc/passwd");

                try {
                    byte datos[] = fichero.readAllBytes();
                    for (byte dato : datos) {
                        System.out.print((char) dato);
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo leer el fichero" + e.getMessage());
                }

            } catch (FileNotFoundException e) {
                System.out.println("El fichero no se ha encontrado" + e.getMessage());
                throw new RuntimeException(e);
            }
        }

        /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        dado en "fileOut".

        Copio en un archivo el contenido de passwd
        */


            try {
                InputStream in = new FileInputStream("/etc/passwd");
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream("/Users/home/Downloads/HelloWorld.txt");
                out.write(datos);
                out.close();
            } catch (Exception e) {
                System.out.println("Ha habido un problema: " + e.getMessage());
            }
        }

    }
