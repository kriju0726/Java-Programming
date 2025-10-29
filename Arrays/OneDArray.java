import java.util.*;

class OneDArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Fixed Size...");
        for (int i=0; i<nums.length; i++) {  System.out.print(nums[i] + " ");  }

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nNow.. Dynamic Size Array...");
        System.out.print("Enter new array size: ");
        int size = sc.nextInt();

        int[] pnums = new int[size];

        System.out.printf("Please!! Enter %d elements:\n", size);
        for (int i = 0; i < size; i++) {   pnums[i] = sc.nextInt();    }

        System.out.print("Your entered elements are: ");
        for (int i = 0; i < pnums.length; i++) {
            System.out.print(pnums[i] + " ");
        }

        sc.close(); // ✅ good practice
    }
}
