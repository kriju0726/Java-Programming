import java.util.Arrays;
import java.util.Scanner;

public class bnrySrch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (unsorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array (binarySearch works only on sorted arrays)
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Take element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Perform binary search
        int index = Arrays.binarySearch(arr, key);

        // Output result
        if (index >= 0)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found!");

        sc.close();
    }
}

/*
 
  class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1 && nums[0] == target) return 0;

        int n = nums.length;
        int start = 0, end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return mid;
            if(nums[mid] < target) start = mid + 1;
            else end = mid-1;
        }

        return -1;
    }
}
 */

