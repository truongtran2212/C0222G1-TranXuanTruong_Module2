package _07_abstract_class_and_interface.practice.bai_lam_them;

public class Teacher extends Person{
    private int salary;

    Teacher(){

    }
    public Teacher(int salary) {
        super();
        this.salary = salary;
    }

    public Teacher(String name, int age, boolean gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Giáo viên: " + super.toString() + " " +  "salary= " + salary;
    }
}
