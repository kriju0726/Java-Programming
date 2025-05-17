// Converted from Array2.c
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        void disp(int *);
        int main()
        {
        int i,sum=0;
        int marks[5];
        for(i=0; i<=4;i++)
        System.out.printf("Enter a no..:");
        // scanf("%d",marks[i]); // Note: scanf needs manual input handling in Java
        disp(&marks[i]);
        
        /*   for(i=0; i<=4;i++)
        sum += marks[i];
        System.out.printf("\nSUM is %d",sum);
        return 0; */
        }
        void disp(int *n)
        {
        System.out.printf("  %d",*n);
        }
    }
}