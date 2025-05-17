// Converted from Recursion.c
import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rec(int a);
        int main()
        {
        int a,fact;
        System.out.printf("Enter a no..: ");
        // scanf("%d",&a); // Note: scanf needs manual input handling in Java
        fact = rec(a);
        System.out.printf("YALUE = %d\n",fact);
        return 0;
        }
        int rec(int a)
        {
        int f;
        if(a==1)
        return (1);
        else
        f=a*rec(a-1);
        return(f);
        }
    }
}