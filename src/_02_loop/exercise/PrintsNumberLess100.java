package _02_loop.exercise;

public class PrintsNumberLess100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            int count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(number);
            }
            number++;
        }
    }

}
