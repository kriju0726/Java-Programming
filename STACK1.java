// Converted from STACK1.c
import java.util.*;
public class STACK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        INTRODUCTION TO STACK...
        
        (Data of Similar data type.)
        Array -> Random access possible.
        Linked-List -> Sequential access possible.
        Stack -> Limited access possible.
        
        RULE :- 1. Insertion(push).           PRINCIPLE :- LIFO : last in first out.
        2. Delete(pop).                            FILO : first in last out.
        
        OPERATIONS :- 1.push(),   2.pop(),     3.peek()/top(),    4.isempty(),     5.isfull();
        
        IMPLEMENTATION OF STACK by two method...: 1. Static memory allocation(By using array concept).
        2. Dynamic memory allocation(By using linked list concept).
        
        Underflow Condition :- If stack is empty, and you try to extract/pop a element from same stack, then that condition is called Underflow.
        Overflow Condition :- If stack is full, and you try to insert/push an element, then that condition is called Overflow.
        
        APPLICATION OF STACK :-  #.Reverse a string                   #.Undo mechanism              #.Recursion/Function call
        
        
        
        
        //Implementation of stack using Array.
        int stack[5];
        int top = -1;
        void push(){
        int x;
        System.out.printf("Enter the data...: ");
        // scanf("%d",&x); // Note: scanf needs manual input handling in Java
        if(top == N-1){
        System.out.printf("OVERFLOW");
        }
        else{
        top++;
        stack[top] = x;
        }
        }
        void pop(){
        int item;
        if(top == -1){
        System.out.printf("Underflow");
        }
        else{
        item = stack[top];
        top--;
        System.out.printf("%d is a your pop element.",item);
        }
        }
        void peek(){
        if(top == -1){
        System.out.printf("\nList is Empty...");
        }
        else{
        System.out.printf("%d",stack[top]);
        }
        }
        void display(){
        int i;
        for(i=top; i>=0; i--){
        System.out.printf("%d  ",stack[i]);
        }
        }
        /*void main(){
        push();
        System.out.printf("\npush complated.\n");
        pop();
        System.out.printf("\npop complated.\n");
        
        push();
        push();
        
        peek();
        System.out.printf("\npeek complated.\n");
        display();
        System.out.printf("\ndisplay complated.\n");
        }*/
        
        void main(){
        int choice;
        //clrscr();
        do{
        System.out.printf("\nEnter choice(1.push, 2.pop, 3.peek, 4.display)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        switch(choice){
        case 1: push();
        break;
        case 2: pop();
        break;
        case 3: peek();
        break;
        case 4: display();
        break;
        default: System.out.printf("Invalid Position!!!");
        }
        }
        while(choice != 0);
        }
        
        
        
        
        
        
    }
}