// Converted from LNKD-LST4.c
import java.util.*;
public class LNKD-LST4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DOUBLY CIRCULAR LINKED LIST IMPLEMENTATION...
        //Reverse or Sorting baki reh gaya yaar...!!!
        struct node{
        int data;
        struct node *prev;
        struct node *next;
        };
        struct node *head, *tail, *newnode, *temp, *current;
        void create_DCLL(){
        head = 0;
        int choice = 1;
        while(choice){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        
        if (head == 0){
        head = tail = newnode;
        head -> next = head;
        head -> prev = head;
        }
        else{
        tail -> next = newnode;
        newnode -> prev = tail;
        newnode -> next = head;
        head -> prev = newnode;
        tail = newnode;
        }
        System.out.printf("U want to continue(0,1)...: ");
        // scanf("%d",&choice); // Note: scanf needs manual input handling in Java
        }
        }
        int get_length(){
        int count = 0;
        temp = head;
        while(temp != tail){
        temp = temp -> next;
        count++;
        }
        count++;
        //System.out.printf("\nLength of List is %d.",count);
        return (count);
        }
        void insert_at_Beg(){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data for, at Begining...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        
        if(head == 0){
        head = tail = newnode;
        head -> prev = newnode;
        head -> next = newnode;
        }
        else{
        newnode -> next = head;
        head -> prev = newnode;
        newnode -> prev = tail;
        tail -> next = newnode;
        head = newnode;
        }
        }
        void insert_at_end(){
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter data for, at ending...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        
        if(head == 0){
        head = tail = newnode;
        head -> prev = newnode;
        head -> next = newnode;
        }
        else{
        newnode -> prev = tail;
        tail -> next = newnode;
        newnode -> next = head;
        head -> prev = newnode;
        tail = newnode;
        }
        }
        void insert_at_pos(){
        int pos, i=1, l;
        System.out.printf("\nEnter the Position, for insertion...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        l = get_length();
        System.out.printf("Length is %d.\n",l);
        temp = head;
        
        if(pos<1 || pos>l){
        System.out.printf("INVALID POSITION!!!");
        }
        else{
        newnode = (struct node*)malloc(sizeof(struct node));
        System.out.printf("Enter the data, for the specific Position...: ");
        // scanf("%d",&newnode -> data); // Note: scanf needs manual input handling in Java
        while(i < pos-1){
        temp = temp -> next;
        i++;
        }
        newnode -> prev = temp;
        newnode -> next = temp -> next;
        temp -> next -> prev = newnode;
        temp -> next = newnode;
        }
        }
        void del_from_beg(){
        temp = head;
        if(head == 0){
        System.out.printf("Invalid Position!!!");
        }
        else if(head -> next == head){
        head = tail = 0;
        free(temp);
        }
        else{
        head = head -> next;
        head -> prev = tail;
        tail -> next = head;
        free(temp);
        }
        }
        void del_from_end(){
        temp = tail;
        if(tail == 0){
        System.out.printf("Invalid Position!!!");
        }
        else if(tail -> prev == head){
        head = tail = 0;
        free(temp);
        }
        else{
        tail = tail -> prev;
        tail -> next = head;
        head -> prev = tail;
        free(temp);
        }
        }
        void del_from_pos(){
        int pos,i=1,l;
        temp = head;
        System.out.printf("\nEnter the position, for Deletion...: ");
        // scanf("%d",&pos); // Note: scanf needs manual input handling in Java
        l = get_length();
        
        if(pos<1 || pos>l){
        System.out.printf("Invalid Position!!!\n\n");
        }
        else if(pos == 1){
        del_from_beg();
        }
        else{
        while(i < pos){
        temp = temp -> next;
        i++;
        }
        temp -> prev -> next = temp -> next;
        temp -> next -> prev = temp -> prev;
        
        if(temp -> next == head){
        tail = temp -> prev;
        free(temp);
        }
        else{
        free(temp);
        }
        }
        }
        
        void Display(){
        temp = head;
        if(head == 0){
        System.out.printf("List is Empty!!!");
        }
        else{
        while(temp != tail){
        System.out.printf("%d  ",temp -> data);
        
        temp = temp -> next;
        }
        System.out.printf("%d",temp -> data);
        }
        }
        void main(){
        create_DCLL();
        insert_at_Beg();
        insert_at_end();
        insert_at_pos();
        System.out.printf("\nTill now, Listed elements are...: ");
        Display();
        del_from_beg();
        System.out.printf("\ndel_from_beg ok");
        del_from_end();
        System.out.printf("\ndel_from_end ok");
        del_from_pos();
        System.out.printf("del_from_position ok");
        System.out.printf("\nAfter Deletion...: ");
        Display();
        }
        
        
        
        
        
        
        
        
    }
}