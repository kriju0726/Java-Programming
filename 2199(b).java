// Converted from 2199(b).c
import java.util.*;
public class 2199(b) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime_fact(int num);
        int main()
        {
        int prime,num;
        System.out.printf("Enter a No..: ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        prime = prime_fact(num);
        //System.out.printf("PRIME FACTORS ARE %d",prime);
        return 0;
        }
        int prime_fact(int num)
        {
        int x;
        for(x=2; x<=num; x++)
        {
        if(num%x == 0)
        {
        System.out.printf("    %d",x);
        prime_fact(num/x);
        break;
        }
        }
        }
    }
}