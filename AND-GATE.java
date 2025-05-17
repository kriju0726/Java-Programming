import java.util.Scanner;

public class ANDGate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ar1 = new int[5];
        int[] ar2 = new int[5];
        int[] ar3 = new int[5];

        System.out.println("Enter 5 binary numbers (0 or 1) for ar1:");
        for (int i = 0; i < 5; i++) {
            ar1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 binary numbers (0 or 1) for ar2:");
        for (int i = 0; i < 5; i++) {
            ar2[i] = sc.nextInt();
        }

        // AND logic
        for (int i = 0; i < 5; i++) {
            if (ar1[i] == 1 && ar2[i] == 1) {
                ar3[i] = 1;
            } else {
                ar3[i] = 0;
            }
        }

        System.out.print("Result of AND operation (ar3): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(ar3[i] + " ");
        }

        sc.close();
    }
}
