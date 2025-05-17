// Converted from BNRY-DCML.c
import java.util.*;
public class BNRY-DCML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int n,p,i=0,k=0;
        System.out.printf("Enter n...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        while(n>0)
        {
        p=n%2;
        if(p==1)
        {
        k = k + pow(2,i);
        }
        i++;
        n=n/10;
        }
        System.out.printf("The decimal value is %d",k);
        return 0;
        }
    }
}