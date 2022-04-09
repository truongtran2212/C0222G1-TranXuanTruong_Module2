package _07_abstract_class_and_interface.practice.bai_lam_them;

public class Student extends Person {
    private int point;
    Student(){

    }

    public Student(String name, int age, boolean gender, int point) {
        super(name, age, gender);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return
               "Sinh viên: " +  super.toString() + " " +  "point= " + point + " " ;
    }
}
