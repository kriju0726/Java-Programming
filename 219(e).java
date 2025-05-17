// Converted from 219(e).c
import java.util.*;
public class 219(e) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rec_sum(int num);
        int non_rec_sum(int num);
        int main()
        {
        int num;
        System.out.printf("Enter No..: ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        System.out.printf(" REC is %d\n",rec_sum(num));
        System.out.printf("NON REC IS %d",non_rec_sum(num));
        }
        int rec_sum( num)
        {
        if(num==0)
        {
        return 0;
        }
        else{
        return(num + rec_sum(num-1));
        }
        }
        int non_rec_sum( num)
        {
        int p;
        p=(num*(num+1))/2;
        return p;
        }
    }
}