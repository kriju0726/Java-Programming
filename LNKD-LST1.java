// Converted from LNKD-LST1.c
import java.util.*;
public class LNKD-LST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LINKED-LIST IMPLEMENTATION...
        //INSERTION OF A NODE IN A SINGLY LINKED-LIST...
        /*#include<stdio.h>
        
        int main(){
        
        struct node{
        int data;
        struct node *next;
        };
        
        struct node *head, *new_node, *temp, *prev_node, *next_node;
        
        head=0;
        
        int choice, count=0;
        
        while(choice){
        new_node = (struct node*)malloc(sizeof(struct node));
        
        System.out.printf("Enter data...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        count++;
        
        new_node -> next=0;
        
        if(head == 0){
        head = temp = new_node;
        }
        else{
        temp -> next = new_node;
        temp = new_node;
        }
        
        System.out.printf("Do you want to continue(0,1)..: ");
        // scanf("%d", &choice); // Note: scanf needs manual input handling in Java
        }
        
        //Insert at begining...
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter element at first...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        count++;
        
        new_node -> next = head;
        head = new_node;
        
        
        //Insert at ending...
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the element for last..: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        count++;
        
        new_node -> next = 0;
        // temp = head;
        
        while(temp -> next != 0){
        temp = temp -> next;
        }
        temp->next = new_node;
        
        
        //Insert element after a given location...
        int pos, i=1;
        System.out.printf("Enter the position,for insertion..: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        
        if(pos > count){
        System.out.printf("Invalid position...");
        }
        else{
        temp = head;
        //To insert an element before a given location....USE..."while(i < (pos-1))"
        while(i < (pos)){
        temp = temp->next;
        i++;
        }
        
        new_node = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the data...: ");
        // scanf("%d",&new_node -> data); // Note: scanf needs manual input handling in Java
        
        new_node->next = temp->next;
        temp -> next = new_node;
        }
        
        count=0;
        System.out.printf("\nBefore Deletion...");
        System.out.printf("\nThe inserted elements are....: ");
        temp = head;
        while(temp != 0){
        System.out.printf("%d ",temp -> data);
        temp = temp -> next;
        count++;
        }
        System.out.printf("\nThe total no. of inserted elements are...: %d",count);
        
        
        System.out.printf("\n\nAfter Deletion...");
        //Delete an element from Begining...
        temp = head;
        head = head -> next;
        free(temp);
        
        //Delete an element from Ending...
        temp = head;
        while(temp -> next != 0){
        prev_node = temp;
        temp = temp -> next;
        }
        free(temp);
        prev_node -> next = 0;
        
        //Delete an element from Given Position...
        i=1;
        System.out.printf("\nEnter the position to delete an element...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        temp = head;
        while(i < pos-1){
        temp = temp -> next;
        i++;
        }
        next_node = temp -> next;
        temp -> next = next_node -> next;
        free(next_node);
        
        count=0;
        System.out.printf("\nThe inserted elements are....: ");
        temp = head;
        while(temp != 0){
        System.out.printf("%d ",temp -> data);
        temp = temp -> next;
        count++;
        }
        System.out.printf("\nThe total no. of inserted elements are...: %d",count);
        
        }*/
        
        
        
        
        
        
        
        //SINGLY LINKED LIST BY USING FUNCTION...
        struct node{
        int data;
        struct node *next;
        };
        
        struct node *head, *newnode, *temp, *ptr, *cpt, *prev, *current, *nextnode;
        
        void create(){
        head = 0;
        int choice;
        
        while(choice){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the data...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        
        newnode -> next = 0;
        if(head == 0){
        head = temp = newnode;
        }
        else{
        temp -> next = newnode;
        temp = newnode;
        }
        System.out.printf("U want to continue(0,1)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        }
        }
        
        void display(){
        temp = head;
        System.out.printf("The inserted elements are...: ");
        while(temp != 0){
        System.out.printf("%d  ",temp -> data);
        temp = temp -> next;
        }
        }
        
        void sorting(){
        //Ascending Order...
        int num;
        ptr = head;
        
        while(ptr -> next != 0){
        cpt = ptr -> next;
        
        while(cpt != 0){
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
        
        void reverse(){
        prev = current = nextnode = 0;
        
        if(head == 0){
        System.out.printf("Empty List...");
        }
        else if(head -> next == 0){
        System.out.printf("One node is only Exist. So, it is already reversed...");
        }
        else{
        current = head;
        while(current != 0){
        nextnode = current -> next;
        current -> next = prev;
        prev = current;
        current = nextnode;
        }
        head = prev;
        }
        }
        
        void main(){
        create();
        display();
        sorting();
        System.out.printf("\nAFTER SORTING\n");
        display();
        reverse();
        System.out.printf("\nAFTER REVERSING...\n");
        display();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}