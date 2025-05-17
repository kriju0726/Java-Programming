// Converted from 332(d).c
import java.util.*;
public class 332(d) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int arr[15], i, pos=0, neg=0, even=0, odd=0;
        System.out.printf("Enter 15 integers...: \n");
        for(i=0; i<15; i++)
        // { scanf("%d",&arr[i]);   } // Note: scanf needs manual input handling in Java
        
        
        for(i=0; i<15; i++)
        if(arr[i] > 0)
        pos++;
        else
        neg++;
        
        for(i=0; i<15; i++)
        if(arr[i]%2 == 0)
        even++;
        else
        odd++;
        
        System.out.printf("\nPOSITIVE = %d\n",pos);
        System.out.printf("NEG = %d\n",neg);
        System.out.printf("EVEN = %d\n",even);
        System.out.printf("ODD = %d\n",odd);
        
        return 0;
        }
    }
}