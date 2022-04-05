package _04_class_and_object_in_java.exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Số a:");
        double a = input.nextDouble();
        System.out.println("Số b");
        double b = input.nextDouble();
        System.out.println("Số c");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép");
            System.out.println(quadraticEquation.getRoot3());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else
            System.out.println("The equation has no roots");
    }
}
