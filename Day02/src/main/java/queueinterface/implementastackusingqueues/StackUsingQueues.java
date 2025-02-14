package queueinterface.implementastackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> q1= new LinkedList<>();
    private Queue<Integer> q2= new LinkedList<>();

    public void push(int x){
        q1.offer(x);
    }

    public int pop(){
        if(q1.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }

        while (q1.size()>1){
            q2.offer(q1.poll());
        }

        int topElement = q1.poll();

        Queue<Integer> temp= q1;
        q1=q2;
        q2= temp;

        return topElement;
    }

    public int top(){
        if(q1.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }

        while (q1.size()>1){
            q2.offer(q1.poll());
        }

        int topElement = q1.peek();
        q2.offer(q1.poll());

        Queue<Integer> temp= q1;
        q1=q2;
        q2= temp;

        return topElement;
    }
}
