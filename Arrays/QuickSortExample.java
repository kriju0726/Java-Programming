import java.util.*;

// QuickSort in Java
public class QuickSortExample {

    // Function to perform partitioning
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choosing the last element as pivot
        int i = low - 1;        // pointer for smaller element

        for (int j = low; j < high; j++) {
            // if current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place the pivot at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // return the pivot index
    }

    // QuickSort recursive function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partition the array
            int pi = partition(arr, low, high);

            // recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Unsorted array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
