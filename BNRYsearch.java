// Converted from BNRYsearch.c
import java.util.*;
public class BNRYsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //IT APPLY WHEN..LIST IS SORTED.
        int main()
        {
        int a[50],lb,ub,val,n,i,pos,mid;
        System.out.printf("Total no.s of elements in the list..: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        System.out.printf("\nEnter elements of list....: ");
        for(i=0; i<n; i++)
        {
        // scanf("%d",&a[i]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("\nEnter elements for search..: ");
        // scanf("%d",&val); // Note: scanf needs manual input handling in Java
        
        lb=0;ub=n,pos=-1;
        
        while(lb<=ub)
        {mid=(lb + ub)/2;
        if(val==a[mid])
        {
        pos=mid;
        System.out.printf("Position is %d\n",pos);break;
        }
        else if(val < a[mid])
        {ub=mid-1;}
        else
        {   lb=mid+1;}
        
        }
        if(pos==-1)
        System.out.printf("NOT MATCHED");
        return 0;
        }
    }
}