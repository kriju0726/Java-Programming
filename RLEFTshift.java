// Converted from RLEFTshift.c
import java.util.*;
public class RLEFTshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int num=212,i;
        for(i=0; i<=2; ++i)
        System.out.printf("Right shift by %d: %d\n",i,num>>i);
        
        System.out.printf("\n");
        for(i=0; i<=2; ++i)
        System.out.printf("Left shift by %d: %d\n",i,num<<i);
        return 0;
        }
    }
}