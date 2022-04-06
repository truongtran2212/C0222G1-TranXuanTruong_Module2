package _06_inheritance.practice;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.p(20);
        a.p(10);
    }
}

class A extends B {

    public void p(int number) {
        System.out.println(number);
    }
}

class B {
    public void p(int number) {
        System.out.println(number * 2);
    }
}
