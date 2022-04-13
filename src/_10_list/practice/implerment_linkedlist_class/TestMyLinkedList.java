package _10_list.practice.implerment_linkedlist_class;

import java.util.Arrays;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(15);
        ll.addFirst(14);
        ll.addFirst(13);

        ll.add(4,5);
        ll.add(4,7);
        ll.printList();

        System.out.println(ll);
    }
}
