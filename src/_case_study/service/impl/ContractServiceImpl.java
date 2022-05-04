package _case_study.service.impl;

import _case_study.model.booking_contract.Booking;
import _case_study.model.booking_contract.Contract;
import _case_study.model.person.Customer;
import _case_study.service.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();

        for (Booking item : bookingSet) {
            bookingQueue.add(item);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getIdCustomer();
            System.out.println("Đang tạo hợp đồng cho Booking có thông tin " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin " + customer.toString());

            System.out.println("Nhập id hơp đồng");
            String idContract = scanner.nextLine();
            System.out.println("Nhập số tiền trả trước");
            int preMoney = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tổng số tiền phải trả");
            int totalMoney = Integer.parseInt(scanner.nextLine());

            Contract contract = new Contract(idContract, booking, preMoney, totalMoney, customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công " + contract.toString());
            System.out.println("---------------------");
        }
    }

    @Override
    public void displayListContract() {
        for (Contract item: contractList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
