package _11_stack_and_queue.exercise.demerging_use_queue;

import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String name;
    private boolean gender;
    private int DateOfBirth;

    public Employee(String name, int dateOfBirth) {
        this.name = name;
        this.DateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                '}' + "\n";
    }


    @Override
    public int compareTo(Employee o) {
        if (DateOfBirth > o.DateOfBirth) {
            return 1;
        } else if (DateOfBirth < o.DateOfBirth) {
            return -1;
        } else {
            return 0;
        }
    }
}
