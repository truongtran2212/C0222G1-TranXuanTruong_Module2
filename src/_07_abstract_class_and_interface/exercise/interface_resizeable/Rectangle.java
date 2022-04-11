package _07_abstract_class_and_interface.exercise.interface_resizeable;

public class Rectangle extends Shape {
        private double width;
        private double length;

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * percent/100;
        this.length += this.length * percent/100;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "width=" + width +
                ", length=" + length + ". " + super.toString() ;

    }
}

