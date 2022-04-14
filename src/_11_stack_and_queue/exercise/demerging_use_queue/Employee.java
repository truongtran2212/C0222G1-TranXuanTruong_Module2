package _11_stack_and_queue.exercise.demerging_use_queue;

import java.util.Date;

public class Employee {
        private String name;
        private boolean gender = false;
        private int DateOfBirth;

    public Employee(String name, boolean gender, int dateOfBirth) {
        this.name = name;
        this.gender = gender;
        DateOfBirth = dateOfBirth;
    }

    public Employee() {
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
}
