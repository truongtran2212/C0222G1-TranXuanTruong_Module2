package _11_stack_and_queue.exercise.count_character;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.*;

public class UseTreeMap {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = input.nextLine();
        System.out.println("Chuỗi của string");

        System.out.println(string);
        String[] array = string.toUpperCase().split("");
//        System.out.println("Chuỗi của array: ");
//        System.out.println(Arrays.toString(array));
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(" ")) {
                if (map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i]) + 1);
                } else {
                    map.put(array[i], 1);
                }
            }
        }
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String item : set) {
            System.out.println(item + " xuất hiện " + map.get(item) + " lần");
        }
    }
}