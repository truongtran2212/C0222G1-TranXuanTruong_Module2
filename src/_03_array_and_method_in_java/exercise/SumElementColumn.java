package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class SumElementColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Số lượng mảng ");
        int n = input.nextInt();
        System.out.println(" Số lượng phần tử");
        int m = input.nextInt();
        int[][] array = new int[n][m];
        int sum = 0;
        System.out.println(" Nhập các phần tử vào mảng");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println(" Cột muốn cộng");
        int a = input.nextInt();
        for (int j = 0; j < m; j++) {
            if (a >= 0 && a < n)
                sum += array[a][j];

        }
        System.out.println(sum);
    }
}
