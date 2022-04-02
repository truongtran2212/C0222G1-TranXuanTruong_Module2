package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println(" Nhập số lượng phần tử");
        int n = input.nextInt();
        int[]array = new int[n];
        for (int i = 0; i < array.length; i++) {

            System.out.println("Phần tử: " + i);
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);
    }
}
