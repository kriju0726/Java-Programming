// Converted from 214(b).c
import java.util.*;
public class 214(b) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum(int,int,int,int,int);
        float avg(int,int,int,int,int);
        float dvn(int,int,int,int,int);
        int main()
        {
        int a,b,c,d,e;
        
        System.out.printf("Enter 5 integers...: ");
        // scanf("%d %d %d %d %d",&a,&b,&c,&d,&e); // Note: scanf needs manual input handling in Java
        System.out.printf("SUM = %d\n",sum(a,b,c,d,e));
        System.out.printf("AVERAGE = %f\n",avg(a,b,c,d,e));
        System.out.printf("STD. DEVIATION = %f",dvn(a,b,c,d,e));
        
        return 0;
        }
        int sum(int a,int b,int c,int d,int e)
        {
        return (a+b+c+d+e);
        }
        float avg(int a,int b,int c,int d,int e)
        {
        return (a+b+c+d+e)/5;
        }
        float dvn(int a,int b,int c,int d,int e)
        {
        int n=5;
        float tot,p,final;
        p=avg(a,b,c,d,e);
        tot = ((a-p)*(a-p)+ (b-p)*(b-p)+(c-p)*(c-p)+(d-p)*(d-p)+(e-p)*(e-p))/n;
        final = sqrt(tot);
        return final;
        }
    }
}