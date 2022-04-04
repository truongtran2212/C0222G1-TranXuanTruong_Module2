package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì");
        String str1 = input.nextLine();
        System.out.println("Nhập kí tự cần đếm");
        String character = input.nextLine();
        int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (character.charAt(0) == str1.charAt(i)) {
                    count++;
                }
            }
        System.out.println("Kí tự muốn đếm trong chuỗi là: " + character+ "\n"+ "Số lần xuất hiện của nó là: "+count);
    }
}
