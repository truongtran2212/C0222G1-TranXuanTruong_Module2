package _12_java_collection_framework.practice.distinguish_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",30, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Truong",22, "HN");


        // HashMap duyệt từ trên xuống
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(4,student3);
        studentMap.put(3,student1);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");


        // HashSet duyệt từ dưới lên
        Set<Student> students = new HashSet<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
