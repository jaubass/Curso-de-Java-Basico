package Ejercicio06_07_08.ReverseString.ArrayList;

// Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrList {

    public static void main(String[] args) {

        ArrayList<String> music = new ArrayList<>();
        music.add("Funk");
        music.add("Jazz");
        music.add("Reggae");
        music.add("Metal");
        music.add("Fusion");
        System.out.println("ArrayList List:");
        System.out.println(music);

        // ArrayList to LinkedList
        LinkedList<String> linkList = new LinkedList<>(music);
        System.out.println("Linked List:");
        System.out.println(linkList);

    }

}
