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
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tên:");
        String name = input.nextLine();

        System.out.println("Nhập số điện thoại:");
        int phoneNumber = Integer.parseInt(input.nextLine());

        System.out.println("Nhập chứng minh nhân dân:");
        int idCardNumber = Integer.parseInt(input.nextLine());

        System.out.println("Nhập email:");
        String email = input.nextLine();

        System.out.println("Nhập giới tính:");
        String gender = input.nextLine();

        System.out.println("Nhập trình độ:");
        String level = input.nextLine();

        System.out.println("Nhập lương:");
        int salary = Integer.parseInt(input.nextLine());

        System.out.println("Nhập chức vụ: ");
        String staffPosition = input.nextLine();

        // Tạo 1 đối tượng
        Employee employee = new Employee(id,age,name,phoneNumber,idCardNumber,email,gender,level,salary,staffPosition);

        // thệm vào đối tượng của arrayList
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
