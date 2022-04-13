package _case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static final boolean check = true;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.println("Chọn 1 option ");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    displayMenuEmployee();
                    break;
                case 2:
                    displayMenuCustomer();
                    break;
                case 3:
                    displayMenuFacility();
                    break;
                case 4:
                    displayMenuBooking();
                    break;
                case 5:
                    displayMenuPromotion();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }

    public static void displayMenuEmployee() {

        while (check) {

            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            System.out.println("Chọn 1 option ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    displayMainMenu();
                    break;

            }
        }
    }

    public static void displayMenuCustomer() {
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            System.out.println("Chọn 1 option ");


            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayMenuFacility() {

        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Return main menu");

            System.out.println("Chọn 1 option ");


            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayMenuBooking() {

        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            System.out.println("Chọn 1 option ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayMenuPromotion() {

        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");

            System.out.println("Chọn 1 option ");


            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }
}