// Converted from 3.16.c
import java.util.*;
public class 3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main ()
        {
        int i,j,k,n,a=0,b=1,c,d;
        System.out.printf("Enter n...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        for(i=0; i<n; i++)
        {
        c=a+b;
        a=b;
        b=c;
        d=a+b;
        
        
        for(j=c+1; j<d; j++)
        {
        if(j<=n)
        System.out.printf("  %d",j);
        else
        {break;}
        }
        }
        }
    }
}