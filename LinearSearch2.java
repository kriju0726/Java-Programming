// Converted from LinearSearch2.c
import java.util.*;
public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int linearSearch(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
        if (arr[i] == target)
        return i;
        }
        return -1;
        }
        
        int main() {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int n = sizeof(arr) / sizeof(arr[0]);
        int target = 38;
        
        int result = linearSearch(arr, n, target);
        
        if (result != -1)
        System.out.printf("Element %d found at index %d\n", target, result);
        else
        System.out.printf("Element %d not found in the array\n", target);
        
        return 0;
        }
    }
}