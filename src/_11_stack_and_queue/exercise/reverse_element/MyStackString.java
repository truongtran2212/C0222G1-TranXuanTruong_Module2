package _11_stack_and_queue.exercise.reverse_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStackString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String mWord = input.nextLine();
        System.out.println("Chuỗi của string");

        System.out.println(mWord);
        String[] array = mWord.split(" ");
        System.out.println("Chuỗi của array: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            wStack.push(array[i]);
        }

        String output = "";

        for (int i = array.length - 1; i >= 0; i--) {
            output += wStack.pop() + " ";
        }
        System.out.println("Chuỗi sau khi đảo: ");
        System.out.println(output);
    }
}
