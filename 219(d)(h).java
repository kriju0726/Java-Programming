// Converted from 219(d)(h).c
import java.util.*;
public class 219(d)(h) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int non_rec_bin(int num);
        int rec_bin(int num);
        void main()
        {
        int num;
        System.out.printf("Enter Number: ");
        // scanf("%d", &num); // Note: scanf needs manual input handling in Java
        
        System.out.printf("Decimal To Binary Using Recursion: %d", rec_bin(num));
        System.out.printf("\nDecimal To Binary Without Using Recursion: %d", non_rec_bin(num));
        }
        int non_rec_bin(int num)
        {
        int x, res=0, pos=1;
        while (num!=0)
        {
        x = num%2;
        res = res + (x*pos);
        pos = 10*pos;
        num = num/2;
        }
        return res;
        }
        int rec_bin(int num)
        {
        if(num==0)
        {
        return 0;
        }
        else
        {
        return ((num%2)+10*rec_bin(num/2));
        }
        }
    }
}