package _06_inheritance.exercise.point_and_moveablepoint;

public class TestMoveable {
    public static void main(String[] args) {
        System.out.println("Mảng x, y");
        Point point = new Point(3,4);
        System.out.println(point.toString());
        System.out.println("Mảng có speed");

        MoveablePoint moveablePoint = new MoveablePoint(20,10,50,20);
        System.out.println(moveablePoint.toString() + "\n" + moveablePoint.move());
    }
}
