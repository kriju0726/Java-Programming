// Converted from 2-D string.c
import java.util.*;
public class 2-D string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        char masterlist[6][10] = {
        "akshay","parag","raman","srinivas","gopal","rajesh"};
        
        int i,flag,a;
        char yourname[10];
        System.out.printf("YOURname..: ");
        // scanf("%s",yourname); // Note: scanf needs manual input handling in Java
        
        flag = NOTFOUND;
        for(i=0; i<=5; i++)
        {
        a = strcmp(&masterlist[i][0],yourname);
        if(a==0)
        {
        System.out.printf("WElcome...You can enter\n");
        flag = FOUND;
        break;
        }
        }
        if(flag == NOTFOUND)
        System.out.printf("SORRY...!!, you can not enter");
        return 0;
        
        
        
        }
    }
}