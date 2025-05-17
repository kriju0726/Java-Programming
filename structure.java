// Converted from structure.c
import java.util.*;
public class structure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The structure in C is a user-defined data type that can be used to group items of possibly different types into a single type.
        //The struct keyword is used to define the structure in the C programming language.
        //The items in the structure are called its member and they can be of any valid data type.
        int main()
        {
        int n;  System.out.printf("Enter..How many students you have...: ");     scanf("%d",&n);
        struct student
        {
        int s_no;
        int r_no;
        char name[20];
        float cgpa;
        char course[20];
        };
        struct student stud[n];
        // struct student stud[0]={01,25,"Krish kumar",9.87,"B.Tech"};
        //struct student stud[1]={02,28,"Rahul kundu",9.56,"B.Tech"};
        for(int i=0; i<n; i++)
        {   System.out.printf("Enter student%d detail.\n",i);
        System.out.printf("Serial No..: ");     scanf("%d",&stud[i].s_no);
        System.out.printf("Roll No..: ");       scanf("%d",&stud[i].r_no);
        System.out.printf("Name..: ");          scanf("%s",stud[i].name);
        System.out.printf("Course..: ");        scanf("%s",stud[i].course);
        System.out.printf("CGPA..: ");          scanf("%f",&stud[i].cgpa);
        System.out.printf("\n");   }
        
        /* stud[0].s_no=1;
        stud[0].r_no=25;
        strcpy(stud[0].name,"Krish_kumar");
        strcpy(stud[0].course,"B.Tech");
        stud[0].cgpa=8.569;  */
        
        for(int i=0; i<n; i++)
        { System.out.printf("\n *******STUDENT DETAILS*******\n");
        System.out.printf("Serial No..: %d\n",stud[i].s_no);
        System.out.printf("Name..:%s\n",stud[i].name);
        System.out.printf("Roll No..: %d\n",stud[i].r_no);
        System.out.printf("Course..: %s\n",stud[i].course);
        System.out.printf("CGPA..: %.2f\n",stud[i].cgpa);
        System.out.printf("\n");}
        }
        
    }
}