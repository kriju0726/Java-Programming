// Converted from Tutorial21.c
import java.util.*;
public class Tutorial21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int factorial(int number)
        {
        if (number == 1 || number == 0)
        {
        return 1;
        }
        else{
        return (number * factorial(number - 1));
        }
        }
        
        int main()
        {
        int num;
        System.out.printf("Enter the no.., whose Factorial you want : ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        System.out.printf("The factorial of %d is %d.\n",num,factorial(num));
        return 0;
        }
    }
}