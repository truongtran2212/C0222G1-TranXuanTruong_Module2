package _07_abstract_class_and_interface.practice.bai_lam_them;

public abstract class Person {
    private String name;
    private int age;
    private boolean gender = true;

    Person(){

    }
    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name= " + name + '\'' + ", age= " + age + ", gender= " + gender;
    }
}
