// Converted from BBLEsort.c
import java.util.*;
public class BBLEsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int n,i,j,d,temp,k;
        System.out.printf("How many elements..? ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        int a[n];
        System.out.printf("Enter elements..: ");
        for(i=0; i<n; i++)
        {
        // scanf("%d",&a[i]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("\nAFTER descending SORTING....: ");
        for(j=0; j<n-1; j++)
        {
        for(k=0; k<n-1; k++)
        {
        if(a[k]<a[k+1])
        {
        temp=a[k];
        a[k]=a[k+1];
        a[k+1]=temp;
        }
        }
        }
        for(d=0; d<n; d++)
        {
        System.out.printf("%d ",a[d]);
        }
        System.out.printf("\nAFTER ascending SORTING....: ");
        for(j=0; j<n-1; j++)
        {
        for(k=0; k<n-1; k++)
        {
        if(a[k]>a[k+1])
        {
        temp=a[k];
        a[k]=a[k+1];
        a[k+1]=temp;
        }
        }
        }
        for(d=0; d<n; d++)
        {
        System.out.printf("%d ",a[d]);
        }
        return 0;
        }
    }
}