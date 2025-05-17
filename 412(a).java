// Converted from 412(a).c
import java.util.*;
public class 412(a) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        struct student
        {
        int r_no;
        char name[25];
        char course[10];
        char dept[10];
        int YOJ;
        };
        
        struct student s[4];
        void display(int);
        void pleasure(int yer);
        int main()
        {
        int rno,yer;
        for(int i=1; i<4; i++)
        {
        System.out.printf("Enter S%d details:-\n",i);
        System.out.printf("roll? ");                               scanf("%d",&s[i].r_no);
        System.out.printf("name? ");                                scanf("%s",&s[i].name);
        System.out.printf("course? ");                                scanf("%s",&s[i].course);
        System.out.printf("department? ");                              scanf("%s",&s[i].dept);
        System.out.printf("yoj? ");                                         scanf("%d",&s[i].YOJ);
        System.out.printf("\n");
        }
        System.out.printf("Enter your ROLL.NO..: ");      scanf("%d",&rno);
        display(rno);
        System.out.printf("Enter YOUR year...: ");      scanf("%d",&yer);
        
        pleasure(yer);
        return 0;
        }
        void display(int rno)
        {
        System.out.printf("name? %s\n",s[rno].name);
        System.out.printf("course? %s\n",s[rno].course);
        System.out.printf("department? %s\n",s[rno].dept);
        System.out.printf("yoj? %d\n\n",s[rno].YOJ);        System.out.printf("\n \n");
        }
        void pleasure(int yer)
        {
        for(int i=1; i<4; i++)
        {
        System.out.printf("%s\n",s[i].name);
        }
        }
    }
}