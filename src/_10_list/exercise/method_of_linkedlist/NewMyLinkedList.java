package _10_list.exercise.method_of_linkedlist;

public class NewMyLinkedList<E> {
    private int numNodes = 0;
    private Node head;

    public NewMyLinkedList(Object data) {
        head = new Node(data);
    }
    public NewMyLinkedList(){

    }
    private static class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
        }
    }

    public void remove(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }

        numNodes--;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        System.out.println(temp.data);
    }
    public E getFirst() {
        Node temp = head;
        return (E) temp.getData();
    }

    public int size() {
       return numNodes;
    }

    public boolean contains(Object data) {
        Node temp = head;
        boolean flag = false;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            }
            else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                index = i;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return index;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void clear() {
        for (Node temp = head; temp != null; ) {
            temp = null;
            temp.data = null;
            temp = temp.next;
        }
        head = null;
        numNodes = 0;
    }
}
