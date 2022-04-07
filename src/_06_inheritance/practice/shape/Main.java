package _06_inheritance.practice.shape;

import _04_class_and_object_in_java.exercise.quadratic_equation.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue",false,4);

        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());
        System.out.println(circle.toString());
        System.out.println("\n");


        Rectangle rectangle = new Rectangle("red",true, 10, 2);
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println("\n");


        Square square = new Square(4.0);
        System.out.println("Diện tích hình vuông là: " + square.getArea());
        System.out.println(square.toString());

    }
}
