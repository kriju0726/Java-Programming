// Converted from 414(c).c
import java.util.*;
public class 414(c) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        struct employee
        {
        char code[25];
        char name[25];
        int dd; int mm; int yy;
        };
        int n,i;
        System.out.printf("No. of employee...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        struct employee empe[n];
        for(i=0; i<n; i++)
        {
        System.out.printf("Employee code..: ");     scanf("%s",&empe[i].code);
        System.out.printf("Name...: ");             scanf("%s",&empe[i].name);
        System.out.printf("D.O.J as dd-mm-yyyy...: ");     scanf("%d %d %d",&empe[i].dd,&empe[i].mm,&empe[i].yy);
        System.out.printf("\n");
        }
        System.out.printf("*****DETAILS****\n");
        for(i=0; i<n; i++)
        {
        System.out.printf("Employee code..: %s\n",empe[i].code);
        System.out.printf("Name...: %s\n",empe[i].name);
        System.out.printf("D.O.B as dd-mm-yyyy...: %d-%d-%d\n",empe[i].dd,empe[i].mm,empe[i].yy);
        }
        int dd1,mm1,yy1;
        System.out.printf("Enter current date(as dd-mm-yyyy)...: ");
        // scanf("%d %d %d",&dd1,&mm1,&yy1); // Note: scanf needs manual input handling in Java
        
        System.out.printf("\n");
        for(i=0; i<n; i++)
        {
        if(yy1 - empe[i].yy >= 3)
        {
        System.out.printf("Name...: %s\n",empe[i].name);
        }
        
        
        }
        
        }
    }
}