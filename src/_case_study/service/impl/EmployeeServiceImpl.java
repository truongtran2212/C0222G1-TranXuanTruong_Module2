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

        String level = "";

        // Xét trình độ

        System.out.println("1. Trung cấp");
        System.out.println("2. Cao đẳng ");
        System.out.println("3. Đại học");
        System.out.println("4. Sau đại học");


        int choose = Integer.parseInt(input.nextLine());
        boolean check = true;

        while (check) {
            switch (choose) {
                case 1:
                    level += "Trung cấp";
                    check = false;
                    break;
                case 2:
                    level += "Cao đẳng";
                    check = false;
                    break;
                case 3:
                    level += "Đại học";
                    check = false;
                    break;
                case 4:
                    level += "Sau đại học";
                    check = false;
                    break;
            }
        }

        System.out.println("Nhập lương nhân viên:");
        int salary = Integer.parseInt(input.nextLine());


        System.out.println("Nhập chức vụ nhân viên: ");
        String staffPosition = "";

        System.out.println("1. Lễ tân");
        System.out.println("2. Phục vụ");
        System.out.println("3. Chuyên viên");
        System.out.println("4. Giám sát");
        System.out.println("5. Quản lý");
        System.out.println("6. Giám đốc");

        // Xét chức vụ

        int choose1 = Integer.parseInt(input.nextLine());
        boolean checkPosition = true;

        while (checkPosition) {
            switch (choose1) {
                case 1:
                    staffPosition += "Lễ tân";
                    checkPosition = false;
                    break;
                case 2:
                    staffPosition += "Phục vụ";
                    checkPosition = false;
                    break;
                case 3:
                    staffPosition += "Chuyên viên";
                    checkPosition = false;
                    break;
                case 4:
                    staffPosition += "Giám sát";
                    checkPosition = false;
                    break;
                case 5:
                    staffPosition += "Quản lý";
                    checkPosition = false;
                    break;
                case 6:
                    staffPosition += "Giám đốc";
                    checkPosition = false;
                    break;
            }
        }

        Employee employee = new Employee(id, age, name, phoneNumber, idCardNumber, email, gender, level, salary, staffPosition);

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
                String level = "";

                // Xét trình độ của nhân viên
                System.out.println("1. Trung cấp");
                System.out.println("2. Cao đẳng ");
                System.out.println("3. Đại học");
                System.out.println("4. Sau đại học");

                int choose = Integer.parseInt(input.nextLine());
                boolean check = true;

                while (check) {
                    switch (choose) {
                        case 1:
                            level += "Trung cấp";
                            check = false;
                            break;
                        case 2:
                            level += "Cao đẳng";
                            check = false;
                            break;
                        case 3:
                            level += "Đại học";
                            check = false;
                            break;
                        case 4:
                            level += "Sau đại học";
                            check = false;
                            break;
                    }
                }


                System.out.println("Nhập lương nhân viên:");
                int salary = Integer.parseInt(input.nextLine());


                System.out.println("Nhập chức vụ nhân viên: ");

                String staffPosition = "";
                // Xét chức vụ của nhân viên

                System.out.println("1. Lễ tân");
                System.out.println("2. Phục vụ");
                System.out.println("3. Chuyên viên");
                System.out.println("4. Giám sát");
                System.out.println("5. Quản lý");
                System.out.println("6. Giám đốc");

                int choose1 = Integer.parseInt(input.nextLine());
                boolean checkPosition = true;

                while (checkPosition) {
                    switch (choose1) {
                        case 1:
                            staffPosition += "Lễ tân";
                            checkPosition = false;
                            break;
                        case 2:
                            staffPosition += "Phục vụ";
                            checkPosition = false;
                            break;
                        case 3:
                            staffPosition += "Chuyên viên";
                            checkPosition = false;
                            break;
                        case 4:
                            staffPosition += "Giám sát";
                            checkPosition = false;
                            break;
                        case 5:
                            staffPosition += "Quản lý";
                            checkPosition = false;
                            break;
                        case 6:
                            staffPosition += "Giám đốc";
                            checkPosition = false;
                            break;
                    }
                }

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
