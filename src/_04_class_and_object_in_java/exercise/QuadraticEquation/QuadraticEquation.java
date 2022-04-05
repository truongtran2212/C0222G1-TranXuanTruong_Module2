package _04_class_and_object_in_java.exercise.QuadraticEquation;

public class QuadraticEquation {
   private double a, b, c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    public double getC() {

        return c;
    }

    public void setC(double c) {

        this.c = c;
    }

    public double getA() {
        return a;

    }

    public double getDiscriminant() {

        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
    }

    public double getRoot3() {
        return -b / 2 * a;
    }
}
