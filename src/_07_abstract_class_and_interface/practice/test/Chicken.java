package _07_abstract_class_and_interface.practice.test;

class Chicken extends Animal implements Edible  {


    @Override
    public String sound() {
        return "chicken: gau gau";
    }

    @Override
    public String howToEat() {
        return "chicken: fry it";
    }
}
