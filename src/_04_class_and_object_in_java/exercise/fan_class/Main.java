package _04_class_and_object_in_java.exercise.fan_class;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        System.out.println("fan1");
        System.out.println(fan1.toString());

        
        Fan fan2 = new Fan();
        System.out.println("fan2");
        System.out.println(fan2.toString());

    }
}
