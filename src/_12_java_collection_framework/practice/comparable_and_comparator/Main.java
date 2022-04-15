package _12_java_collection_framework.practice.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students student = new Students("Kien", 30, "HT");
        Students student1 = new Students("Nam", 26, "HN");
        Students student2 = new Students("Anh", 38, "HT" );
        Students student3 = new Students("Tung", 38, "HT" );

        List<Students> lists = new ArrayList<Students>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        System.out.println("Sắp xếp theo tên");
        Collections.sort(lists);
        for(Students st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Students st : lists){
            System.out.println(st.toString());
        }
    }
}
