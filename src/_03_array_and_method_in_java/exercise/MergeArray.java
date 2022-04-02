package _03_array_and_method_in_java.exercise;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        return array3;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Số lượng phần tử của mảng 1");
        int n = input.nextInt();
        int[] array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Phần tử: " + i + " ");
            array1[i] = input.nextInt();
        }

        System.out.println("Số lượng phần tử của mảng 2");
        int m = input.nextInt();
        int[] array2 = new int[m];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Phần tử: " + i + " ");
            array2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Kết quả gộp 2 mảng");
        System.out.println(Arrays.toString(mergeArray(array1, array2)));
    }
}
