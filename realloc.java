// Converted from realloc.c
import java.util.*;
public class realloc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int i,n,*ptr,*ptr1;
        System.out.printf("Enter..n...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        ptr=(int*) calloc(n,sizeof(int));
        
        System.out.printf("Enter the values..: ");
        for(i=0; i<n; i++)
        {
        // scanf("%d",(ptr+i)); // Note: scanf needs manual input handling in Java
        }
        
        System.out.printf("Enter Updated n...: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        ptr1=(int *)realloc(ptr,n*sizeof(int));
        System.out.printf("PVS. add. = %d ,,,,, NEW add. = %d\n",ptr,ptr1);
        
        System.out.printf("Values are..: ");
        for(i=0; i<n; i++)
        {
        System.out.printf("%d\n",*(ptr1+i));
        }
        free(ptr1);
        }
    }
}