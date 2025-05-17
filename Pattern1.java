// Converted from Pattern1.c
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int i,j,k,sp;
        for(i=0; i<=8; i++)
        {
        for(j=65; j<=73-i; j++)
        {
        System.out.printf(" %c",j);
        }
        for(sp=1; sp<=i*2-1; sp++)
        {
        System.out.printf("  ");
        }
        for(k=73-i; k>= 65; k--)
        {
        if(k==73);
        else
        System.out.printf(" %c",k);
        }   System.out.printf("\n");
        }
        }
    }
}