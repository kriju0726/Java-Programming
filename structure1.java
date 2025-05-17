// Converted from structure1.c
import java.util.*;
public class structure1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        struct student
        {
        int roll_no;
        char name[19];
        float fees;
        char DOB[29];
        };
        struct student stud1;
        
        System.out.printf("roll_no? ");scanf("%d",&stud1.roll_no);
        System.out.printf("name? ");scanf("%s",&stud1.name);
        System.out.printf("fees? ");scanf("%f",&stud1.fees);
        System.out.printf("DOB? ");scanf("%s",&stud1.DOB);
        
        System.out.printf("\n*******STUDENT DETAILS*******\n");
        System.out.printf("roll_no..: %d\n",stud1.roll_no);
        System.out.printf("Name...: %s\n",stud1.name);
        System.out.printf("Fees...: %f\n",stud1.fees);
        System.out.printf("DOB...: %s\n",stud1.DOB);
        }
    }
}