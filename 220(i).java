// Converted from 220(i).c
import java.util.*;
public class 220(i) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int main()
        {
        float a,b,c,s,area;
        System.out.printf("Enter a,b,c....: ");
        // scanf("%f %f %f",&a,&b,&c); // Note: scanf needs manual input handling in Java
        s=(a+b+c)/2;
        area = pow(s*(s-a)*(s-b)*(s-c),0.5);
        System.out.printf("\nAREA == %.2f",area);
        return 0;
        }
    }
}