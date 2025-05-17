// Converted from 345(i).c
import java.util.*;
public class 345(i) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int a[3][3],b[3][3],c[3][3];
        int i,j,k,l;
        System.out.printf("Enter no.s for 1st matrix...\n");
        for(i=0; i<=2; i++)
        {
        // scanf("%d %d %d",&a[i][0],&a[i][1],&a[i][2]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("\nYour 1st entered matrix is...\n");
        for(i=0; i<=2; i++)
        {
        System.out.printf("%d %d %d\n",a[i][0],a[i][1],a[i][2]);
        }
        System.out.printf("\n\nEnter no.s for 2nd matrix...\n");
        for(k=0; k<=2; k++)
        {
        // scanf("%d %d %d",&b[k][0],&b[k][1],&b[k][2]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("\nYour 2nd entered matrix is...\n");
        for(k=0; k<=2; k++)
        {
        System.out.printf("%d %d %d\n",b[k][0],b[k][1],b[k][2]);
        }
        System.out.printf("\nADDITION of both matrices...:\n");
        
        for(j=0; j<=2; j++)
        {
        for(l=0; l<=2; l++)
        {
        c[j][l] = a[j][l] + b[j][l];
        }
        }
        for(j=0; j<=2; j++)
        {
        System.out.printf("%d %d %d\n",c[j][0],c[j][1],c[j][2]);
        }
        return 0;
        }
    }
}