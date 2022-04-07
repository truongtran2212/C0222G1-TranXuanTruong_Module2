package _06_inheritance.practice.shape;

public class Shape {
    private String color;
    private boolean filled;

    Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (this.filled) {
            return "A shape with color of " + getColor() + " and filled";
        } else {
            return "A shape with color of " + getColor() + " and not filled";
        }
    }
}

