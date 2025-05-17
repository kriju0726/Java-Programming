// Converted from 341(b).c
import java.util.*;
public class 341(b) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int a[3][3];
        int i,j,large=0;;
        // System.out.printf("Enter 9 different no.s,,:\n");
        for(i=0; i<=2; i++)
        {
        System.out.printf("Enter 3 different no.s...:");
        // scanf("%d %d %d",&a[i][0],&a[i][1],&a[i][2]); // Note: scanf needs manual input handling in Java
        }
        for(i=0; i<=2; i++)
        {  System.out.printf("%d  %d  %d\n",a[i][0],a[i][1],a[i][2]);}
        
        for(i=0; i<=2; i++)
        {
        for(j=0; j<=2; j++)
        {
        if(a[i][j] > large)
        { large = a[i][j];   }
        }
        }  System.out.printf("\n LARGEST : %d\n",large);
        return 0;
        }
    }
}