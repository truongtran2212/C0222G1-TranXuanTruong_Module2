package _10_list.exercise.method_of_linkedlist;

import javax.xml.soap.Node;

public class NewMyLinkedList {
    private int numNodes = 0;
    private Node head;

    public NewMyLinkedList(Object data) {
        head = new Node(data) {
        };
    }
}
