package _case_study.service.impl;

import _case_study.model.facility.Facility;
import _case_study.model.facility.House;
import _case_study.model.facility.Room;
import _case_study.model.facility.Villa;
import _case_study.service.FacilityService;

import _case_study.ultis.ReadAndWrite;
import _case_study.ultis.RegexData;
import _case_study.ultis.RegexFacility;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);


    public static final String FILE_VILLA = "src\\_case_study\\data\\facility\\villa.csv";
    public static final String FILE_HOUSE = "src\\_case_study\\data\\facility\\house.csv";
    public static final String FILE_ROOM = "src\\_case_study\\data\\facility\\room.csv";

    public static final String FILE_FACILITY = "src\\_case_study\\data\\facility\\facility.csv";

    public static final String COMMA = ",";

    public static List<String[]> villaList = new ArrayList<>();
    public static List<String[]> houseList = new ArrayList<>();
    public static List<String[]> roomList = new ArrayList<>();
    public static List<String[]> facilityList = new ArrayList<>();

    public static RegexFacility regexFacility = new RegexFacility();

    public Map<Facility, Integer> getFacilityIntegerMap(){
        return facilityIntegerMap;
    }

    @Override
    public void display() {

        facilityList = ReadAndWrite.readFile(FILE_FACILITY);
        facilityIntegerMap.clear();

        Villa villa;
        House house;
        Room room;

        for (String[] item : facilityList) {
            if (item[0].contains("SVVL")) {
                villa = new Villa(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                        item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
                facilityIntegerMap.put(villa, Integer.parseInt(item[9]));
            } else if (item[0].contains("SVHO")) {
                house = new House(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                        item[5], item[6], Integer.parseInt(item[7]));
                facilityIntegerMap.put(house, Integer.parseInt(item[8]));
            } else {
                room = new Room(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
                        item[5], item[6]);
                facilityIntegerMap.put(room, Integer.parseInt(item[7]));
            }
        }
        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            System.out.println(item.getKey() + " So lan thue: " + item.getValue());
        }
    }

