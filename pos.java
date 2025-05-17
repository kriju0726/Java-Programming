// Converted from pos.c
import java.util.*;
public class pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int man()
        {
        int a[n],pos=0,neg=0,even=0,odd=0,i,zero=0;
        System.out.printf("Enter %d integer...",n);
        for(i=0; i<n; i++)
        {
        // scanf("%d\n",&a[i]); // Note: scanf needs manual input handling in Java
        if(a[i]==0)
        {zero++;}
        else if(a[i]>0)
        pos++;
        else
        neg++;
        if(a[i]==0)
        {}
        else if(a[i] % 2==0)
        even++;
        else
        odd++;
        }
        System.out.printf("\nPOSITIVE = %d\n",pos);
        System.out.printf("NEGATIVE = %d\n",neg);
        System.out.printf("EVEN = %d\n",even);
        System.out.printf("ODD = %d\n",odd);
        System.out.printf("ZERO = %d\n",zero);
        return 0;
        }
    }
}