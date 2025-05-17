// Converted from Tutorial19.c
import java.util.*;
public class Tutorial19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum(int a, int b);
        void printstar(int n)
        {
        for (int i = 0; i < n; i++)
        {
        System.out.printf("%c", '*');
        }
        }
        
        int takenumber()
        {
        int i;
        System.out.printf("Enter a number : ");
        // scanf("%d", &i); // Note: scanf needs manual input handling in Java
        return i;
        }
        int main()
        {
        int a,b,c;
        a = 9;
        b = 76;
        //c = sum(a, b);
        //printstar(7);
        c = takenumber();
        //System.out.printf("The sum is %d \n", c);
        System.out.printf("The number entered is %d \n", c);
        return 0;
        }
        int sum(int a, int b)
        {
        return a + b;
        }
        
    }
}