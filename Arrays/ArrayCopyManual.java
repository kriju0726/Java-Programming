import java.util.*;

public class ArrayCopyManual {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = new int[arr1.length];

    for(int i=0; i<arr1.length; i++){
        arr2[i] = arr1[i];
    }

    System.out.println("Elements of copied array:");
    for(int num : arr2){   
        System.out.print(num + " ");
    }   

    }
}
