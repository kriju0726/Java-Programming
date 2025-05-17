// Converted from Transpose.c
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int a[4][4];
        int i,j,temp;
        for(i=0; i<=3; i++)
        {
        System.out.printf("enter 4 No.s..: ");
        // scanf("%d %d %d %d",&a[i][0],&a[i][1],&a[i][2],&a[i][3]); // Note: scanf needs manual input handling in Java
        }
        System.out.printf("\nYour OUTPUT is ... :::\n");
        for(i=0; i<=3; i++)
        {
        System.out.printf("%d   %d   %d   %d\n",a[i][0],a[i][1],a[i][2],a[i][3]);
        }
        System.out.printf("\n");
        for(i=0; i<4; i++)
        {
        for(j=i+1; j<4; j++)
        {
        temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
        }
        }
        System.out.printf("The matrix after transpose is...:\n");
        for(i=0; i<=3; i++)
        {
        System.out.printf("%d   %d   %d   %d\n",a[i][0],a[i][1],a[i][2],a[i][3]);
        }
        return 0;
        }
    }
}