package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumElementColumn {
    public static int sumElementColumn(int indexCol , int col, int row,int[][] array){
        int sum = 0;
        for (int j = 0; j < col; j++) {
            if (indexCol >= 0 && indexCol < row)
                sum += array[j][indexCol];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Số lượng mảng ");
        int col = input.nextInt();
        System.out.println(" Số lượng phần tử");
        int row = input.nextInt();
        int[][] array = new int[col][row];
        System.out.println(" Nhập các phần tử vào mảng");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        System.out.println(Arrays.deepToString(array));
        System.out.println(" Cột muốn cộng");
        int indexCol = input.nextInt();
        System.out.println(sumElementColumn(indexCol,col,row,array));
    }
}
