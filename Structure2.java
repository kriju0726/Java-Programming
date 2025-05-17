// Converted from Structure2.c
import java.util.*;
public class Structure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        struct DOB
        {
        int day;
        int month;
        int year;
        };
        struct student
        {
        int roll_no;
        char name[20];
        float fees;
        struct DOB date;
        };
        struct student stud1;
        System.out.printf("Enter roll no..");     scanf("%d",&stud1.roll_no);
        System.out.printf("Enter name...");     scanf("%s",&stud1.name);
        System.out.printf("Enter fees...");     scanf("%f",&stud1.fees);
        System.out.printf("DOB...");            scanf("%d %d %d",&stud1.date.day,&stud1.date.month,&stud1.date.year);
        
        System.out.printf("\n ******* STUDENT DETAILS *******\n");
        System.out.printf("Roll no...: %d",stud1.roll_no);
        System.out.printf("\nName...: %s",stud1.name);
        System.out.printf("\nFees...: %f",stud1.fees);
        System.out.printf("\nDOB...: %d.%d.%d",stud1.date.day,stud1.date.month,stud1.date.year);
        }
    }
}