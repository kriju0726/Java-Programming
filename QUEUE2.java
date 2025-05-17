// Converted from QUEUE2.c
import java.util.*;
public class QUEUE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //IMPLEMENTATION OF QUEUE USING ARRAY...
        
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
        System.out.printf("%d\n",queue[front]);
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
        
        void main(){
        System.out.printf("After, enqueue 5, 7, 9, 0, 12\nQueue having ");
        enqueue(5);
        enqueue(7);
        enqueue(9);
        enqueue(0);
        enqueue(12);
        display();
        System.out.printf("\nAfter dequeue one element... ");
        dequeue();
        System.out.printf("Queue having ");
        display();
        }
        
        
    }
}