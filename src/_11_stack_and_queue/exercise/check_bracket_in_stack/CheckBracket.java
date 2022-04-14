package _11_stack_and_queue.exercise.check_bracket_in_stack;

import _06_inheritance.practice.shape.Square;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = input.nextLine();

        System.out.println(check(string));

    }

    public static boolean check( String string){
        Stack<String> bStack = new Stack<>();
        String [] array = string.split("");
        for (int i = 0; i < string.length(); i++) {
            if (array[i].equals("(")) {
                bStack.push(array[i]);
            } else if (array[i].equals(")")) {
                if (bStack.empty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if(bStack.empty()){
            return true;
        }else{
            return false;
        }

    }
}