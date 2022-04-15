package _12_java_collection_framework.practice.comparable_and_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() < o2.getAge()){
            return -1;
        }else{
            return 0;
        }
    }
}
