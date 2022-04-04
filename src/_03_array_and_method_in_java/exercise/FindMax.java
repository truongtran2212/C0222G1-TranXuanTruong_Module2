package _03_array_and_method_in_java.exercise;

public class FindMax {
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] array = {
                {12, 5, 26, 27, 22, 44, 15, 6, 3},
                {55, 78, 3, 1, 6, 12, 67, 33, 7},
        };
        System.out.println("Số lớn nhất ở trong mảng là: "  + findMax(array));
    }
}
