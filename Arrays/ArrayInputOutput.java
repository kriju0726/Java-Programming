// Program 2: Take array input from user and print
import java.util.*;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}


/*
 import java.util.*;

public class ArrayInputDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (type -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break; // stop input
            list.add(num);
        }

        System.out.println("You entered:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

 */