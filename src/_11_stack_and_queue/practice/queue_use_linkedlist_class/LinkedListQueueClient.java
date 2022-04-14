package _11_stack_and_queue.practice.queue_use_linkedlist_class;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
//        queue.dequeue();
        queue.enqueue(25);
        queue.enqueue(40);
        queue.dequeue();
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
