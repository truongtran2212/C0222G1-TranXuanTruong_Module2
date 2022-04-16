package _case_study.model.person;

public class Employee extends Person {
        private String level;
        private int salary;
        private String staffPosition;

    public Employee() {
    }

    public Employee(String level, int salary, String staffPosition) {
        this.level = level;
        this.salary = salary;
        this.staffPosition = staffPosition;
    }

    public Employee(int id,
                    int age,
                    String name,
                    int phoneNumber,
                    int idCardNumber,
                    String email,
                    String gender,
                    String level,
                    int salary,
                    String staffPosition) {
        super(id, age, name, phoneNumber, idCardNumber, email, gender);
        this.level = level;
        this.salary = salary;
        this.staffPosition = staffPosition;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    @Override
    public String toString() {
        return "Employee{ " + super.toString() +
                " level='" + level + '\'' +
                ", salary=" + salary +
                ", staffPosition='" + staffPosition + '\'' +
                '}';
    }
}
