// Converted from Queue.c
import java.util.*;
public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //IMPLEMENTATION OF QUEUE USING ARRAY...
        /*#include<stdio.h>
        
        int queue[N];
        int front = -1;
        int rear = -1;
        
        void enqueue(int x){
        if(rear == N-1){
        System.out.printf("Overflow");
        }
        else if(front == -1 && rear == -1){
        front = rear = 0;
        queue[rear] = x;
        }
        else{
        rear++;
        queue[rear] = x;
        }
        }
        void dequeue(){
        if(front == -1 && rear == -1){
        System.out.printf("Underflow");
        }
        else if(front == rear){
        front = rear = -1;
        }
        else{
        System.out.printf("\n\n%d\n\n",queue[front]);
        front++;
        }
        }
        void display(){
        int i;
        if(front == -1 && rear == -1){
        System.out.printf("queue is empty");
        }
        else{
        for(i=front; i<rear+1; i++){
        System.out.printf("%d  ",queue[i]);
        }
        }
        }
        void peek(){
        if(front == -1 && rear == -1){
        System.out.printf("Queue is empty");
        }
        else{
        System.out.printf("%d",queue[front]);
        }
        }
        
        void main(){
        enqueue(2);
        enqueue(5);
        enqueue(-1);
        display();
        peek();
        dequeue();
        peek();
        display();
        }*/
        
        
        //IMPLEMENTATION OF QUEUE USING LINKED-LIST...
        /*#include<stdio.h>
        struct node{
        int data;
        struct node *next;
        };
        struct node *front = 0;
        struct node *rear = 0;
        
        void enqueue(int x){
        struct node *newnode;
        newnode = (struct node*)malloc(sizeof(struct node));
        newnode -> data = x;
        newnode -> next = 0;
        
        if(front == 0 && rear == 0){
        front = rear = newnode;
        }
        else{
        rear -> next = newnode;
        rear = newnode;
        }
        }
        void display(){
        struct node *temp;
        if(front==0 && rear==0){
        System.out.printf("List is Empty!!!");
        }
        else{
        temp = front;
        while(temp != 0){
        System.out.printf("    %d - ",temp -> data);
        temp = temp -> next;
        }
        }
        }
        void dequeue(){
        struct node *temp;
        temp = front;
        
        if(front == 0 && rear == 0){
        System.out.printf("List is Empty...!!!");
        }
        else{
        System.out.printf("-- %d --",front -> data);
        front = front -> next;
        free(temp);
        }
        }
        void peek(){
        if(front == 0 && rear == 0){
        System.out.printf("List is Empty...!!!");}
        else{
        System.out.printf("  %d  ",front -> data);
        }
        }
        void main(){
        enqueue(5);
        enqueue(0);
        enqueue(-3);
        display();
        dequeue();
        peek();
        }*/
        
        
        //IMPLEMENTATION OF CIRCULAR QUEUE USING ARRAYs...
        /*#include<stdio.h>
        int queue[N];
        int front = -1;
        int rear = -1;
        
        void enqueue(int x){
        if(front==-1 && rear==-1){
        front = rear = 0;
        queue[rear] = x;
        }
        else if(((rear+1)%N) == front){
        System.out.printf("Queue is full");
        }
        else{
        rear = (rear + 1)%N;
        queue[rear] = x;
        }
        }
        void dequeue(){
        if(front == -1 && rear == -1){
        System.out.printf("queue is empty");
        }
        else if(front == rear){
        front = rear = -1;
        }
        else{
        System.out.printf(" %d ",queue[front]);
        front = (front + 1)%N;
        }
        }
        void display(){
        int i = front;
        if(front==-1 && rear==-1){
        System.out.printf("Queue is empty...");
        }
        else{
        System.out.printf("\n\nQueue is...: ");
        while(i != rear){
        System.out.printf(" %d ",queue[i]);
        i = (i+1)%N;
        }
        System.out.printf(" %d",queue[rear]);
        }
        }
        void peek(){
        System.out.printf("   -- %d --   ",queue[front]);
        }
        void main(){
        enqueue(2);
        enqueue(-1);
        enqueue(5);
        enqueue(6);
        enqueue(7);
        display();
        dequeue();
        dequeue();
        peek();
        display();
        }*/
        
        
        //IMPLEMENTATION OF CIRCULAR QUEUE USING LINKED-LIST...
        /*#include<stdio.h>
        struct node{
        int data;
        struct node *next;
        };
        struct node *front = 0;
        struct node *rear = 0;
        void enqueue(int x){
        struct node *newnode;
        newnode = (struct node*)malloc(sizeof(struct node));
        newnode -> data = x;
        newnode -> next = 0;
        
        if(rear == 0){
        front = rear = newnode;
        rear -> next = front;
        }
        else{
        rear -> next = newnode;
        rear = newnode;
        rear -> next = front;
        }
        }
        void dequeue(){
        struct node *temp;
        temp = front;
        if(front==0 && rear==0){
        System.out.printf("List is empty...//...Underflow");
        }
        else if(front == rear){
        front = rear = 0;
        free(temp);
        }
        else{
        front = front -> next;
        rear -> next = front;
        free(temp);
        }
        }
        void peek(){
        if(front==0 && rear==0){
        System.out.printf("List is empty...//...Underflow");}
        else{
        System.out.printf("\nPeak element is %d.\n",front -> data);
        }
        }
        void display(){
        struct node *temp;
        temp = front;
        if(front==0 && rear==0){
        System.out.printf("List is empty...//...Underflow");}
        else{
        while(temp -> next != front){
        System.out.printf(" %d ",temp -> data);
        temp = temp -> next;
        }
        System.out.printf(" %d ",temp -> data);
        }
        }
        void main(){
        enqueue(2);
        enqueue(1);
        enqueue(-6);
        display();
        dequeue();
        peek();
        display();
        }*/
        
        
        //VERY VERY IMPORTANT...
        //Implementation of Queue using Stack...
        /*#include<stdio.h>
        int s1[N], s2[N];
        int top1=-1, top2=-1;
        int count = 0;
        
        void push1(int data){
        if(top1 == N-1){
        System.out.printf("Overflow");
        }
        else{
        top1++;
        s1[top1] = data;
        }
        }
        void push2(int data){
        if(top2 == N-1){
        System.out.printf("Overflow");
        }
        else{
        top2++;
        s2[top2] = data;
        }
        }
        int pop1(){
        return s1[top1--];
        }
        int pop2(){
        return s2[top2--];
        }
        
        void enqueue(int x){
        push1(x);
        count++;
        }
        void dequeue(){
        int i,a,b;
        if(top1 == -1 && top2 == -1){
        System.out.printf("Queue is Empty");
        }
        else{
        for(i=0; i<count; i++){
        int a = pop1();
        push2(a);
        }
        int b = pop2();
        System.out.printf("\nThe dequeue element is %d.\n",b);
        count--;
        
        for(i=0; i<count; i++){
        a = pop2();
        push1(a);
        }
        }
        }
        void display(){
        System.out.printf("\n\n\n");
        for(int i=0; i<top1; i++){
        System.out.printf("%d  -  ",s1[i]);
        }
        }
        void main(){
        enqueue(5);
        enqueue(2);
        enqueue(-1);
        //display();
        dequeue();
        enqueue(7);
        display();
        }*/
        
        
        //Implementation of DEQUE using circular Array...
        /*#include<stdio.h>
        
        int deque[N];
        int f = -1;
        int r = -1;
        
        void enqueue_front(int x){
        if((f==0 && r==N-1) || (f==r+1)){
        System.out.printf("\nQueue is full..");
        }
        else if(f==-1 && r==-1){
        f=r=0;
        deque[f] = x;
        }
        else if(f == 0){
        f=N-1;
        deque[f]=x;
        }
        else{
        f--;
        deque[f]=x;
        }
        }
        void enqueue_rear(int x){
        if((f==0 && r==N-1) || (f==r+1)){
        System.out.printf("\nQueue is full..");
        }
        else if(f==-1 && r==-1){
        f=r=0;
        deque[r] = x;
        }
        else if(r == N-1){
        r = 0;
        deque[r] = x;
        }
        else{
        r++;
        deque[r] = x;
        }
        }
        void get_front(){
        if(f==-1 && r==-1){
        System.out.printf("List is Empty..");
        }
        else{
        System.out.printf("The front element is %d..",deque[f]);
        }
        }
        void get_rear(){
        if(f==-1 && r==-1){
        System.out.printf("List is Empty..");
        }
        else{
        System.out.printf("The rear element is %d..",deque[r]);
        }
        }
        void dequeue_front(){
        if(f==-1 && r==-1){
        System.out.printf("List is Empty..");
        }
        else if(f == r){
        f=r=-1;
        }
        else if(f == N-1){
        System.out.printf("The DLTD. element is %d...",deque[f]);
        f=0;
        }
        else{
        System.out.printf("The DLTD. element is %d...",deque[f]);
        f++;
        }
        }
        void dequeue_rear(){
        if(f==-1 && r==-1){
        System.out.printf("List is Empty..");
        }
        else if(f == r){
        f=r=-1;
        }
        else if(r == 0){
        System.out.printf("The DLTD. element is %d...",deque[r]);
        r = N-1;
        }
        else{
        System.out.printf("The DLTD. element is %d...",deque[r]);
        r--;
        }
        }
        void display(){
        int i = f;
        if(f==-1 && r==-1){
        System.out.printf("List is empty...");
        }
        else{
        System.out.printf("The queue elements are...: ");
        while(i != r){
        System.out.printf("%d  ",deque[i]);
        i = (i+1)%N;
        }
        System.out.printf("%d ",deque[r]);
        }
        }
        void main(){
        enqueue_front(4);
        enqueue_front(7);
        System.out.printf("\n");
        display();
        enqueue_rear(2);
        enqueue_rear(5);
        enqueue_rear(-7);
        System.out.printf("\n");
        display();
        System.out.printf("\n");
        get_front();
        System.out.printf("\n");
        get_rear();
        System.out.printf("\n");
        dequeue_front();
        System.out.printf("\n");
        dequeue_rear();
        System.out.printf("\n");
        display();
        System.out.printf("\n");
        get_front();
        System.out.printf("\n");
        get_rear();
        }*/
        
        
        //Binary Tree traversals(INORDER, PRE-ORDER, POST-ORDER)...By using RECURSION...
        /*#include<stdio.h>
        struct node{
        int data;
        struct node *left;
        struct node *right;
        };
        struct node *createnode(int data){
        struct node* newnode = (struct node*)malloc(sizeof(struct node));
        newnode -> data = data;
        newnode->left = newnode->right = NULL;
        return newnode;
        }
        
        struct node* insert(struct node* root, int data){
        if(root == NULL){
        return createnode(data);
        }
        if(data < root->data){
        root -> left = insert(root->left, data);
        }
        else if(data > root->data){
        root->right = insert(root->right, data);
        }
        return root;
        }
        void inorder(struct node *root){
        if(root == 0){
        return;    }
        inorder(root -> left);
        System.out.printf("%d  ",root->data);
        inorder(root -> right);
        }
        void preorder(struct node *root){
        if(root == 0){
        return;    }
        System.out.printf("%d  ",root->data);
        preorder(root -> left);
        preorder(root -> right);
        }
        void postorder(struct node *root){
        if(root == 0){
        return;    }
        postorder(root -> left);
        postorder(root -> right);
        System.out.printf("%d  ",root->data);
        }
        
        int main(){
        struct node* root;
        int values[] = {15,10,20,8,12,18,25};
        for(int i=0; i<7; i++){
        root = insert(root,values[i]);
        }
        System.out.printf("In-order traversal of the BST: ");
        inorder(root);
        System.out.printf("\n");
        System.out.printf("Pre-order traversal of the BST: ");
        preorder(root);
        System.out.printf("\n");
        System.out.printf("Post-order traversal of the BST: ");
        postorder(root);
        return 0;
        }*/
        
        
        //Binary Tree traversals(INORDER, PRE-ORDER, POST-ORDER)...By Non-Recursively...in sky blue copy...notes....
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}