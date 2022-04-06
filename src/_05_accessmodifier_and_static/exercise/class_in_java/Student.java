package _05_accessmodifier_and_static.exercise.class_in_java;

public class Student {
    private String name;
    private String classes;

    Student(){
        this.name = "John";
        this.classes = "C02";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

     public void setClasses(String classes) {
        this.classes = classes;
    }
}
