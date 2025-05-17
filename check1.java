// Converted from check1.c
import java.util.*;
public class check1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        void swap(int* a, int* b) {
        int t = *a;
        *a = *b;
        *b = t;
        }
        
        int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int start = low, end = high;
        
        while(start < end){
        while(arr[start] <= pivot){
        start++;
        }
        while(arr[end] > pivot){
        end--;
        }
        if(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        }
        }
        int temp1 = arr[low];
        arr[low] = arr[end];
        arr[end] = temp1;
        
        return end;
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