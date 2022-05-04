package _case_study.service.impl;

import _case_study.model.booking_contract.Booking;
import _case_study.model.facility.Facility;
import _case_study.model.facility.Villa;
import _case_study.model.person.Customer;
import _case_study.service.BookingService;
import _case_study.ultis.BookingComparator;
import _case_study.ultis.ReadAndWrite;
import _case_study.ultis.ReadAnhWriteBooking;

import java.util.*;


public class BookingServiceImpl implements BookingService {

    public static Scanner scanner = new Scanner(System.in);
    public static Set<Booking> bookingSet = getBooking();

    public static final String FILE_BOOKING = "src\\_case_study\\data\\booking.csv";

    public static final String FILE_CUSTOMER = "src\\_case_study\\data\\customer.csv";

    public static final String FILE_FACILITY = "src\\_case_study\\data\\facility\\facility.csv";

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void displayListBooking() {
        bookingSet = getBooking();

        for (Booking item : bookingSet) {
            System.out.println(item.toString());
        }
    }

    public static  Set<Booking> getBooking() {
        Set<Booking> bookings = new TreeSet<>(new BookingComparator());
        List<String[]> list = ReadAndWrite.readFile(FILE_BOOKING);

        for (String[] item : list) {
            bookings.add(new Booking(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5]));
        }
        return bookings;
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        String customer = chooseCustomer();
        String idFacility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày kết thúc thuê");
        String endDate = scanner.nextLine();
        System.out.println("Nhập kiểu dịch vụ");
        String typeOfService = scanner.nextLine();

        String line = id + "," + startDate + "," + endDate + "," + customer + "," + idFacility + "," + typeOfService;

        ReadAnhWriteBooking.writeFile(FILE_BOOKING, line);

        System.out.println("Đã booking thành công");
    }

    public static String chooseCustomer() {

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        List<Customer> customers = CustomerServiceImpl.getCustomerList();

        customerService.display();

        while (true) {
            boolean flag = true;
            System.out.println("Nhập id khác hàng");
            String id = scanner.nextLine();
            for (Customer item : customers) {
                if (item.getId().equals(id)) {
                    return id;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại id khách");
            }
        }
    }

    public static String chooseFacility() {

        System.out.println("Danh sách dịch vụ");

        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.display();

        Map<Facility, Integer> integerMap = facilityService.getFacilityIntegerMap();
        System.out.println("Nhập id dịch vụ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> item : integerMap.entrySet()) {
                if (id.equals(item.getKey().getId())) {
                    item.setValue(item.getValue() + 1);
                    return id;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại id dịch vụ");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
