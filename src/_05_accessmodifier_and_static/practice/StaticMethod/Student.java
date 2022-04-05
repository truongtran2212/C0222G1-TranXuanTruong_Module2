package _05_accessmodifier_and_static.practice.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public Student() {

    }


    static void change() {
        college = "CODEGYM";
    }


    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

