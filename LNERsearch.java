// Converted from LNERsearch.c
import java.util.*;
public class LNERsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int arr[50];
        int n,i,pos=-1,val;
        System.out.printf("Total no.s of elements in the list..: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        System.out.printf("\nEnter elements of list....: ");
        for(i=0; i<n; i++)
        {
        // scanf("%d",&arr[i]); // Note: scanf needs manual input handling in Java
        }
        int choice, posn, num;
        System.out.printf("U want to insert an element, at specific position(1,0)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        if(choice == 0){
        System.out.printf("\nU want to Delete an element, from specific position(1,0)...: ");
        }
        else{
        System.out.printf("Enter the position...: ");
        // scanf("%d",&posn); // Note: scanf needs manual input handling in Java
        System.out.printf("Enter the element for insertion...: ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        }
        for(i=n-1; i>= pos; i--){
        
        }
        
        
        
        System.out.printf("\nEnter elements for search..: ");
        // scanf("%d",&val); // Note: scanf needs manual input handling in Java
        
        for(i=0; i<n; i++)
        {
        if(arr[i] == val)
        {
        pos=i+1;
        System.out.printf("\n%d ",pos);
        }
        }
        if(pos==-1)
        {System.out.printf("NOT matched");}
        
        
        return 0;
        }
    }
}