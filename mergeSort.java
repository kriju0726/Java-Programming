// Converted from mergeSort.c
import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        void mergeSort(int,int);
        void mergeArray(int,int,int,int);
        void printArray(int,int);
        int arr[MAX];
        int main()
        {
        int i,n;
        System.out.printf(" n? "); scanf("%d",&n);
        System.out.printf("\nEnter %d elements to sort\n",n);
        for(i=0; i<n; i++)
        // scanf("%d",&arr[i]); // Note: scanf needs manual input handling in Java
        System.out.printf("\nOriginal array : ");printArray(0,n-1);
        
        mergeSort(0,n-1);
        
        System.out.printf("Sorted Array : ");printArray(0,n-1);
        }
        void printArray(int a,int b)
        {
        for(int i=a; i<=b; i++)
        System.out.printf(" %d ",arr[i]);
        System.out.printf("\n");
        }
        void mergeSort(int i,int j)
        {
        int m;
        if(i < j)
        {
        m = (i+j)/2;
        mergeSort(i,m);
        mergeSort(m+1,j);
        mergeArray(i,m,m+1,j);
        } }
        void mergeArray(int a,int b,int c,int d)
        {
        int temp[MAX],i=a,j=c,k=0;
        
        while(i<=b && j<=d)
        {
        if(arr[i] < arr[j])
        temp[k++] = arr[i++];
        else
        temp[k++] = arr[j++];
        }
        while(i<=b)
        temp[k++] = arr[i++];
        
        while(j <= d)
        temp[k++] = arr[j++];
        
        for(i=a,j=0; i<=d; i++,j++)
        arr[i] = temp[j];
        }
        
        
    }
}