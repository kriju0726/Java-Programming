// Converted from fiboNacci.c
import java.util.*;
public class fiboNacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibo(int);
        int main()
        {
        int fib,num;
        System.out.printf("Enter no...: ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        for(fib=0; fib<num; fib++)
        {
        System.out.printf("  %d",fibo(fib));
        }
        return 0;
        }
        int fibo(int x)
        {
        if(x==0)
        return 0;
        else if(x==1)
        return 1;
        else
        return (fibo(x-1) + fibo(x-2));
        }
    }
}