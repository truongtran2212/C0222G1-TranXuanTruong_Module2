package _case_study.service.impl;

import _case_study.model.person.Customer;
import _case_study.model.person.Employee;
import _case_study.service.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id khách hàng:");
        int id = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tuổi khách hàng:");
        int age = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tên khách hàng:");
        String name = input.nextLine();

        System.out.println("Nhập số điện thoại khách hàng:");
        String phoneNumber = input.nextLine();

        System.out.println("Nhập chứng minh nhân dân khách hàng:");
        String idCardNumber = input.nextLine();

        System.out.println("Nhập email khách hàng:");
        String email = input.nextLine();

        System.out.println("Nhập giới tính khách hàng:");
        String gender = input.nextLine();

        System.out.println("Nhập địa chỉ khách hàng:");
        String address = input.nextLine();

        System.out.println("Nhập loại khách hàng: ");
        String typeOfCustomer = input.nextLine();

        Customer customer = new Customer(id, age, name, phoneNumber, idCardNumber, email, gender, address, typeOfCustomer);
        customerList.add(customer);

        System.out.println("Đã thêm mới thành công.");
    }

    @Override
    public void edit() {

        display();

        System.out.println("Tìm kiếm khách hàng thông qua tên:");
        System.out.println("------------------------------");

        System.out.println("Nhập tên khách hàng:");
        String name = input.nextLine();


        // Làm sao để chỉ cần nhập name là đã so sánh đc. không cần phải nhập lại hết.
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                customerList.remove(i);

                System.out.println("Ở resort có khách hàng này: ");
                System.out.println("Bắt đầu chỉnh sửa thông tin: ");

                System.out.println("---------------------");

                System.out.println("Nhập id khách hàng:");
                int id = Integer.parseInt(input.nextLine());

                System.out.println("Nhập tuổi khách hàng:");
                int age = Integer.parseInt(input.nextLine());

                System.out.println("Nhập số điện thoại khách hàng:");
                String phoneNumber = input.nextLine();

                System.out.println("Nhập chứng minh nhân dân khách hàng:");
                String idCardNumber = input.nextLine();

                System.out.println("Nhập email khách hàng:");
                String email = input.nextLine();

                System.out.println("Nhập giới tính khách hàng:");
                String gender = input.nextLine();

                System.out.println("Nhập địa chỉ khách hàng:");
                String address = input.nextLine();

                System.out.println("Nhập loại khách hàng: ");
                String typeOfCustomer = input.nextLine();

                customerList.add(new Customer(id, age, name, phoneNumber, idCardNumber, email, gender, address, typeOfCustomer));
                System.out.println("Thông tin của khách hàng đã được sửa đổi. ");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có khách hàng tên như vậy.");
        }
    }

    @Override
    public void delete() {

    }
}
