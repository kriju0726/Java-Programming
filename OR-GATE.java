// Converted from OR-GATE.c
import java.util.*;
public class OR-GATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int ar1[5],ar2[5],i,j,k,ar3[5];
        System.out.printf("Enter no. for ar1[5]...: ");
        for(i=0; i<5; i++)
        {
        // scanf("%d",&ar1[i]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("Enter no. for ar2[5]...: ");
        for(j=0; j<5; j++)
        {
        // scanf("%d",&ar2[j]); // Note: scanf needs manual input handling in Java
        }
        
        for(i=0; i<5; i++)
        {
        if(ar1[i]==1 && ar2[i]==1)
        {
        ar3[i]=1;
        }
        else if(ar1[i]==0 && ar2[i]==1)
        ar3[i]=1;
        else if(ar1[i]==1 && ar2[i]==0)
        ar3[i]=1;
        else
        ar3[i]=0;
        }
        
        System.out.printf("Enter no. for ar3[5]...: ");
        for(j=0; j<5; j++)
        {
        System.out.printf("%d ",ar3[j]);
        }
        
        return 0;
        }
    }
}