//        Villa villa;
//        for (String[] item : villaList) {
//
//            villa = new Villa(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]),
//                    item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
//            facilityIntegerMap.put(villa, Integer.parseInt(item[9]));
//        }
//
//        House house;
//
//        for (String[] temp : houseList) {
//            house = new House(temp[0], temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]),
//                    temp[5], temp[6], Integer.parseInt(temp[7]));
//            facilityIntegerMap.put(house, Integer.parseInt(temp[8]));
//        }
//
//
//        Room room;
//        for (String[] str : roomList) {
//            room = new Room(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]),
//                    str[5], str[6]);
//            facilityIntegerMap.put(room, Integer.parseInt(str[7]));
//        }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {

        facilityList = ReadAndWrite.readFile(FILE_FACILITY);
        System.out.println("Villa");

        System.out.println("--------------------------------");

        String id = regexFacility.inputIdVilla();

        String nameService = regexFacility.inputNameService();

        System.out.println("Di???n t??ch d???ch v???");
        double usableArea;
        while (true) {
            try {
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Di???n t??ch d???ch v??? ph???i l???n h??n 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("Ti???n thu??");
        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("S??? ti???n thu?? ph???i l???n h??n 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("S??? l?????ng ng?????i");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                } else {
                    System.out.println("S??? ng?????i ph???i l???n h??n 0 v?? b?? h??n 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("G???m c?? 4 option:");

        System.out.println("1. Year");
        System.out.println("2. Month");
        System.out.println("3. Day");
        System.out.println("4. Hour");
        String typeRent = regexFacility.inputRentType();

//        System.out.println("1. Thu?? theo n??m:");
//        System.out.println("2. Thu?? theo th??ng:");
//        System.out.println("3. Thu?? theo ng??y:");
//        System.out.println("4. Thu?? theo gi???:");
//
//        boolean check = true;
//        int choose = Integer.parseInt(scanner.nextLine());
//
//        while (check) {
//            switch (choose) {
//                case 1:
//                    typeRent += "Theo n??m.";
//                    check = false;
//                    break;
//                case 2:
//                    typeRent += "Theo th??ng.";
//                    check = false;
//                    break;
//                case 3:
//                    typeRent += "Theo ng??y.";
//                    check = false;
//                    break;
//                case 4:
//                    typeRent += "Theo gi???.";
//                    check = false;
//                    break;
//            }
//        }
        System.out.println("G???m 4 ti??u chu???n ph??ng");

        System.out.println("1. Vip");
        System.out.println("2. Normal");
        System.out.println("3. Double");
        System.out.println("4. Single");
        String roomStandard = regexFacility.inputRoomStandard();

        System.out.println("Di???n t??ch h??? b??i");
        double poolArea;
        while (true) {
            try {
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea > 30) {
                    break;
                } else {
                    System.out.println("Di???n t??ch b??? b??i ph???i l???n h??n 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        System.out.println("S??? t???ng");
        int floor;

        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("S??? t???ng ph???i l???n h??n 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        Villa villa = new Villa(id, nameService, usableArea, rentCost,
                maximumPeople, typeRent, roomStandard, poolArea, floor);

        facilityIntegerMap.put(villa, 0);

        ReadAndWrite.writeFile(FILE_FACILITY, villa.getLine() + ",0");

        System.out.println("???? th??m m???i th??nh c??ng.");
        System.out.println("--------------------------");
    }

    @Override
    public void addNewHouse() {

        facilityList = ReadAndWrite.readFile(FILE_FACILITY);
        System.out.println("House");

        System.out.println("------------------------------");

        String id = regexFacility.inputIdHouse();

        String nameService = regexFacility.inputNameService();

        System.out.println("Di???n t??ch s??? d???ng:");
        double usableArea;
        while (true) {
            try {
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Di???n t??ch ph???i l???n h??n 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("Ti???n thu??");
        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("S??? ti???n thu?? ph???i l???n h??n 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("S??? l?????ng ng?????i t???i ??a");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                } else {
                    System.out.println("S??? ng?????i l???n h??n 0 v?? b?? h??n 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("G???m c?? 4 ki???u thu??");

        System.out.println("1. Year");
        System.out.println("2. Month");
        System.out.println("3. Day");
        System.out.println("4. Hour");

        String typeRent = regexFacility.inputRentType();

//        boolean check = false;
//        String choose;
//        do {
//        System.out.println("1. Thu?? theo n??m:");
//        System.out.println("2. Thu?? theo th??ng:");
//        System.out.println("3. Thu?? theo ng??y:");
//        System.out.println("4. Thu?? theo gi???:");
//             check = true;
//             choose = scanner.nextLine();
//            switch (choose) {
//                case "1":
//                    typeRent += "Theo n??m.";
//                    check = false;
//                    break;
//                case "2":
//                    typeRent += "Theo th??ng.";
//                    check = false;
//                    break;
//                case "3":
//                    typeRent += "Theo ng??y.";
//                    check = false;
//                    break;
//                case "4":
//                    typeRent += "Theo gi???.";
//                    check = false;
//                    break;
//                default:
//                    System.out.println("wrong choice !");
//            }
//        }while (check);
        System.out.println("G???m 4 ti??u chu???n ph??ng");

        System.out.println("1. Vip");
        System.out.println("2. Normal");
        System.out.println("3. Double");
        System.out.println("4. Single");

        String roomStandard = regexFacility.inputRoomStandard();

        System.out.println("S??? t???ng");
        int floor;
        while (true) {
            try {
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("S??? t???ng ph???i l???n h??n 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        House house = new House(id, nameService, usableArea, rentCost,
                maximumPeople, typeRent, roomStandard, floor);

        facilityIntegerMap.put(house, 0);

        ReadAndWrite.writeFile(FILE_FACILITY, house.getLine() + ",0");

        System.out.println("???? th??m th??nh c??ng.");
        System.out.println("------------------------------");
    }

    @Override
    public void addNewRoom() {

        facilityList = ReadAndWrite.readFile(FILE_FACILITY);

        System.out.println("Room");

        System.out.println("----------------------------------");

        String id = regexFacility.inputIdRoom();

        String nameService = regexFacility.inputNameService();

        System.out.println("Di???n t??ch s??? d???ng:");
        double usableArea;
        while (true) {
            try {
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea > 30) {
                    break;
                } else {
                    System.out.println("Di???n t??ch ph???i l???n h??n 30");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("Ti???n thu??");

        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("S??? ti???n ph???i l???n h??n 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }
        System.out.println("S??? l?????ng ng?????i");
        int maximumPeople;
        while (true) {
            try {
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople > 0 && maximumPeople < 20) {
                    break;
                } else {
                    System.out.println("S??? ng?????i ph???i l???n h??n 0 v?? b?? h??n 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format. Please input number");
            }
        }

        String typeRent = regexFacility.inputRentType();

//        System.out.println("1. Thu?? theo n??m:");
//        System.out.println("2. Thu?? theo th??ng:");
//        System.out.println("3. Thu?? theo ng??y:");
//        System.out.println("4. Thu?? theo gi???:");
//
//        boolean check = true;
//        int choose = Integer.parseInt(scanner.nextLine());
//
//        while (check) {
//            switch (choose) {
//                case 1:
//                    typeRent += "Theo n??m.";
//                    check = false;
//                    break;
//                case 2:
//                    typeRent += "Theo th??ng.";
//                    check = false;
//                    break;
//                case 3:
//                    typeRent += "Theo ng??y.";
//                    check = false;
//                    break;
//                case 4:
//                    typeRent += "Theo gi???.";
//                    check = false;
//                    break;
//            }
//        }

        System.out.println("C??c D???ch v??? mi???n ph??:");
        String freeService = scanner.nextLine();

        Room room = new Room(id, nameService, usableArea, rentCost,
                maximumPeople, typeRent, freeService);

        facilityIntegerMap.put(room, 0);

        ReadAndWrite.writeFile(FILE_FACILITY, room.getLine() + ",0");

        System.out.println("???? th??m th??nh c??ng.");
        System.out.println("------------------------------");
    }
}