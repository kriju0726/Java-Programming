// Converted from STACK2.c
import java.util.*;
public class STACK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NOTE:- When we implement stack by using array then memory is fixed or pre-defined. In other hand, by using LNKD-list concept, there
        //       is a advantage of DYNAMIC MEMORY ALLOCATION.
        
        //Implementation of STACK, using LINKED-LIST...
        struct node{
        int data;
        struct node *next;
        };
        struct node *newnode, *top = 0, *temp;
        
        void push(int x){
        newnode = (struct node*)malloc(sizeof(struct node));
        newnode -> data = x;
        newnode -> next = top;
        top = newnode;
        }
        void peek(){
        if(top == 0){
        System.out.printf("Stack is Empty!!!");
        }
        else{
        System.out.printf("\nTop element is %d.\n",top -> data);
        }
        }
        void display(){
        temp = top;
        if(top == 0){
        System.out.printf("List is empty!!!");
        }
        else{
        while(temp != 0){
        System.out.printf("%d  ",temp -> data);
        temp = temp -> next;
        }
        }
        }
        void pop(){
        temp = top;
        if(top == 0){
        System.out.printf("Invalid Position.!!!");
        }
        else{
        System.out.printf("\nYour pop(list-out) element is %d.\n",top -> data);
        top = temp -> next;
        free(temp);
        }
        }
        
        
        void main(){
        push(3);
        push(2);
        push(1);
        display();
        peek();
        pop();
        peek();
        display();
        }
    }
}