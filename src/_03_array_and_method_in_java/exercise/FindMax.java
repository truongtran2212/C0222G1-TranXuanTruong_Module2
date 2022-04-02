package _03_array_and_method_in_java.exercise;

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int[][] array = {
                {12, 5, 26, 27, 22, 44, 15, 6, 3},
                {55, 78, 3, 1, 6, 12, 67, 33, 7},
        };
        int max = array[0][0];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là: " + max);
    }
}
