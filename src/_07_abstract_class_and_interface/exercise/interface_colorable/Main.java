package _07_abstract_class_and_interface.exercise.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle("Red", false, 5);
        shape[1] = new Square("Red", true, 5);

        System.out.println("Các hình");
        for (Shape item : shape) {
            System.out.println("Diện tích: ");
            System.out.println(item.getArea());
            if (item instanceof Colorable) {
                Square  square = (Square) item;
                square.howToColor();
            }
        }
    }
}
