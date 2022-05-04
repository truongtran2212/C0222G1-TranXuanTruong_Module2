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
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static List<Customer> customerList = new ArrayList<>();
    private static List<String[]> list = new ArrayList<>();
    static Set<String[]> stringSet = new LinkedHashSet<>();

    public static final String FILE_BOOKING = "src\\_case_study\\data\\booking.csv";

    public static final String FILE_CUSTOMER = "src\\_case_study\\data\\customer.csv";

    public static final String FILE_FACILITY = "src\\_case_study\\data\\facility\\facility.csv";

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void displayListBooking() {

        stringSet = ReadAnhWriteBooking.readFile(FILE_BOOKING);

        for (Booking item : bookingSet) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addBooking() {
        stringSet = ReadAnhWriteBooking.readFile(FILE_BOOKING);
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày kết thúc thuê");
        String endDate = scanner.nextLine();
        System.out.println("Nhập kiểu dịch vụ");
        String typeOfService = scanner.nextLine();

        Booking booking = new Booking(id, startDate, endDate, customer, facility, typeOfService);

        bookingSet.add(booking);

        String line = id + "," + startDate + "," + endDate + "," + customer + "," + facility + "," + typeOfService;

        ReadAnhWriteBooking.writeFile(FILE_BOOKING, line);

        System.out.println("Đã booking thành công");
    }
    public static Customer chooseCustomer() {

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        List<Customer> customers = CustomerServiceImpl.getCustomerList();

        customerService.display();

        while (true) {
            boolean flag = true;
            System.out.println("Nhập id khác hàng");
            String id = scanner.nextLine();
            for (Customer item : customers) {
                if (item.getId().equals(id)) {
                    return item;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại id khách");
            }
        }
    }

    public static Facility chooseFacility() {

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
                    return item.getKey();
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
