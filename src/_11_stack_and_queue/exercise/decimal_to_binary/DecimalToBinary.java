package _11_stack_and_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

import static sun.plugin2.os.windows.FLASHWINFO.size;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 số: ");
        int number = Integer.parseInt(input.nextLine());

        while(number > 0){
            newStack.push(number%2);
           number = number/2;
        }
        while(!newStack.isEmpty()){
                str += newStack.pop();
        }
        System.out.println(str);
    }
}
