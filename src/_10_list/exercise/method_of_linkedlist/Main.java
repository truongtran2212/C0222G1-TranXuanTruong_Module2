package _10_list.exercise.method_of_linkedlist;

public class Main {
    public static void main(String[] args) {
        NewMyLinkedList newMyLinkedList = new NewMyLinkedList();

        newMyLinkedList.addFirst(10);
        newMyLinkedList.addLast(15);
        newMyLinkedList.add(3,4);
        newMyLinkedList.addFirst(13);

        System.out.println("Độ dài của mảng: " + newMyLinkedList.size());


        System.out.println();
        System.out.println("Mảng gồm các phần tử: ");
        newMyLinkedList.printList();

        System.out.println("Xét phần tử có trong mảng hay không");
        System.out.println(newMyLinkedList.contains(3));

        System.out.println("Xóa phần tử");
        newMyLinkedList.remove(2);
        newMyLinkedList.printList();

        System.out.println("Vị trí của phần tử trong mảng: ");
        System.out.println(newMyLinkedList.indexOf(4));

        System.out.println("Lấy ra 1 phần tử");
//        newMyLinkedList.printList();
        newMyLinkedList.get(3);

    }
}
