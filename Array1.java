// Converted from Array1.c
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg, sum = 0, i;
        int[] marks = new int[10];  // Array declaration

        // Input
        for (i = 0; i < 10; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();  // Reading input
        }

        // Summing values
        for (i = 0; i < 10; i++) {
            sum += marks[i];  // Reading data from array
        }

        avg = sum / 10;
        System.out.println("Average marks = " + avg);
    }
}
