package _13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử vào mảng");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int left = 0;
        int right = array.length - 1;
        int value;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử: " + i);
            array[i] =(int) Math.floor(Math.random()*size);
        }
        Arrays.sort(array);
        System.out.println("Mảng: ");
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array,left,right,5));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] < value) {
                left = middle + 1;
            }
            else if (array[middle] > value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}