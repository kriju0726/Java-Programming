// Converted from BIG.c
import java.util.*;
public class BIG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //This program first convert DCML into BNRY(..of two input no..) and gives output of AND,OR,XOR Gate.....
        int bnry_eqvlnc(int,int);
        int main()
        {
        int n1,n2,r,b=0,base=1;
        System.out.printf("Enter two no...: ");
        // scanf("%d  %d",&n1,&n2); // Note: scanf needs manual input handling in Java
        bnry_eqvlnc(n1,n2);
        return 0;
        }
        
        int bnry_eqvlnc(int n1,int n2)
        {
        int r1,b1=0,k1,a1[8],base1=1,i,p1,a3[8];
        while(n1>0){
        r1 = n1%2;
        b1 = b1+r1*base1;
        n1=n1/2;
        base1 = base1*10;
        }
        for(i=7; i>=0; i--){
        p1=b1%2;
        if(p1==1)
        a1[i]=1;
        else
        a1[i]=0;
        
        b1=b1/10;
        }
        //System.out.printf("BN1: ");
        /* for(i=0; i<8; i++){
        System.out.printf("%d ",a1[i]);
        }*/
        //  System.out.printf("\n");
        int r2,b2=0,k2,a2[8],base2=1,p2;
        while(n2>0){
        r2 = n2%2;
        b2 = b2+r2*base2;
        n2=n2/2;
        base2 = base2*10;
        }
        for(i=7; i>=0; i--){
        p2=b2%2;
        if(p2==1)
        a2[i]=1;
        else
        a2[i]=0;
        
        b2=b2/10;
        }
        //System.out.printf("BN2: ");
        /*  for(i=0; i<8; i++){
        System.out.printf("%d ",a2[i]);
        }*/
        
        //System.out.printf("\n\nAND: ");
        for(i=0; i<8; i++)
        {
        if(a1[i]==1 && a2[i]==1)
        {
        a3[i]=1;
        }
        else if(a1[i]==0 && a2[i]==1)
        a3[i]=0;
        else if(a1[i]==1 && a2[i]==0)
        a3[i]=0;
        else
        a3[i]=0;
        }
        
        int g1=0,e1=0;
        for(i=7; i>=0; i--)
        {
        if(a3[i]==1)
        {
        g1 = g1 + pow(2,e1);
        }
        e1++;
        }
        System.out.printf("\n%d",g1);
        
        //System.out.printf("\nONR: ");
        for(i=0; i<8; i++)
        {
        if(a1[i]==1 && a2[i]==1)
        {
        a3[i]=1;
        }
        else if(a1[i]==0 && a2[i]==1)
        a3[i]=1;
        else if(a1[i]==1 && a2[i]==0)
        a3[i]=1;
        else
        a3[i]=0;
        }
        
        int g2=0,e2=0;
        for(i=7; i>=0; i--)
        {
        if(a3[i]==1)
        {
        g2 = g2 + pow(2,e2);
        }
        e2++;
        }
        System.out.printf("\n%d",g2);
        
        
        
        for(i=0; i<8; i++)
        {
        if(a1[i]==1 && a2[i]==1)
        {
        a3[i]=0;
        }
        else if(a1[i]==0 && a2[i]==1)
        a3[i]=1;
        else if(a1[i]==1 && a2[i]==0)
        a3[i]=1;
        else
        a3[i]=0;
        }
        
        int g3=0,e3=0;
        for(i=7; i>=0; i--)
        {
        if(a3[i]==1)
        {
        g3 = g3 + pow(2,e3);
        }
        e3++;
        }
        System.out.printf("\n%d",g3);
        
        
        
        }
    }
}