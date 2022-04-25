package _19_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateName {
    public static Scanner scanner = new Scanner(System.in);
    public static final String VALIDATE_NAME = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {

        String name = scanner.nextLine();
        boolean check = Pattern.matches(VALIDATE_NAME, name);
        System.out.println(check);
    }
}
