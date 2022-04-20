package _15_exception_handling_and_debug.exercise.illegal_triangle_exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("Cạnh thứ nhất");
                int x = Integer.parseInt(scanner.nextLine());

                System.out.println("Cạnh thứ hai");
                int y = Integer.parseInt(scanner.nextLine());

                System.out.println("Cạnh thứ ba");
                int z = Integer.parseInt(scanner.nextLine());

                int sum = x + y + z;
                test(x, y, z);

                System.out.println("Tổng của 3 cạnh tam giác là: " + sum);
                break;
            }
            catch (NumberFormatException e) {
                System.err.println("Không được nhập chữ");
            }
            catch (IllegalTriangleException e) {
                System.err.println("Ngoại lệ là: " + e.getMessage());
            }
        }
    }

    public static void test (int x, int y , int z) throws IllegalTriangleException{
        if ((x < 0 || y < 0 || z < 0)) {
            throw new IllegalTriangleException("Bạn phải nhập số âm");
        }
        if ((x + y) < z || (y + z) < x || (x + z) < y) {
            throw new IllegalTriangleException("Độ dài mảng bị sai");
        }
    }
}