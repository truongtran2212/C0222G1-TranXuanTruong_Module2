package _17_binary_file_and_serialization.practice.student_list;

import java.io.*;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void writeToFile(String path, List<Student> students) {
        File file = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFile(String path) {
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        List<Student> students = new ArrayList<>();
        try {

            fileInputStream = new FileInputStream(file);

            objectInputStream = new ObjectInputStream(fileInputStream);

            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));


        writeToFile("src\\_17_binary_file_and_serialization\\practice\\student_list\\test.txt", students);
        List<Student> readStudent = readFile("src\\_17_binary_file_and_serialization\\practice\\student_list\\test.txt");

        for (Student item : readStudent) {
            System.out.println(item);
        }
    }
}