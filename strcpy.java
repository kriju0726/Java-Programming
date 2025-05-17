// Converted from strcpy.c
import java.util.*;
public class strcpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        void xstrcpy(char *,char *);
        int main()
        {
        char source[25] = "SAYONARA";
        char target[25];
        xstrcpy(target,source);
        System.out.printf("SOURCE string = %s\n",source);
        System.out.printf("TARGAT string = %s\n",target);
        return 0;
        
        }
        void xstrcpy(char *t,char *s)
        {
        while(*s != '\0')
        {
        *t = *s;
        s++;
        t++;
        }
        *t = '\0';
        }
    }
}