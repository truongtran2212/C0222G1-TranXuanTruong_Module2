package _07_abstract_class_and_interface.practice.test4;

public class Interface {
    public static void main(String[] args) {

        Edible stuff = new Chicken();

        eat(stuff);

        stuff = new Duck();

        eat(stuff);

        stuff = new Broccoli();

        eat(stuff);

    }

    public static void eat(Edible stuff) {

        stuff.howToEat();

    }

    interface Edible {

        public String howToEat();

    }

    static class Chicken implements Edible {

        @Override

        public String howToEat() {

            return "Fry it";

        }

    }

    static class Duck implements Edible {

        @Override

        public String howToEat() {

            return "Roast it";

        }

    }

    static class Broccoli implements Edible {

        @Override

        public String howToEat() {

            return "Stir-fry it";

        }

    }
}
