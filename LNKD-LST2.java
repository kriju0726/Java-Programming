// Converted from LNKD-LST2.c
import java.util.*;
public class LNKD-LST2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CIRCULAR LINKED-LIST IMPLEMENTATION...
        //INSERTION OF A NODE IN CIRCULAR LINKED-LIST...
        int main(){
        struct node{
        int data;
        struct node *next;
        };
        struct node *new_node, *tail, *temp, *current, *previous, *next_node;
        tail = 0;
        int choice;
        //Creating a CIRCULAR linked list...
        while(choice){
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the data...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        
        new_node -> next = 0;
        if(tail == 0){
        tail = new_node;
        tail -> next = new_node;
        }
        else{
        new_node -> next = tail -> next;
        tail -> next = new_node;
        tail = new_node;
        }
        System.out.printf("U want to continue(0,1)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        }
        //Insert a node at Begining...
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data for, at Begining...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        new_node -> next = tail -> next;
        tail -> next = new_node;
        
        //Insert a node at Ending...
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data for, at Ending...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        new_node -> next = tail -> next;
        tail -> next = new_node;
        tail = new_node;
        
        //Insert a node at any particular position...
        int pos, i=1;
        System.out.printf("Enter position for inserting an element...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data for particular position...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        new_node -> next = 0;
        temp = tail -> next;
        while(i < pos-1){
        temp = temp -> next;
        i++;
        }
        new_node -> next = temp -> next;
        temp -> next = new_node;
        
        //Displaying the elements of CIRCULAR linked list...
        int count=0;
        System.out.printf("\nBefore Deletion...");
        System.out.printf("\nThe inserted elements are...: ");
        temp = tail -> next;
        while(temp -> next != tail -> next){
        System.out.printf("%d  ",temp -> data);
        temp = temp -> next;
        count++;
        }
        System.out.printf("%d",temp -> data);
        count++;
        System.out.printf("\nThere are %d elements found in the List.",count);
        
        ///Delete an element from Begining...
        temp = tail -> next;
        tail -> next = temp -> next;
        free(temp);
        
        //Delete an element from Ending...
        current = tail -> next;
        while(current -> next != tail -> next){
        previous = current;
        current = current -> next;
        }
        previous -> next = tail -> next;
        tail = previous;
        free(current);
        
        //Delete an element from any Position...
        i = 1;
        System.out.printf("\n\nEnter the position for Deletion...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        
        current = tail -> next;
        while(i < pos-1){
        current = current -> next;
        i++;
        }
        next_node = current -> next;
        current -> next = next_node -> next;
        free(next_node);
        
        
        
        //Displaying the elements of CIRCULAR linked list...
        count = 0;
        System.out.printf("\n\nAfter Deletion...");
        System.out.printf("\nThe inserted elements are...: ");
        temp = tail -> next;
        while(temp -> next != tail -> next){
        System.out.printf("%d  ",temp -> data);
        temp = temp -> next;
        count++;
        }
        System.out.printf("%d",temp -> data);
        count++;
        System.out.printf("\nThere are %d elements found in the List.",count);
        }
        
        
        
        
        
        
        
        // CIRCULAR LINKED LIST...
        /*#include<stdio.h>
        struct node{
        int data;
        struct node *next;
        };
        struct node *head, *tail, *newnode, *temp, *ptr, *cpt, *prev, *current, *nextnode;
        
        void createCLL(){
        head = 0;
        int choice;
        while(choice){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the data...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        
        if(head == 0){
        head = temp = newnode;
        }
        else{
        temp -> next = newnode;
        temp = newnode;
        }
        System.out.printf("You want to continue(0,1)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        }
        temp -> next = head;
        }
        void display(){
        temp = head;
        while(temp -> next != head){
        System.out.printf("%d  ",temp -> data);
        temp = temp -> next;
        }
        System.out.printf("%d  ",temp -> data);
        }
        void sorting(){
        int num;
        ptr = head;
        
        while(ptr -> next != head){
        cpt = ptr -> next;
        while(cpt != head){
        if(ptr -> data  >  cpt -> data){
        num = ptr -> data;
        ptr -> data = cpt -> data;
        cpt -> data = num;
        }
        cpt = cpt -> next;
        }
        ptr = ptr -> next;
        }
        }
        
        void tail_node(){
        temp = head;
        while(temp -> next != head){
        temp = temp -> next;
        }
        tail = temp;
        System.out.printf("\n   %d   ",tail -> data);
        System.out.printf("  %d\n",head -> data);
        }
        void reverse(){
        temp = head;
        while(temp -> next != head){
        temp = temp -> next;
        }
        tail = temp;
        
        System.out.printf("    Reverse start...\n");
        current = tail -> next;
        newnode = current -> next;
        
        while(current != tail){
        prev = current;
        current = nextnode;
        nextnode = current -> next;
        current -> next = prev;
        }
        nextnode -> next = tail;
        tail = nextnode;
        System.out.printf("\nREVERSE eND..\n");
        }
        void main(){
        createCLL();
        display();
        sorting();
        System.out.printf("\nAfter Sorting\n");
        display();
        // tail_node();
        // System.out.printf("Tail node ok\n");
        reverse();
        System.out.printf("reverse ok...");
        System.out.printf("\nAfter Reversing\n");
        display();
        
        }*/
    }
}