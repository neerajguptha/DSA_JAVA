package QUEUE;
import java.util.*;

import ARRAYS.reverseArray;

public class QueueB {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue {

        static Node head=null;
        static Node tail=null;

        // static  int arr[];
        // static  int size;
        // static  int rear;
        // static  int front;

        // Queue(int n){
        //     arr = new int[n];
        //     size = n;
        //     rear = -1;
        //     front=-1;
        // }

        public static boolean isEmpty(){
            return head==null && tail==null;
        }


        // public static boolean isFull(){
        //     return (rear+1)%size==front;
        // }

        // Add
        public static void add(int data) {
            Node newNode =new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
            // if(isFull()){
            //     System.out.println("Queue is full");
            //     return;
            // }
            // Add 1st Element 
            // if(front==-1){
            //     front=0;
            // }
            // rear=(rear+1)%size;
            // arr[rear] = data;
        }

        // Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front=head.data;
            // Single element
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;

            // int  result=arr[front]; 
            // // front=(front+1)%size;
            // //  Last el delete
            // if(rear==front){
            //     rear=front=-1;
            // }
            // else{
            //      front=(front+1)%size;
            // }
            // return result;
        }

        // Peek
        public static  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            // return arr[front];
            return head.data;   
        }   
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
