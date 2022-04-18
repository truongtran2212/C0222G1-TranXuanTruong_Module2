package _13_search_algorithm.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LargestLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {

            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.addAll(list);
            }
            list.clear();
        }
        for (Character item : max) {
            System.out.print(item);
        }
    }
}
