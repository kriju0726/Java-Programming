import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {

        String str = "hello world";

        // length of string
        int length = str.length();

        // convert to uppercase
        String upper = str.toUpperCase();

        System.out.println("Original String: " + str);
        System.out.println("Length: " + length);
        System.out.println("Uppercase: " + upper);
    }
}
