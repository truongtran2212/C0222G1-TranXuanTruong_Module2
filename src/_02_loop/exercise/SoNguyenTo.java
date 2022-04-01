package _02_loop.exercise;


public class SoNguyenTo {
    public static void main(String[] args) {
        int number = 2;
        int count1 = 0;
        while (count1 < 20) {
            int count2 = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count2++;
                }
            }
            if (count2 == 0) {
                System.out.println(number);
                count1++;
            }
            number++;
        }
    }
}
