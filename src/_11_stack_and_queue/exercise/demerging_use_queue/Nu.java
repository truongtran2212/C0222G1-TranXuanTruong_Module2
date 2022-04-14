package _11_stack_and_queue.exercise.demerging_use_queue;

import java.util.Date;

public class Nu extends Employee {
    public final boolean gender = false;
    public Nu(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }


    @Override
    public boolean isGender() {
        return gender;
    }

    @Override
    public void setGender(boolean gender) {
        super.setGender(gender);
    }

    @Override
    public int compareTo(Employee o) {
        return super.compareTo(o);
    }
}
