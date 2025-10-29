// public class SelectionSort {
    
//     // Method to perform Selection Sort
//     public static void selectionSort(int[] arr) {
//         int n = arr.length;

//         // Traverse through all array elements
//         for (int i = 0; i < n - 1; i++) {
//             // Assume the current index is the minimum
//             int minIndex = i;

//             // Find the index of the minimum element in the remaining array
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }

//             // Swap the found minimum element with the first element
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     // Method to print the array
//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     // Main method
//     public static void main(String[] args) {
//         int[] arr = {64, 25, 12, 22, 11};
//         System.out.println("Original array:");
//         printArray(arr);

//         selectionSort(arr);

//         System.out.println("Sorted array:");
//         printArray(arr);
//     }
// }


public class SelectionSortSimple {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // print sorted array
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
