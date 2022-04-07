package _06_inheritance.exercise.circle_and_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"Orange");
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Circle: " + circle.toString());
        System.out.println("\n");

        Cylinder cylinder = new Cylinder(7,"Black",10);
        System.out.println("Thể tích hình trụ là: " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
