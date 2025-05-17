// Converted from MUL_Matrix.c
import java.util.*;
public class MUL_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int a[3][3],b[3][3],c[3][3];
        int i,j,k,l,sum;
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
        System.out.printf("Your 2nd entered matrix is...\n");
        for(k=0; k<=2; k++)
        {
        System.out.printf("%d %d %d\n",b[k][0],b[k][1],b[k][2]);
        }
        System.out.printf("Multiplication of that TWO matrix is...:\n");
        for(i=0; i<3; i++)
        {
        for(j=0; j<3; j++)
        {
        sum=0;
        for(l=0; l<3; l++)
        {
        sum = sum+(a[i][l]*b[l][j]);
        }
        c[i][j] = sum;
        }
        }
        //System.out.printf("MULTIPLICATION is....: \n");
        for(i=0; i<3; i++)
        {
        for(j=0; j<3; j++)
        {
        System.out.printf(" %d",c[i][j]);
        }
        System.out.printf("\n");
        }
        return 0;
        }
    }
}