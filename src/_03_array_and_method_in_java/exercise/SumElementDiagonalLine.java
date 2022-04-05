package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementDiagonalLine {
    public static void sumElementDiagonalLine(int[][]array){
        int sum = 0;
        int sum1 = 0;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            sum += array[i][i];
            sum1 += array[i][j];
        }
        System.out.println("Tổng đường chéo từ phải qua trái");
        System.out.println(sum1);
        System.out.println("Tổng đường chéo từ trái qua phải");
        System.out.println(sum);
        System.out.println("Tổng của 2 đường chéo");
        System.out.println(sum + sum1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        System.out.println((Arrays.deepToString(array)));
        sumElementDiagonalLine(array);
        }
    }




