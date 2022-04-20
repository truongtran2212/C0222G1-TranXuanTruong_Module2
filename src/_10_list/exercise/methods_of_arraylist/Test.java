package _10_list.exercise.methods_of_arraylist;

import _10_list.practice.inplement_list_class.MyList;

import java.sql.SQLOutput;
import java.util.List;
import static com.sun.javafx.fxml.expression.Expression.add;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        NewMyList<Integer> myList = new NewMyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList);

        System.out.println(myList.toString());
        System.out.println("Độ dài mảng là: " + myList.size());

        System.out.println("Lấy ra 1 phần tử trong mảng: " + myList.get(3));

        System.out.println("Thêm phần tử ");
        myList.add(1, 10);
        System.out.println(myList.toString());

        System.out.println("Xóa phần tử");
        myList.remove(3);
        System.out.println(myList.toString());

        System.out.println("Vị trí của phần tử muốn tìm là: ");
        System.out.println(myList.indexOf(2));

        System.out.println("Xét phần tử có trong mảng hay không");
        System.out.println(myList.contains(1));

        System.out.println("Xóa tất cả các phần tử trong mảng: ");
        myList.clear();
        System.out.println(myList.toString());


    }
}
