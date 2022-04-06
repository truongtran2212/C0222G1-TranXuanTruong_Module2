package _05_accessmodifier_and_static.practice.static_method;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

