import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Check if s1 exists inside s2
        if (s2.contains(s1)) {
            System.out.println("String 1 exists in String 2.");
        } else {
            System.out.println("String 1 does NOT exist in String 2.");
        }

        sc.close();
    }
}
