package _07_abstract_class_and_interface.practice.bai_lam_them;

import java.util.Scanner;

public class Main {
    public static Person[] person = new Person[10];

    public static void main(String[] args) {
        // Tạo mảng
        person[0] = new Teacher("Hoa", 25, false, 6000000);
        person[1] = new Teacher("Huệ", 30, false, 6000000);
        person[2] = new Student("Hòa", 19, true, 10);
        person[3] = new Student("Trường", 18, true, 10);
        person[4] = new Student("Tùng", 20, true, 9);
        person[5] = new Teacher("Nghĩa", 20, true, 5000000);

        System.out.println(person.toString());
        // làm danh sách các option
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("0. Danh sách");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Danh sách giáo viên");
            System.out.println("3. Thêm sinh viên");
            System.out.println("4. Thêm giáo viên");
            System.out.println("5. Xóa tên sinh viên");
            System.out.println("6. Xóa tên giáo viên");
            System.out.println("7. Out danh sách");
            System.out.println("Chọn option");


            int choose = Integer.parseInt(scanner.nextLine()); // nên chuyển sang dạng này
            if (choose == 7) {
                break;
            }
            switch (choose) {
                case 0:
                    display();
                    break;
                case 1:
                    danhSachSinhVien();
                    break;
                case 2:
                    danhSachGiaoVien();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    addTeacher();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    deleteTeacher();
                    break;
            }
        }
    }

    // duyệt mảng
    public static void display() {
        for (int i = 0; i < 10; i++) {

            if (person[i] != null) {
                System.out.println(person[i]);
            }
        }
    }

    // ép kiểu qua DataType Student
    public static void danhSachSinhVien() {
        for (Person item : person) {
            if (item instanceof Student) {
                Student student = (Student) item;
                System.out.println(student.toString());
            }
        }
    }

    // ép kiểu qua DataType Teacher
    public static void danhSachGiaoVien() {
        for (Person item : person) {
            if (item instanceof Teacher) {
                Teacher teacher = (Teacher) item;
                System.out.println(teacher.toString());
            }
        }
    }

    // Thêm Student
    public static void addStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên sinh viên: ");

        String name = scanner.nextLine();
        System.out.println("Tuổi: ");

        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Điểm: ");

        int point = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính: 1. Nam ,  2. Nữ");
        boolean gender = false;
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            gender = true;
        }

        // Cách thêm
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (person[i] == null) {
                index = i;
                break;
            }
        }
        person[index] = new Student(name, age, gender, point);

        danhSachSinhVien();
    }

    // ép kiểu qua DataType Teacher
    public static void addTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên Giáo viên: ");

        String name = scanner.nextLine();
        System.out.println("Tuổi: ");

        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Lương: ");

        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính: 1. Nam ,  2. Nữ");
        boolean gender = false;
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            gender = true;
        }
        // Cách thêm
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (person[i] == null) {
                index = i;
                break;
            }
        }
        person[index] = new Teacher(name, age, gender, salary);

        System.out.println("Sau khi thêm");
        danhSachGiaoVien();
    }
    // Xóa tên học sinh
    // Chưa xử lí được else
    public static void deleteStudent() {
        System.out.println("Trước khi xóa");
        danhSachSinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên muốn xóa");
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            if (name.equals(person[i].getName())) {
                person[i] = null;
                System.out.println("Danh sách sau khi xóa");
                danhSachSinhVien();
                break;
            }
        }

    }
    // Xóa tên giáo viên
    public static void deleteTeacher() {
        System.out.println("Trước khi xóa");
        danhSachGiaoVien();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên muốn xóa");
        String name = scanner.nextLine();

       // Chưa xử lí được else

        for (int i = 0; i < person.length; i++) {
            if (name.equals(person[i].getName())) {
                person[i] = null; // đoạn này chưa hiểu
                System.out.println("Danh sách sau khi xóa");
                danhSachGiaoVien();
                break;
            }

        }

    }
}
