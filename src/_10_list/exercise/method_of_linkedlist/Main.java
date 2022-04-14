package _10_list.exercise.method_of_linkedlist;

public class Main {
    public static void main(String[] args) {
        NewMyLinkedList<Integer> newMyLinkedList = new NewMyLinkedList<>();

        newMyLinkedList.addFirst(5);
        newMyLinkedList.addLast(15);
        newMyLinkedList.addLast(20);
        newMyLinkedList.addLast(20);
        newMyLinkedList.addLast(25);
        newMyLinkedList.addLast(30);

//        newMyLinkedList.printList();


//        System.out.println();
//        System.out.println("Mảng gồm các phần tử: ");
//        newMyLinkedList.printList();
//
//        System.out.println("Xét phần tử có trong mảng hay không");
//        System.out.println(newMyLinkedList.contains(3));
//
//        System.out.println("Xóa phần tử");
//        newMyLinkedList.remove(2);
//        System.out.println(newMyLinkedList.remove(4));

//        System.out.println("Vị trí của phần tử trong mảng: ");
//        System.out.println(newMyLinkedList.indexOf(4));
//
//        System.out.println("Lấy ra 1 phần tử");
//
//        newMyLinkedList.get(3);
//    newMyLinkedList.get(5);

        System.out.println(newMyLinkedList.remove(2));

    }
}
