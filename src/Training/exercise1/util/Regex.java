package Training.exercise1.util;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static String regexString(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {  // matches để so có khớp hay không
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
}
