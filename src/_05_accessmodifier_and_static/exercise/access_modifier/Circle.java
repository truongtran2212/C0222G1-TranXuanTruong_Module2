package _05_accessmodifier_and_static.exercise.access_modifier;

public class Circle {
    private double radius;
    private String color;
    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
}
