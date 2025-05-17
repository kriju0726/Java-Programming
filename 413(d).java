// Converted from 413(d).c
import java.util.*;
public class 413(d) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        struct cricketer
        {
        char name[20];
        int age;
        int match;
        float run;
        };
        int n,i,j,k,temp;
        System.out.printf("Enter no. of cricketer..: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        struct cricketer cter[n];
        
        for(i=0; i<n; i++)
        {
        System.out.printf("Enter detail of Cricketer no. %d..\n",i+1);
        System.out.printf("Name..? ");      scanf("%s",&cter[i].name);
        System.out.printf("Age..? ");       scanf("%d",&cter[i].age);
        System.out.printf("Match..? ");     scanf("%d",&cter[i].match);
        System.out.printf("AVG. run..? ");  scanf("%f",&cter[i].run);
        System.out.printf("\n");
        }
        System.out.printf("\n");
        for(i=0; i<n; i++)
        {
        System.out.printf("Detail of Cricketer no. %d..\n",i+1);
        System.out.printf("Name..: %s\n",cter[i].name);
        System.out.printf("Age..: %d\n",cter[i].age);
        System.out.printf("Match..: %d\n",cter[i].match);
        System.out.printf("AVG. run..: %.3f\n",cter[i].run);
        System.out.printf("\n");
        }
        
        for(j=0; j<n-1; j++)
        {
        for(k=0; k<n-1; k++)
        {
        if(cter[k].run > cter[k+1].run)
        {
        temp=cter[k].run;
        cter[k].run =cter[k+1].run;
        cter[k+1].run = temp;
        }
        }
        }
        System.out.printf("\n");
        System.out.printf("AFTER ARRANGING.....\n");
        for(int i=0; i<n; i++)
        {
        System.out.printf("Detail of Cricketer no. %d..\n",i+1);
        System.out.printf("Name..: %s\n",cter[i].name);
        System.out.printf("Age..: %d\n",cter[i].age);
        System.out.printf("Match..: %d\n",cter[i].match);
        System.out.printf("AVG. run..: %.3f\n",cter[i].run);
        System.out.printf("\n");
        }
        return 0;
        }
        
    }
}