package _05_accessmodifier_and_static.exercise.class_in_java;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Trường");
        student.setClasses("C022G1");


        System.out.println("Tên học sinh là: " + student.getName() + "\n" + "Học lớp: " + student.getClasses());

    }
}
