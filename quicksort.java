// Converted from quicksort.c
import java.util.*;
public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        void swap(int* a, int* b) {
        int t = *a;
        *a = *b;
        *b = t;
        }
        
        int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
        i++;
        swap(&arr[i], &arr[j]);
        }
        }
        swap(&arr[i + 1], &arr[high]);
        return (i + 1);
        }
        
        void quickSort(int arr[], int low, int high) {
        if (low < high) {
        int pi = partition(arr, low, high);
        
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
        }
        }
        
        int main() {
        int arr[] = {12,5,0,26,11,29,19,38};
        int n = sizeof(arr) / sizeof(arr[0]);
        int i;
        
        System.out.printf("Original array: ");
        for (i = 0; i < n; i++)
        System.out.printf("%d ", arr[i]);
        System.out.printf("\n");
        
        quickSort(arr, 0, n - 1);
        
        System.out.printf("Sorted array: ");
        for (i = 0; i < n; i++)
        System.out.printf("%d ", arr[i]);
        System.out.printf("\n");
        
        return 0;
        }
    }
}