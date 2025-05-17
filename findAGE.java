// Converted from findAGE.c
import java.util.*;
public class findAGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int final(int,int,int,int,int,int);
        int main()
        {
        int dd1,mm1,yy1,dd2,mm2,yy2;
        System.out.printf("Enter D.O.B...: ");
        scanf("%d %d %d",&dd1,&mm1,&yy1);// System.out.printf("\nbabu");
        System.out.printf("Enter Today's date...: ");
        // scanf("%d %d %d",&dd2,&mm2,&yy2); // Note: scanf needs manual input handling in Java
        if((dd2>dd1) && (mm2>mm1))
        {
        final(dd1,mm1,yy1,dd2,mm2,yy2);
        }
        else if((dd2<dd1) && (mm2>mm1))
        {
        mm2=mm2-1;
        dd2=dd2+30;
        final(dd1,mm1,yy1,dd2,mm2,yy2);
        }
        else if ((dd2>dd1) &&(mm2<mm1))
        {
        yy2=yy2-1;
        mm2=mm2+12;
        final(dd1,mm1,yy1,dd2,mm2,yy2);
        }
        else //if(dd2<dd1 && mm2<mm1)
        {
        yy2=yy2-1;
        mm2=mm2+12-1;
        dd2=dd2+31;
        final(dd1,mm1,yy1,dd2,mm2,yy2);
        }
        }
        int final(int dd1,int mm1,int yy1,int dd2,int mm2,int yy2)
        {
        int dd3,mm3,yy3;
        dd3=dd2-dd1;
        mm3=mm2-mm1;
        yy3=yy2-yy1;
        System.out.printf("%d-days, %d-months, %d-year",dd3,mm3,yy3);
        }
        
        
    }
}