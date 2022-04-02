package _03_array_and_method_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,12,15,20};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index++;
            }
        }
        System.out.println("Số có giá trị lớn nhất là: " + max + " ở vị trí: " + index);

    }
}
