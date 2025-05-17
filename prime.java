// Converted from prime.c
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int num=1,max=300,flag,i;
        for(num=1; num<=300; num++)
        {
        flag = 0;
        for(i=2;  i<=num/2; i++)
        {
        if(num % i ==0)
        {
        flag=1;
        break;
        }
        }
        if(flag==0 & num!=1)
        System.out.printf("%d \t",num);
        }
        }
    }
}