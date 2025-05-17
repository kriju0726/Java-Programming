// Converted from range.c.c
import java.util.*;
public class range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int small,big,num,limit,range;
        System.out.printf("Enter the limit : ");
        // scanf("%d",&limit); // Note: scanf needs manual input handling in Java
        System.out.printf("Enter %d numbers\n",limit);
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        small=big=num;
        limit= limit-1;
        while(limit)
        {
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        if(num>big)
        { big=num;}
        if(num<small)
        {small=num;}
        limit--;
        }
        range=big-small;
        System.out.printf("Small no. = %d\n Big no. = %d\n",small,big);
        System.out.printf("Range is %d\n",abs(range));
        }
    }
}