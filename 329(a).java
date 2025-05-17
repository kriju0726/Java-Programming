// Converted from 329(a).c
import java.util.*;
public class 329(a) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int arr[10];
        int i,j,count=0;
        System.out.printf("Enter 10 no.s ...: \n");
        for(i=0; i<10; i++)
        {
        // scanf("%d",&arr[i]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("\nEnter no. for search...: ");
        // scanf("%d",&j); // Note: scanf needs manual input handling in Java
        
        for(i=0; i<10; i++)
        {
        if(j==arr[i])
        count = count+1;
        }
        
        if(count>1)
        {  System.out.printf("\n%d is your searched no..",j);
        System.out.printf("\n%d times occur.",count);}
        else
        System.out.printf("\nNOT occured.");
        
        return 0;
        }
    }
}