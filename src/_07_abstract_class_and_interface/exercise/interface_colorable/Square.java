package _07_abstract_class_and_interface.exercise.interface_colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println( "Color all four sides.");
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square " +
                "side=" + side + ". " + super.toString();
    }
}
