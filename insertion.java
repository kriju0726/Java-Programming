// Converted from insertion.c
import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        void insertionSort(int arr[], int n) {
        int i, key, j;
        for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        
        while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
        }
        arr[j + 1] = key;
        }
        }
        
        int main() {
        int arr[] = {0,1,0,25,64,12,20, 6};
        int n = sizeof(arr) / sizeof(arr[0]);
        int i;
        
        System.out.printf("Original array: ");
        for (i = 0; i < n; i++)
        System.out.printf("%d ", arr[i]);
        System.out.printf("\n");
        
        insertionSort(arr, n);
        
        System.out.printf("Sorted array: ");
        for (i = 0; i < n; i++)
        System.out.printf("%d ", arr[i]);
        System.out.printf("\n");
        
        return 0;
        }
        
        
        
    }
}