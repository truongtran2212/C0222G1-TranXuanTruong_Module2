package _07_abstract_class_and_interface.practice.test3;

public class Main {
    public static void main(String[] args) {
        Animal animal2 = new Chicken();
        eat(animal2);
        System.out.println(animal2.howToEat());
        animal2 = new Duck();
        eat(animal2);
    }
    public static void eat(Animal alo){
        alo.howToEat();

    }
}
