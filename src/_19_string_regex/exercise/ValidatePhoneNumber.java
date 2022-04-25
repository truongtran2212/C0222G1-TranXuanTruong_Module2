package _19_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static final String VALIDATE_PHONE_NUMBER = "^\\(\\d{2}\\)-\\(0\\d{8,}\\)$";

    public static void main(String[] args) {
        String name = scanner.nextLine();
        boolean check = Pattern.matches(VALIDATE_PHONE_NUMBER, name);
        System.out.println(check);
    }
}
