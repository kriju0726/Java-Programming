// Converted from strcmp.c
import java.util.*;
public class strcmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        char string1[] = "Jerry";
        char string2[] = "Ferry";
        int i,j,k;
        i = strcmp(string1,"Jerry");
        j = strcmp(string1,string2);
        k = strcmp(string1,"jerry boy");
        System.out.printf("%d  %d  %d",i,j,k);
        return 0;
        }
    }
}