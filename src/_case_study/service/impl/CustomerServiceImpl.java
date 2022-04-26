package _case_study.service.impl;

import _case_study.model.person.Customer;

import _case_study.service.CustomerService;
import _case_study.ultis.RegexData;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    static Scanner input = new Scanner(System.in);
    static final String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    static {
        customerList.add(new Customer("1", "20", "Trường", "093x888888",
                "11111111", "truongtran2212", "nam", "12 Trần Phú", "Diamond"));
        customerList.add(new Customer("2", "25", "Trung", "093x999999",
                "22222222", "trungngo123", "nam", "12 Thanh Thủy", "Gold"));
        customerList.add(new Customer("3", "30", "Chung", "093x666666",
                "33333333", "chungtran321", "nam", "12 Lê Duẩn", "Silver"));

    }

    // Hiển thị thông tin khách hàng
    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override

    // Thêm mới khách hàng
    public void addNew() {
        System.out.println("Nhập id khách hàng:");
        String id = input.nextLine();

        boolean flag = true;
        for (Customer value : customerList) {
            if (value.getId().equals(id)) {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Đã có khách hàng sử dụng id này");

        } else {

            System.out.println("Ở resort chưa có khách hàng sử dụng id này: ");
            System.out.println("Bắt đầu thêm khách hàng mới: ");

            System.out.println("--------------------------");

            System.out.println("Nhập ngày tháng năm sinh của khách hàng:");
            String dayOfBirth = RegexData.regexAge(input.nextLine(),DATE_OF_BIRTH);

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

            String typeOfCustomer = "";

            System.out.println("1. Diamond");
            System.out.println("2. Platinum");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");

            int choose = Integer.parseInt(input.nextLine());
            boolean check = true;

            while (check) {
                switch (choose) {
                    case 1:
                        typeOfCustomer += "Diamond";
                        check = false;
                        break;
                    case 2:
                        typeOfCustomer += "Platinum";
                        check = false;
                        break;
                    case 3:
                        typeOfCustomer += "Gold";
                        check = false;
                        break;
                    case 4:
                        typeOfCustomer += "Silver";
                        check = false;
                        break;
                    case 5:
                        typeOfCustomer += "Member";
                        check = false;
                        break;
                }
            }

            Customer customer = new Customer(id, dayOfBirth, name, phoneNumber, idCardNumber, email, gender, address, typeOfCustomer);
            customerList.add(customer);
            System.out.println("Đã thêm mới thành công.");
        }
    }

    @Override
    public void edit() {

        display();

        System.out.println("Tìm kiếm khách hàng thông qua id:");
        System.out.println("------------------------------");


        System.out.println("Nhập id khách hàng:");
        String id = input.nextLine();

        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                customerList.remove(i);

                System.out.println("Ở resort có khách hàng sử dụng id này: ");
                System.out.println("Bắt đầu chỉnh sửa thông tin: ");

                System.out.println("---------------------");

                System.out.println("Nhập ngày tháng năm sinh của khách hàng:");
                String dayOfBirth = input.nextLine();

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


                String typeOfCustomer = "";

                System.out.println("1. Diamond");
                System.out.println("2. Platinum");
                System.out.println("3. Gold");
                System.out.println("4. Silver");
                System.out.println("5. Member");

                int choose = Integer.parseInt(input.nextLine());
                boolean check = true;
                while (check) {
                    switch (choose) {
                        case 1:
                            typeOfCustomer += "Diamond";
                            check = false;
                            break;
                        case 2:
                            typeOfCustomer += "Platinum";
                            check = false;
                            break;
                        case 3:
                            typeOfCustomer += "Gold";
                            check = false;
                            break;
                        case 4:
                            typeOfCustomer += "Silver";
                            check = false;
                            break;
                        case 5:
                            typeOfCustomer += "Member";
                            check = false;
                            break;
                    }
                }

                customerList.add(new Customer(id, dayOfBirth, name, phoneNumber,
                        idCardNumber, email, gender, address, typeOfCustomer));
                System.out.println("Thông tin của khách hàng đã được sửa đổi. ");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có khách hàng nào sử dụng id này");
        }
        System.out.println("-------------------------");
    }

    @Override
    public void delete() {

    }
}
