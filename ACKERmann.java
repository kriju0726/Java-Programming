import java.util.Scanner;

public class ACKERmann {

    // Ackermann function defined as a static method
    public static int acker(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return acker(m - 1, 1);
        } else {
            return acker(m - 1, acker(m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers for ACKERMANN Function: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = acker(m, n);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
