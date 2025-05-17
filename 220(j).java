// Converted from 220(j).c
import java.util.*;
public class 220(j) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lnth(int,int,int,int);
        float area(float,float,float,float);
        int main()
        {
        int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
        float a,b,c,s;
        System.out.printf("Enter co-ordinate of 1st point..: ");
        // scanf("%d %d",&x1,&y1); // Note: scanf needs manual input handling in Java
        System.out.printf("Enter co-ordinate of 2nd point..: ");
        // scanf("%d %d",&x2,&y2); // Note: scanf needs manual input handling in Java
        System.out.printf("Enter co-ordinate of 3rd point..: ");
        // scanf("%d %d",&x3,&y3); // Note: scanf needs manual input handling in Java
        System.out.printf("Enter co-ordinate point to check..: ");
        // scanf("%d %d",&x4,&x5); // Note: scanf needs manual input handling in Java
        a = lnth(x1,y1,x2,y2);
        b = lnth(x2,y2,x3,y3);
        c = lnth(x3,y3,x1,y1);
        System.out.printf("LENGTH = %f %f %f\n",a,b,c);
        s=(a+b+c)/2;
        System.out.printf("AREA = %f",area(s,a,b,c));
        
        return 0;
        }
        float lnth(int j,int k,int l,int m)
        {
        float length;
        length = sqrt((l-j)*(l-j)+(m-k)*(m-k));
        return length;
        }
        float area(float s,float a,float b,float c)
        {
        
        return sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }
}