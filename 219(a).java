// Converted from 219(a).c
import java.util.*;
public class 219(a) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rec_func(int num);
        int non_rec_func(int num);
        
        int main()
        {
        int num,rec,non_rec;
        System.out.printf("Enter an integer : ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        
        rec = rec_func(num);
        non_rec = non_rec_func(num);
        System.out.printf("\nREC == %d\n",rec);
        System.out.printf("NON_REC == %d\n",non_rec);
        return 0;
        }
        int rec_func(int num)
        {
        if(num==0)
        {
        return 0;
        }
        return(num%10 + rec_func(num/10));
        }
        int non_rec_func(int num)
        {
        int res,count=0;
        while(num!=0)
        {
        res = num% 10;
        count=count+res;
        num=num/10;
        }
        return count;
        }
    }
}