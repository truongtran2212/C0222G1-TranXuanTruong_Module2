package _15_exception_handling_and_debug.practice;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e);
        }
        finally {
            System.out.println("Đúng hết r");
        }
    }
}
