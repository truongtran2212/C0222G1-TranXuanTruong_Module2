package _07_abstract_class_and_interface.practice.animal_class_and_interface_edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();


        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruits[] fruits = new Fruits[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruits fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
