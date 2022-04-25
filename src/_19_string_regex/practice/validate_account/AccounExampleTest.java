package _19_string_regex.practice.validate_account;

import java.util.Scanner;

public class AccounExampleTest {
    private static AccountExample accountExample;
    public static Scanner scanner = new Scanner(System.in);
    public static final String[] validAccount = new String[]{scanner.nextLine()};
    public static final String[] invalidAccount = new String[]{scanner.nextLine()};

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
