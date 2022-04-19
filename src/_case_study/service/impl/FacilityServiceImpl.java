package _case_study.service.impl;

import _case_study.model.facility.Facility;
import _case_study.model.facility.House;
import _case_study.model.facility.Room;
import _case_study.model.facility.Villa;
import _case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        Villa villa = new Villa("Villa", 100, 30000,
                12, "theo ngày", "thường", 30, 3);
        facilityIntegerMap.put(villa, 0);

        House house = new House("House", 70, 20000,
                7, "Theo ngày", "Thường", 2);
        facilityIntegerMap.put(house, 0);

        Room room = new Room("Room", 30, 5000,
                2, "Theo giờ","Nước uống");
        facilityIntegerMap.put(room, 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + map.getKey() + " Số lần đã thuê: " + map.getValue());
        }
    }

    @Override
    public void displayMaintain() {
        
    }

    @Override
    public void addNewVilla() {
        System.out.println("Villa");

        System.out.println("----------------------------------");
        System.out.println("Tên dịch vụ:");
        String nameService = scanner.nextLine();

        System.out.println("Diện tích sử dụng:");
        double usableArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Chi phí thuê:");
        int rentCost = Integer.parseInt(scanner.nextLine());

        System.out.println("Số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê: ");
        String typeRent = "";

        System.out.println("1. Thuê theo năm:");
        System.out.println("2. Thuê theo tháng:");
        System.out.println("3. Thuê theo ngày:");
        System.out.println("4. Thuê theo giờ:");

        boolean check = true;
        int choose = Integer.parseInt(scanner.nextLine());

        while (check) {
            switch (choose) {
                case 1:
                    typeRent += "Theo năm.";
                    check = false;
                    break;
                case 2:
                    typeRent += "Theo tháng.";
                    check = false;
                    break;
                case 3:
                    typeRent += "Theo ngày.";
                    check = false;
                    break;
                case 4:
                    typeRent += "Theo giờ.";
                    check = false;
                    break;
            }
        }

        System.out.println("Tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();

        System.out.println("Diện tích hồ bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(nameService, usableArea, rentCost,
                maximumPeople, typeRent, roomStandard, poolArea, floor);

        facilityIntegerMap.put(villa, 0);

        System.out.println("Đã thêm mới thành công.");
        System.out.println("------------------------------");

    }

    @Override
    public void addNewHouse() {
        System.out.println("House");

        System.out.println("----------------------------------");
        System.out.println("Tên dịch vụ:");
        String nameService = scanner.nextLine();

        System.out.println("Diện tích sử dụng:");
        double usableArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Chi phí thuê:");
        int rentCost = Integer.parseInt(scanner.nextLine());

        System.out.println("Số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê: ");
        String typeRent = "";

        System.out.println("1. Thuê theo năm:");
        System.out.println("2. Thuê theo tháng:");
        System.out.println("3. Thuê theo ngày:");
        System.out.println("4. Thuê theo giờ:");

        boolean check = true;
        int choose = Integer.parseInt(scanner.nextLine());

        while (check) {
            switch (choose) {
                case 1:
                    typeRent += "Theo năm.";
                    check = false;
                    break;
                case 2:
                    typeRent += "Theo tháng.";
                    check = false;
                    break;
                case 3:
                    typeRent += "Theo ngày.";
                    check = false;
                    break;
                case 4:
                    typeRent += "Theo giờ.";
                    check = false;
                    break;
            }
        }
        System.out.println("Tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();

        System.out.println("Số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(nameService, usableArea, rentCost,
                maximumPeople, typeRent, roomStandard, floor);

        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm thành công.");
        System.out.println("------------------------------");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Room");

        System.out.println("----------------------------------");
        System.out.println("Tên dịch vụ:");
        String nameService = scanner.nextLine();

        System.out.println("Diện tích sử dụng:");
        double usableArea = Double.parseDouble(scanner.nextLine());

        System.out.println("Chi phí thuê:");
        int rentCost = Integer.parseInt(scanner.nextLine());

        System.out.println("Số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê: ");
        String typeRent = "";

        System.out.println("1. Thuê theo năm:");
        System.out.println("2. Thuê theo tháng:");
        System.out.println("3. Thuê theo ngày:");
        System.out.println("4. Thuê theo giờ:");

        boolean check = true;
        int choose = Integer.parseInt(scanner.nextLine());

        while (check) {
            switch (choose) {
                case 1:
                    typeRent += "Theo năm.";
                    check = false;
                    break;
                case 2:
                    typeRent += "Theo tháng.";
                    check = false;
                    break;
                case 3:
                    typeRent += "Theo ngày.";
                    check = false;
                    break;
                case 4:
                    typeRent += "Theo giờ.";
                    check = false;
                    break;
            }
        }
        System.out.println("Các Dịch vụ miễn phí:");
        String freeService = scanner.nextLine();

        Room room = new Room(nameService, usableArea, rentCost,
                maximumPeople, typeRent, freeService);

        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm thành công.");
        System.out.println("------------------------------");
    }
}
