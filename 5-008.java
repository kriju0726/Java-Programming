// Converted from 5-008.c
import java.util.*;
public class 5-008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int n,i,p,a[8];
        System.out.printf("Enter n...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        for(i=7; i>=0; i--)
        {
        p=n%2;
        if(p==1)
        {
        a[i]=1;
        }
        else
        a[i]=0;
        
        n=n/10;
        }
        
        for(i=0; i<8; i++)
        {
        System.out.printf("%d ",a[i]);
        }
        return 0;
        }
    }
}