package _15_exception_handling_and_debug.exercise.illegal_triangle_exception;


import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Cạnh thứ nhất");
            int x = scanner.nextInt();

            System.out.println("Cạnh thứ hai");
            int y = scanner.nextInt();

            System.out.println("Cạnh thứ ba");
            int z = scanner.nextInt();


            if ((x < 0 || y < 0 || z < 0) ) {

             throw new IllegalTriangleException("Không được có số âm");

            }if((x + y) < z || (y + z) < x || (x + z) < y){
                throw new IllegalTriangleException("Tổng 2 số cộng lại phải lớn hơn số còn lại");
            }

            System.out.println("Tổng của 3 cạnh tam giác là: " + x + y + z);
        } catch (Exception e) {
            System.out.println("Có lỗi rồi " + e);
        }
    }
}