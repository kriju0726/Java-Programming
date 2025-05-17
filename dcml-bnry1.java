// Converted from dcml-bnry1.c
import java.util.*;
public class dcml-bnry1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bnry_eqvlnc(int);
        int main()
        {
        int n1,n2,r,b=0,base=1,BE;
        System.out.printf("Enter your two no...: ");
        // scanf("%d %d",&n1,&n2); // Note: scanf needs manual input handling in Java
        
        System.out.printf("BINARY EQVALNC of n1..: %d\n",bnry_eqvlnc(n1));
        System.out.printf("BINARY EQVALNC of n1..: %d",bnry_eqvlnc(n2));
        
        }
        int bnry_eqvlnc(int n)
        {
        int r,b=0,base=1;
        while(n>0)
        {
        r = n%2;
        b = b+r*base;
        n=n/2;
        base = base*10;
        }
        return (b);
        }
    }
}