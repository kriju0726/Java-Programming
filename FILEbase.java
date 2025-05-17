// Converted from FILEbase.c
import java.util.*;
public class FILEbase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DISPLAY CONTENTS OF A FILE ON A SCREEN
        int main()
        {
        FILE *fp;
        char ch;
        
        fp = fopen("a.c","r");
        while(1)
        {
        ch=fgetc(fp);
        if(ch==EOF)
        break;
        
        System.out.printf("%c",ch);
        }
        System.out.printf("\n");
        fclose(fp);
        return 0;
        }
    }
}