package _05_accessmodifier_and_static.practice;

public class Test {
    public class Apple extends Fruit {
        public Apple(String name) {
            super(name);
        }
    }

    class Fruit {
        public Fruit(String name) {
            System.out.println("Fruit's constructor invoked");
        }
    }
}