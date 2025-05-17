// Converted from BinarySearch2.c
import java.util.*;
public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int binarySearch(int arr[], int left, int right, int target) {
        while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target)
        return mid;
        
        if (arr[mid] < target)
        left = mid + 1;
        else
        right = mid - 1;
        }
        
        return -1;
        }
        
        int main() {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int n = sizeof(arr) / sizeof(arr[0]);
        int target = 122;
        
        int result = binarySearch(arr, 0, n - 1, target);
        
        if (result != -1)
        System.out.printf("Element %d found at index %d\n", target, result);
        else
        System.out.printf("Element %d not found in the array\n", target);
        
        return 0;
        }
    }
}