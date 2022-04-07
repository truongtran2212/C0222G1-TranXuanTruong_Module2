package _06_inheritance.practice.shape;

public class Square extends Rectangle{
    private double side;
    Square(){
        this.side = 1.0;
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getArea(){
        return getSide() * getSide();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() +
                " , which is a subclass of " + super.toString();
    }
}
