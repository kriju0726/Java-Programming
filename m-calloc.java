// Converted from m-calloc.c
import java.util.*;
public class m-calloc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int n,i,*ptr;
        System.out.printf("Enter total no. of values..: ");
        // scanf("%d",&n); // Note: scanf needs manual input handling in Java
        
        ptr=(int*) malloc(n*sizeof(int));
        // ptr=(int*) calloc(n,sizeof(int));
        
        System.out.printf("Enter values...: ");
        for(i=0; i<n; i++)
        {
        // scanf("%d",(ptr+i)); // Note: scanf needs manual input handling in Java
        }
        
        System.out.printf("The entered values are..: ");
        for(i=0; i<n; i++)
        {
        System.out.printf("%d\t",*(ptr+i));
        }
        free(ptr);
        }
    }
}