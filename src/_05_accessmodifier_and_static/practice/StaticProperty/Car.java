package _05_accessmodifier_and_static.practice.StaticProperty;

public class Car {
        private String name;

        private String engine;


        public static int numberOfCars;


        public Car(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }
}
