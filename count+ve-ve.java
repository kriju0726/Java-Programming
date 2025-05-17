// Converted from count+ve-ve.c
import java.util.*;
public class count+ve-ve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int i,num,count_p=0,count_n=0,count_z=0;
        int arr[100];
        System.out.printf("Enter numbers : ");
        // scanf("%d",&num); // Note: scanf needs manual input handling in Java
        
        for(i=0; i<num; i++)
        // {   scanf("%d",&arr[i]);   } // Note: scanf needs manual input handling in Java
        
        for(i=0; i<num; i++)
        {
        if (arr[i]>0)
        {  count_p++;}
        else if(arr[i]<0)
        { count_n++;}
        else if(arr[i]=0)
        {count_z++;}
        else
        { System.out.printf("wrong Entry\n");
        break;  }
        } System.out.printf("Oositive Numbers : %d\n", count_p);
        System.out.printf("Negative Numbers: %d\n",count_n);
        System.out.printf("zero Numbers : %d\n",count_z);
        }
    }
}