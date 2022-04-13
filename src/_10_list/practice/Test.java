package _10_list.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyClass {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}






        // Cú pháp tạo mảng
//        List <String> cars = new ArrayList<String>(); // tác dụng của cái String bên new
//
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        cars.add("Toyota");
//
//
//        Object[] objects = cars.toArray();
//        System.out.println(Arrays.toString(objects));

//        String[] value = {"one","two","three"};
//        List<String> list = (List<String>) Arrays.asList(value);
//
//        System.out.println(list);
//        List<String> subcars = cars.subList(0,cars.size());
//        System.out.println(subcars);



        // thêm phần tử vào mảng
//        cars.add(3,"Audi");
//        System.out.println(cars);
//        ArrayList<String> motor = new ArrayList<String>();
//        motor.add("Ducati");
//        motor.add("Kawasaki");
//        System.out.println(motor);
//
//        // gộp 2 mảng
//        motor.addAll(cars);
//        System.out.println(motor);
//
//        // thay đổi 1 phần tử trong mảng
//        motor.set(0,"Shark");
//        System.out.println(motor);
//
//        // tìm vị trí
//        int index1 = cars.indexOf("Toyota");
//        System.out.println(index1);
//        // xóa 1 phần tử
//        cars.remove(2);
//        System.out.println(cars);
//
//        System.out.println(cars.size());
//
//
//        boolean containsElement = cars.contains("Volvo");
//        System.out.println(containsElement);

