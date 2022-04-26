package _case_study.service.impl;

import _case_study.model.facility.Facility;
import _case_study.model.facility.House;
import _case_study.model.facility.Room;
import _case_study.model.facility.Villa;
import _case_study.service.FacilityService;
import _case_study.ultis.RegexData;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.xml.bind.SchemaOutputResolver;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    public static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    public static final String ID_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String NAME_SERVICE = "^[A-Z][a-zA-Z]{1,10}$";
    public static final String RENT_TYPE = "^Year|Month|Day|Hour$";
    public static final String ROOM_STANDARD = "^Vip|Normal|Double|Single$";


    //    public static final String USE_AREA = "^[3-9]\\d|[1-9]\\d{2,}$";
//    public static final String PRICE_REGEX = "^[1-9]|[0-9]{2,}$";
//    public static final String AMOUNT_PEOPLE = "^[1-9]|1[0-9]$";
//    public static final int FLOOR = "^[1-9]$";

    static {
        Villa villa = new Villa("1", "Villa", 100, 30000,
                12, "theo ngày", "thường", 30, 3);
        facilityIntegerMap.put(villa, 0);

        House house = new House("2", "House", 70, 20000,
                7, "Theo ngày", "Thường", 2);
        facilityIntegerMap.put(house, 0);

        Room room = new Room("3", "Room", 30, 5000,
                2, "Theo giờ", "Nước uống");
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

        String id = inputIdVilla();

        System.out.println("Danh sách các dịch vụ:");

        System.out.println("1. Laundry");
        System.out.println("2. Breakfast");
        System.out.println("3. Cleaning");
        System.out.println("4. Spa");

        String nameService = inputNameService();

        System.out.println("Diện tích dịch vụ");
        double usableArea;
        while (true) {
            try {
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Diện tích dịch vụ phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }


        System.out.println("Tiền thuê");
        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("Số tiền thuê phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Số lượng người");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                } else {
                    System.out.println("Số người phải lớn hơn 0 và bé hơn 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Gồm có 4 option:");

        System.out.println("1. Year");
        System.out.println("2. Month");
        System.out.println("3. Day");
        System.out.println("4. Hour");
        String typeRent = inputRentType();

//        System.out.println("1. Thuê theo năm:");
//        System.out.println("2. Thuê theo tháng:");
//        System.out.println("3. Thuê theo ngày:");
//        System.out.println("4. Thuê theo giờ:");
//
//        boolean check = true;
//        int choose = Integer.parseInt(scanner.nextLine());
//
//        while (check) {
//            switch (choose) {
//                case 1:
//                    typeRent += "Theo năm.";
//                    check = false;
//                    break;
//                case 2:
//                    typeRent += "Theo tháng.";
//                    check = false;
//                    break;
//                case 3:
//                    typeRent += "Theo ngày.";
//                    check = false;
//                    break;
//                case 4:
//                    typeRent += "Theo giờ.";
//                    check = false;
//                    break;
//            }
//        }

        System.out.println("Gồm 4 tiêu chuẩn phòng");

        System.out.println("1. Vip");
        System.out.println("2. Normal");
        System.out.println("3. Double");
        System.out.println("4. Single");
        String roomStandard = inputRoomStandard();


        System.out.println("Diện tích hồ bơi");
        double poolArea;
        while (true) {
            try {
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea > 30) {
                    break;
                } else {
                    System.out.println("Diện tích bể bơi phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Số tầng");
        int floor;

        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("Số tầng phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        Villa villa = new Villa(id, nameService, usableArea, rentCost,
                maximumPeople, typeRent, roomStandard, poolArea, floor);

        facilityIntegerMap.put(villa, 0);

        System.out.println("Đã thêm mới thành công.");
        System.out.println("------------------------------");

    }


    @Override
    public void addNewHouse() {
        System.out.println("House");

        System.out.println("----------------------------------");

        String id = inputIdHouse();

        String nameService = inputNameService();

        System.out.println("Diện tích sử dụng:");
        double usableArea;
        while (true) {
            try {
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Diện tích phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Tiền thuê");
        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("Số tiền thuê phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("Số lượng người tối đa");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                } else {
                    System.out.println("Số người lớn hơn 0 và bé hơn 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("Gồm có 4 kiểu thuê");

        System.out.println("1. Year");
        System.out.println("2. Month");
        System.out.println("3. Day");
        System.out.println("4. Hour");

        String typeRent = inputRentType();

//        boolean check = false;
//        String choose;
//        do {
//        System.out.println("1. Thuê theo năm:");
//        System.out.println("2. Thuê theo tháng:");
//        System.out.println("3. Thuê theo ngày:");
//        System.out.println("4. Thuê theo giờ:");
//             check = true;
//             choose = scanner.nextLine();
//            switch (choose) {
//                case "1":
//                    typeRent += "Theo năm.";
//                    check = false;
//                    break;
//                case "2":
//                    typeRent += "Theo tháng.";
//                    check = false;
//                    break;
//                case "3":
//                    typeRent += "Theo ngày.";
//                    check = false;
//                    break;
//                case "4":
//                    typeRent += "Theo giờ.";
//                    check = false;
//                    break;
//                default:
//                    System.out.println("wrong choice !");
//            }
//        }while (check);
        System.out.println("Gồm 4 tiêu chuẩn phòng");

        System.out.println("1. Vip");
        System.out.println("2. Normal");
        System.out.println("3. Double");
        System.out.println("4. Single");

        String roomStandard = inputRoomStandard();

        System.out.println("Số tầng");
        int floor;
        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("Số tầng phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        House house = new House(id, nameService, usableArea, rentCost,
                maximumPeople, typeRent, roomStandard, floor);

        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm thành công.");
        System.out.println("------------------------------");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Room");

        System.out.println("----------------------------------");

        String id = inputIdRoom();

        String nameService = inputNameService();

        System.out.println("Diện tích sử dụng:");
        double usableArea;
        while (true) {
            try {
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Diện tích phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Tiền thuê");

        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("Số tiền phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Số lượng người");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                } else {
                    System.out.println("Số người phải lớn hơn 0 và bé hơn 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        String typeRent = inputRentType();

//        System.out.println("1. Thuê theo năm:");
//        System.out.println("2. Thuê theo tháng:");
//        System.out.println("3. Thuê theo ngày:");
//        System.out.println("4. Thuê theo giờ:");
//
//        boolean check = true;
//        int choose = Integer.parseInt(scanner.nextLine());
//
//        while (check) {
//            switch (choose) {
//                case 1:
//                    typeRent += "Theo năm.";
//                    check = false;
//                    break;
//                case 2:
//                    typeRent += "Theo tháng.";
//                    check = false;
//                    break;
//                case 3:
//                    typeRent += "Theo ngày.";
//                    check = false;
//                    break;
//                case 4:
//                    typeRent += "Theo giờ.";
//                    check = false;
//                    break;
//            }
//        }

        System.out.println("Các Dịch vụ miễn phí:");
        String freeService = scanner.nextLine();

        Room room = new Room(id, nameService, usableArea, rentCost,
                maximumPeople, typeRent, freeService);

        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm thành công.");
        System.out.println("------------------------------");
    }

    private String inputIdVilla() {
        System.out.println("Nhập id villa");
        return RegexData.regexString(scanner.nextLine(), ID_VILLA,
                "Bạn đã nhập sai định dạng, định dạng đúng là SVVL-XXXX(với XXXX là 4 số bất kì)");
    }

    private String inputIdHouse() {
        System.out.println("Nhập id house");
        return RegexData.regexString(scanner.nextLine(), ID_HOUSE,
                "Bạn đã nhập sai định dạng, định dạng đúng là SVHO-XXXX(với XXXX là 4 số bất kì)");
    }

    private String inputIdRoom() {
        System.out.println("Nhập id room");
        return RegexData.regexString(scanner.nextLine(), ID_ROOM,
                "Bạn đã nhập sai định dạng, định dạng đúng là SVRO-XXXX(với XXXX là 4 số bất kì)");
    }

    private String inputNameService() {
        System.out.println("Nhập tên dịch vụ");
        return RegexData.regexString(scanner.nextLine(), NAME_SERVICE,
                "Bạn nhập sai rồi, chữ cái đầu tiên của tên dịch vụ phải viết hoa.");
    }

    private String inputRentType() {
        System.out.println("Kiểu thuê");
        return RegexData.regexString(scanner.nextLine(), RENT_TYPE, "Có 4 kiểu thuê gồm: 1. Year,2. Month,3. Day,4. Hour");
    }

    private String inputRoomStandard() {
        System.out.println("Tiêu chuẩn phòng");
        return RegexData.regexString(scanner.nextLine(), ROOM_STANDARD, "Có 4 kiểu thuê gồm: 1. Vip,2. Normal,3. Double,4. Single");
    }


//    private String inputPriceRegex() {
//        System.out.println("Nhập tiền thuê dịch vụ");
//        return RegexData.regexString(scanner.nextLine(), PRICE_REGEX,
//                "Phải là số dương và lớn hơn 0, chứ bằng 0 thì là free à");
//    }
//
//    private String inputAmountPeople() {
//        System.out.println("Nhập số lượng người tối đa");
//        return RegexData.regexString(scanner.nextLine(), AMOUNT_PEOPLE, "Phải là số nguyên dương và lớn hơn 0");
//    }
//
//    private String inputFloor() {
//        System.out.println("Nhập số lượng tầng");
//        return RegexData.regexString(scanner.nextLine(), FLOOR, "Phải là số nguyên dương, lớn hơn 0 và bé hơn 10");
//    }
}
