package _07_abstract_class_and_interface.practice.test4;

public class Interface {
    public static void main(String[] args) {
        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i <20; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);
        }

    }
}
