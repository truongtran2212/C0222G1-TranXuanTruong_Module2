package _05_accessmodifier_and_static.exercise.training;

public class Student {

    private String name;
    private int age;
    private String address;
    private double point;
    public static int count;

    public Student(){

    }
    public Student (String name, int age, String address, double point){
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + "\t" +
                ", age=" + getAge() +
                ", address='" + getAddress() + "\t" +
                ", point=" + getPoint() +
                '}'+ "\n";
    }
}
