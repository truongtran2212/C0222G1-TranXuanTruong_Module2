package _07_abstract_class_and_interface.practice.animal_class_and_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "ò ó o";
    }

    @Override
    public String howToEat() {
        return "Chicken eat corn";
    }
}
