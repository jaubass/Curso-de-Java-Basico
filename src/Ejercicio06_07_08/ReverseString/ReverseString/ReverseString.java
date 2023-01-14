package Ejercicio06_07_08.ReverseString.ReverseString;

public class ReverseString {

    public static void main(String[] args) {

        String originalStr = "Hello World!";
        StringBuilder reversedStr = new StringBuilder();

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr.insert(0, originalStr.charAt(i));
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}
