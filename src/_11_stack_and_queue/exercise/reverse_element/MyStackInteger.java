package _11_stack_and_queue.exercise.reverse_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStackInteger {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Số phần tử có trong mảng");
        int n = Integer.parseInt(input.nextLine());
        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử: ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(array));

        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            myStack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = myStack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
