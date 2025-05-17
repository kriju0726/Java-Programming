// Converted from Tutorial20.c
import java.util.*;
public class Tutorial20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int a,i,c;
        System.out.printf("Enter a no., whose table you want : ");
        // scanf("%d",&a); // Note: scanf needs manual input handling in Java
        System.out.printf("The table of %d is, as follow :- \n", a);
        for ( i = 1; i < 11; i++)
        {
        c = a*i;
        System.out.printf(" %d X %d = %d \n",a,i,c);
        }
        
        return 0;
        }
    }
}