package _case_study.ultis;

import java.util.Scanner;

public class RegexFacility {
    public static Scanner scanner = new Scanner(System.in);

    public static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    public static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    public static final String ID_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String NAME_SERVICE = "^[A-Z][a-zA-Z]{1,10}$";
    public static final String RENT_TYPE = "^Year|Month|Day|Hour$";
    public static final String ROOM_STANDARD = "^Vip|Normal|Double|Single$";

    public String inputIdVilla() {
        System.out.println("Nhập id villa");
        return RegexData.regexString(scanner.nextLine(), ID_VILLA,
                "Bạn đã nhập sai định dạng, định dạng đúng là SVVL-XXXX(với XXXX là 4 số bất kì)");
    }

    public String inputIdHouse() {
        System.out.println("Nhập id house");
        return RegexData.regexString(scanner.nextLine(), ID_HOUSE,
                "Bạn đã nhập sai định dạng, định dạng đúng là SVHO-XXXX(với XXXX là 4 số bất kì)");
    }

    public String inputIdRoom() {
        System.out.println("Nhập id room");
        return RegexData.regexString(scanner.nextLine(), ID_ROOM,
                "Bạn đã nhập sai định dạng, định dạng đúng là SVRO-XXXX(với XXXX là 4 số bất kì)");
    }

    public String inputNameService() {
        System.out.println("Nhập tên dịch vụ");
        return RegexData.regexString(scanner.nextLine(), NAME_SERVICE,
                "Bạn nhập sai rồi, chữ cái đầu tiên của tên dịch vụ phải viết hoa.");
    }

    public String inputRentType() {
        System.out.println("Kiểu thuê");
        return RegexData.regexString(scanner.nextLine(), RENT_TYPE, "Có 4 kiểu thuê gồm: 1. Year,2. Month,3. Day,4. Hour");
    }

    public String inputRoomStandard() {
        System.out.println("Tiêu chuẩn phòng");
        return RegexData.regexString(scanner.nextLine(), ROOM_STANDARD, "Có 4 kiểu thuê gồm: 1. Vip,2. Normal,3. Double,4. Single");
    }
}
