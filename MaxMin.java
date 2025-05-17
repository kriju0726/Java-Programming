// Converted from MaxMin.c
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Structure to store min and max values
        typedef struct {
        int min;
        int max;
        } MinMax;
        
        // Function to find min and max using Divide and Conquer
        MinMax findMinMax(int arr[], int low, int high) {
        MinMax result, left, right;
        int mid;
        
        // If only one element
        if (low == high) {
        result.min = arr[low];
        result.max = arr[low];
        return result;
        }
        
        // If two elements
        if (high == low + 1) {
        if (arr[low] < arr[high]) {
        result.min = arr[low];
        result.max = arr[high];
        } else {
        result.min = arr[high];
        result.max = arr[low];
        }
        return result;
        }
        
        // If more than two elements, divide the array
        mid = (low + high) / 2;
        left = findMinMax(arr, low, mid);
        right = findMinMax(arr, mid + 1, high);
        
        // Compare results of both halves
        result.min = (left.min < right.min) ? left.min : right.min;
        result.max = (left.max > right.max) ? left.max : right.max;
        
        return result;
        }
        
        int main() {
        int arr[] = {3, 5, 1, 8, 2, 9, 10, 7};
        int n = sizeof(arr) / sizeof(arr[0]);
        
        MinMax result = findMinMax(arr, 0, n - 1);
        
        System.out.printf("Minimum element: %d\n", result.min);
        System.out.printf("Maximum element: %d\n", result.max);
        
        return 0;
        }
    }
}