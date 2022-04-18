package _case_study.service.impl;

import _case_study.model.person.Employee;
import _case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {

//        employeeList.add(new Employee(1,20,"Trường"
//                ,"111111111", "0123456789","truongtran2212","nam"
//                ,"Đại học",100000000,"lễ tân"));
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id nhân viên:");
        int id = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tuổi nhân viên:");
        int age = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tên nhân viên:");
        String name = input.nextLine();

        System.out.println("Nhập số điện thoại nhân viên:");
        String phoneNumber = input.nextLine();

        System.out.println("Nhập chứng minh nhân dân nhân viên:");
        String idCardNumber = input.nextLine();

        System.out.println("Nhập email nhân viên:");
        String email = input.nextLine();

        System.out.println("Nhập giới tính nhân viên:");
        String gender = input.nextLine();

        System.out.println("Nhập trình độ nhân viên: ");
        String level = input.nextLine();

        System.out.println("Nhập lương nhân viên:");
        int salary = Integer.parseInt(input.nextLine());


        System.out.println("Nhập chức vụ nhân viên: ");
        String staffPosition = input.nextLine();


        // Sao phải tạo 1 đối tượng trong khi có thể bỏ cả cái new vào add()

        Employee employee = new Employee(id, age, name, phoneNumber, idCardNumber, email, gender, level, salary, staffPosition);

        // thệm vào đối tượng của arrayList
        employeeList.add(employee);
        System.out.println("Đã thêm mới thành công.");
    }

    @Override
    public void edit() {

        display();

        System.out.println("Tìm kiếm nhân viên thông qua tên:");
        System.out.println("------------------------------");

        System.out.println("Nhập tên nhân viên:");
        String name = input.nextLine();


        boolean flag = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) {
                employeeList.remove(i);

                System.out.println("Ở resort có nhân viên này: ");
                System.out.println("Bắt đầu chỉnh sửa thông tin: ");

                System.out.println("--------------------------");

                System.out.println("Nhập id nhân viên:");
                int id = Integer.parseInt(input.nextLine());

                System.out.println("Nhập tuổi nhân viên:");
                int age = Integer.parseInt(input.nextLine());

                System.out.println("Nhập số điện thoại nhân viên:");
                String phoneNumber = input.nextLine();

                System.out.println("Nhập chứng minh nhân dân nhân viên:");
                String idCardNumber = input.nextLine();

                System.out.println("Nhập email nhân viên:");
                String email = input.nextLine();

                System.out.println("Nhập giới tính nhân viên:");
                String gender = input.nextLine();

                System.out.println("Nhập trình độ nhân viên: ");
                String level = input.nextLine();

                System.out.println("Nhập lương nhân viên:");
                int salary = Integer.parseInt(input.nextLine());


                System.out.println("Nhập chức vụ nhân viên: ");
                String staffPosition = input.nextLine();
                employeeList.add(new Employee(id, age, name, phoneNumber, idCardNumber, email, gender, level, salary, staffPosition));
                System.out.println("Thông tin của nhân viên đã được sửa đổi. ");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có nhân viên tên như vậy.");
        }
    }

    @Override
    public void delete() {

    }
}
