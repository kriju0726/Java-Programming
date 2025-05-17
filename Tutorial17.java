// Converted from Tutorial17.c
import java.util.*;
public class Tutorial17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        label:
        System.out.printf("WE ARE INSIDE LABEL");
        goto end;
        System.out.printf("Hello World\n");
        goto label;
        end :
        System.out.printf("We Are at end ");
        
        return 0;
        
        }
    }
}