// Converted from intersearch.c
import java.util.*;
public class intersearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int interpolationSearch(int arr[], int n, int target) {
        int left = 0, right = n - 1;
        
        while (left <= right && target >= arr[left] && target <= arr[right]) {
        if (left == right) {
        if (arr[left] == target)
        return left;
        return -1;
        }
        
        int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);
        
        if (arr[pos] == target)
        return pos;
        
        if (arr[pos] < target)
        left = pos + 1;
        else
        right = pos - 1;
        }
        
        return -1;
        }
        
        int main() {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int n = sizeof(arr) / sizeof(arr[0]);
        int target = 16;
        
        int result = interpolationSearch(arr, n, target);
        
        if (result != -1)
        System.out.printf("Element %d found at index %d\n", target, result);
        else
        System.out.printf("Element %d not found in the array\n", target);
        
        return 0;
        }
    }
}