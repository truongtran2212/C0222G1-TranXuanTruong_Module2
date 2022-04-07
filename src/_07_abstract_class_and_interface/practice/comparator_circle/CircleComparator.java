package _07_abstract_class_and_interface.practice.comparator_circle;

import _06_inheritance.practice.shape.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public CircleComparator() {
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}


