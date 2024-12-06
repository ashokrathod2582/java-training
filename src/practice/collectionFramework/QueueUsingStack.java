package practice.collectionFramework;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> inbox;
    private Stack<Integer> outbox;

    public QueueUsingStack(){
        this.inbox = new Stack<>();
        this.outbox = new Stack<>();
    }
    public void enqueue(int n){
        inbox.push(n);
    }

    public int dequeue(){
        if(outbox.isEmpty()){
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

    public boolean isEmpty(){
        return outbox.isEmpty() && inbox.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}
