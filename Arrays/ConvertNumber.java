import java.util.*;

public class ConvertNumber {
    public static void main(String[] args) {
        int n = 11;

        String binary = Integer.toBinaryString(n);
        String octal = Integer.toOctalString(n);
        String hex = Integer.toHexString(n);

        System.out.println("Decimal: " + n);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex.toUpperCase());
    }
}

