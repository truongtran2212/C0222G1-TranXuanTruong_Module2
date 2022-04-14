package _11_stack_and_queue.exercise.palindrome_use_queue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = input.nextLine();
        String[] array = str.toLowerCase().split("");
//        System.out.println(Arrays.toString(array));

        for (int i = 0; i <array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if(!stack.pop().equals(queue.poll())){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}