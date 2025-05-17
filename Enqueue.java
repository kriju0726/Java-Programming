// Converted from Enqueue.c
import java.util.*;
public class Enqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
        // enqueue_front(11);
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
        }
    }
}