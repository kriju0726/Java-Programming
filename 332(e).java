// Converted from 332(e).c
import java.util.*;
public class 332(e) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int a[10] = {1,2,3,4,5,6,7,8,9,10};
        int i;
        for(i=0; i<9; i++)
        if(i%2 == 0)
        {a[i] = a[i]*a[i+1];
        a[i+1] = a[i]/a[i+1];
        a[i] = a[i]/a[i+1];    }
        
        for(i=0; i<10; i++)
        System.out.printf("  %d",a[i]);
        
        return 0;
        }
    }
}