package _05_accessmodifier_and_static.exercise.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
