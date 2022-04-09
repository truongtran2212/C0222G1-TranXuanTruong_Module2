package _05_accessmodifier_and_static.exercise.training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Student[] students = new Student[4];
//        students[0] = new Student("Trường", 18, "12 Trần Phú", 9);
//        students[1] = new Student("Khoa", 17, "12 Trần Phú", 9);
//        System.out.println(Arrays.toString(students));
//
//        for (int i = 2; i < students.length; i++) {
//            if (students[i] == null) {
//                System.out.println("Tên học sinh: ");
//                String name = input.nextLine();
//
//                System.out.println("Tuổi: ");
//                int age = Integer.parseInt(input.nextLine());
//
//                System.out.println("Địa chỉ: ");
//                String address = input.nextLine();
//
//                System.out.println("Điểm: ");
//                int point = Integer.parseInt(input.nextLine());
//
//                students[i] = new Student(name, age, address, point);
//
//            }
//        }
//
//        System.out.println(Arrays.toString(students));
//        System.out.println("Vị trí muốn xóa");
//        int n = input.nextInt();
//        students[n] = null;
//        for (Student student : students) {
//            if (student == null) {
//                continue;
//
//            }
//            System.out.println(student.toString());
//        }
//    }

        boolean check = true;
        while (check) {
            System.out.println("1.ád");
            System.out.println("2.ád");
            System.out.println("3.ád");
            System.out.println("4. out");


            switch (scanner.nextInt()){
                case 1:
                    System.out.println();

            }
        }
    }
}
