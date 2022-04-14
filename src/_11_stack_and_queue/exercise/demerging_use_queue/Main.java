package _11_stack_and_queue.exercise.demerging_use_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Employee [] employee = new Employee[10];
    public static void main(String[] args) {
        Queue<String > NU = new LinkedList<>();
        Queue<String > NAM = new LinkedList<>();


        employee[0] = new Nam("Trường",true,2000);
        employee[1] = new Nu("Hoa",false,1993);
        employee[1] = new Nam("Khoa",false,1998);
        employee[1] = new Nu("Huệ",false,1995);
        employee[1] = new Nu("Hà",false,1997);

    }
}
