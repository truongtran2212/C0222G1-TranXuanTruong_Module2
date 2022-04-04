package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static int [] addElement(int [] array, int index, int number){
        if(index <= array.length-1)
            for (int i = array.length -1; i >= index; i--) {
                if (index == i) {
                    array[i] = number;
                    break;
                }
                array[i] = array[i-1];
            }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(" Nhập phần tử muốn thêm:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(" Nhập vị trí muốn thếm phần tử vào: ");
        int index = input.nextInt();

        int[] array = {2, 5, 3, 6, 8, 7, 9, 23,0};

        System.out.println(Arrays.toString(addElement(array, index, number)));
    }
}