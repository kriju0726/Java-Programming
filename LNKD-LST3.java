// Converted from LNKD-LST3.c
import java.util.*;
public class LNKD-LST3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DOUBLY LINKED-LIST IMPLEMENTATION...
        //reverse baki reh gaya yaar....
        struct node{
        int data;
        struct node *next;
        struct node *prev;
        };
        int count=0;
        struct node *head, *newnode, *tail, *current, *temp;
        void create(){
        int choice;
        head = 0;
        while(choice){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        count++;
        newnode -> prev=0;
        newnode -> next=0;
        
        if(head == 0){
        head = tail = newnode;
        }
        else{
        tail -> next = newnode;
        newnode -> prev = tail;
        tail = newnode;
        }
        System.out.printf("U want to continue(0,1)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        }
        }
        void insert_at_Beg(){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data at, for Begining...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        count++;
        newnode -> prev=0;
        newnode -> next=0;
        head -> prev = newnode;
        newnode -> next = head;
        head = newnode;
        }
        void insert_at_End(){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data at, for Ending...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        count++;
        newnode -> prev=0;
        newnode -> next=0;
        newnode -> prev = tail;
        tail -> next = newnode;
        tail = newnode;
        }
        void insert_at_pos(){
        int pos, i=1;
        System.out.printf("Enter position...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        
        if(pos < 1 || pos > count){
        System.out.printf("Invalid Position...!!!");
        }
        else if(pos == 1){
        insert_at_Beg();
        }
        else{
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the Data...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        current = head;
        while(i < pos-1){
        current = current -> next;
        i++;
        }
        newnode -> prev = current;
        newnode -> next = current -> next;
        current -> next = newnode;
        newnode -> next -> prev = newnode;
        }
        }
        void insert_after_pos(){
        int pos, i=1;
        System.out.printf("Enter  after position...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        
        if(pos < 1 || pos > count){
        System.out.printf("Invalid Position...!!!");
        }
        else{
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the Data...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        current = head;
        while(i < pos){
        current = current -> next;
        i++;
        }
        newnode -> prev = current;
        newnode -> next = current -> next;
        current -> next = newnode;
        newnode -> next -> prev = newnode;
        }
        }
        void del_from_beg(){
        if(head == 0){
        System.out.printf("List is Empty!!!");
        }
        else{
        temp = head;
        head = head -> next;
        head -> prev = 0;
        free(temp);
        }
        }
        void del_from_end(){
        if(tail == 0){
        System.out.printf("List is Empty!!!");
        }
        else{
        temp = tail;
        tail = tail -> prev;
        tail -> next = 0;
        free(temp);
        }
        }
        void del_from_pos(){
        struct node *temp_before, *temp_after;
        int pos, i=1;
        temp = head;
        System.out.printf("\nEnter the position for Deletion...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        while(i < pos){
        //temp_before = temp;
        temp = temp -> next;
        //temp_after = temp;
        i++;
        }
        temp -> prev -> next = temp -> next;
        temp -> next -> prev = temp -> prev;
        //temp_before -> next = temp -> next;
        //temp_after -> prev = temp -> prev;
        free(temp);
        }
        void sorting(){
        int num;
        struct node *ptr, *cpt;
        ptr = head;
        while(ptr != 0){
        cpt = ptr -> next;
        while(cpt != 0){
        if(ptr -> data > cpt -> data){
        num = ptr -> data;
        ptr -> data = cpt -> data;
        cpt -> data = num;
        }
        cpt = cpt -> next;
        }
        ptr = ptr -> next;
        }
        }
        
        void display(){
        // struct node *tail;
        tail = head;
        // System.out.printf("\nThe entered elements are...: ");
        while(tail != 0){
        System.out.printf("%d  ",tail -> data);
        current = tail;
        tail = tail -> next;
        }
        tail = current;
        }
        void main(){
        create();
        insert_at_Beg();
        insert_at_End();
        insert_at_pos();
        insert_after_pos();
        System.out.printf("Till now, Your listed elements are...: ");
        display();
        sorting();
        System.out.printf("\nAFTER SORTING\n");
        display();
        del_from_beg();
        System.out.printf("\ndel_beg_ok");
        del_from_end();
        System.out.printf("\ndel_end_ok\n");
        del_from_pos();
        System.out.printf("del_pos_ok");
        System.out.printf("\nAfter Deletion...: ");
        display();
        }
    }
}