package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập phần tử muốn xóa:");
        int number = input.nextInt();
        int index = 0;
        int[] array = {2, 5, 3, 6, 8, 7, 9, 23};
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
            }
        }
        for (int i = index; i < array.length -1 ; i++) {
            array[i] = array[i + 1];

        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));

    }

}




