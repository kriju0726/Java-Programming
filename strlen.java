// Converted from strlen.c
import java.util.*;
public class strlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xstrlen(char *);
        int main()
        {
        char arr[] = "Bamboozled";
        int len1,len2;
        
        len1 = xstrlen(arr);
        len2 = xstrlen("Humpty Dumpty");
        System.out.printf("string = %s   length=%d\n",arr,len1);
        System.out.printf("strlen = %s   length = %d\n","Humpty Dumpty",len2);
        return 0;
        }
        int xstrlen(char *s)
        {
        int length = 0;
        while(*s!='\0')
        {
        length++;
        s++;
        }
        return(length);
        }
    }
}