// Converted from ACKERmann.c
import java.util.*;
public class ACKERmann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acker(int,int);
        int main()
        {
        int a,b;
        System.out.printf("Enter two no.. for ACKERMANN Function..: ");
        // scanf("%d %d",&a,&b); // Note: scanf needs manual input handling in Java
        System.out.printf("Value is %d",acker(a,b));
        return 0;
        }
        int acker(int a,int b)
        {
        int m=a,n=b;
        if(m==0)
        { return n+1; }
        else if(m>0 && n==0)
        { return acker(m-1,1); }
        else
        { return  acker(m-1,acker(m,(n-1)));}
        }
    }
}