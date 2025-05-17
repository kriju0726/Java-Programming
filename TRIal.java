// Converted from TRIal.c
import java.util.*;
public class TRIal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frequency(int n,int arr[],int val);
        int main()
        {
        int n,val,i,fact;
        System.out.printf("How many no...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        int arr[n];
        System.out.printf("Entered your listed no...: ");
        for(i=0; i<n; i++)
        {
        // scanf("%d",&arr[i]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("Entered your search no...: ");
        // scanf("%d",&val); // Note: scanf needs manual input handling in Java
        fact=frequency(n,arr,val);
        // System.out.printf("\n position is %d",fact);
        return 0;
        }
        int frequency(int n,int arr[],int val)
        {
        int flag=0,pos=0;System.out.printf("Hello");
        for(int i=0; i<n; i++)
        {
        { if(arr[i]==val)
        flag=1;
        
        }pos=pos+1;
        
        }//pos=pos+1;
        if(flag==1)
        System.out.printf("\n%d is position values",pos);
        // return pos;
        
        }
    }
}