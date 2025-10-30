import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwoDArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------------------
        // 🔹 FIXED SIZE 2D ARRAYLIST
        // -------------------------------
        System.out.print("Enter number of rows (fixed): ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns (fixed): ");
        int cols = sc.nextInt();

        // Create a 2D ArrayList of fixed size with default values (0)
        ArrayList<ArrayList<Integer>> fixedList = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            // Create each row with 'cols' zeroes
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(cols, 0));
            fixedList.add(row);
        }

        System.out.println("\nNow, enter elements for FIXED SIZE 2D ArrayList:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element[%d][%d]: ", i, j);
                int val = sc.nextInt();
                fixedList.get(i).set(j, val);  // replace 0 with user input
            }
        }

        System.out.println("\n✅ Fixed Size 2D ArrayList:");
        print2DArrayList(fixedList);

        // -------------------------------
        // 🔹 DYNAMIC SIZE 2D ARRAYLIST
        // -------------------------------
        System.out.print("\nEnter number of rows (dynamic): ");
        int dRows = sc.nextInt();

        ArrayList<ArrayList<Integer>> dynamicList = new ArrayList<>();

        for (int i = 0; i < dRows; i++) {
            System.out.printf("Enter number of elements in row %d: ", i);
            int dCols = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < dCols; j++) {
                System.out.printf("Element[%d][%d]: ", i, j);
                int val = sc.nextInt();
                row.add(val);
            }
            dynamicList.add(row);
        }

        System.out.println("\n✅ Dynamic Size 2D ArrayList:");
        print2DArrayList(dynamicList);

        sc.close();
    }

    // Helper function to print 2D ArrayList
    public static void print2DArrayList(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> row : list) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


