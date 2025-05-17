// Converted from L.R.6.1.2.c
import java.util.*;
public class L_R_6_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isArmstrong(int n);
        int main()
        {
        int num;
        System.out.printf("Enter..:");
        // scanf("%d",num); // Note: scanf needs manual input handling in Java
        if(isArmstrong(num))
        { System.out.printf("%d is an Armstrongno.\n",num);}
        else
        System.out.printf("%d is not an Armstrong no.\n",num);
        return 0;
        }
        isArmstrong(int n)
        {
        int res,count=0,a=n;
        while(a!=0)
        {
        res=a%10;
        a=a/10;
        count=count+(res*res*res);
        }
        if(count == n)
        {return 1;}
        else
        {return 0;}
        }
    }
}