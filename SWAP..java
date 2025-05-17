// Converted from SWAP..c
import java.util.*;
public class SWAP_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        int num[26],temp;
        num[0] = 100;
        num[25] = 200;
        temp = num[25];
        num[25] = num[0];
        num[0] = temp;
        System.out.printf("%d    %d\n",num[0],num[25]);
        return 0;
        }
    }
}