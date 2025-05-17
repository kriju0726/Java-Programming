// Converted from 220(g).c
import java.util.*;
public class 220(g) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift(int,int,int);
        int main()
        {
        int x,y,z;
        System.out.printf("Enter X,Y,Z....: ");
        // scanf("%d %d %d/n",&x,&y,&z); // Note: scanf needs manual input handling in Java
        shift(x,y,z);
        //System.out.printf("\n X=%d, Y=%d, Z=%d",shift(x,y,z));
        }
        int shift(int a,int b,int c)
        {
        int temp;
        temp=a;
        a=c;
        c=b;
        b=temp;
        System.out.printf("%d  %d  %d",a,b,c);
        }
    }
}