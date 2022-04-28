package _case_study.controller;

import _11_stack_and_queue.exercise.demerging_use_queue.Nu;
import _case_study.service.impl.BookingServiceImpl;
import _case_study.service.impl.CustomerServiceImpl;
import _case_study.service.impl.EmployeeServiceImpl;
import _case_study.service.impl.FacilityServiceImpl;
import _case_study.ultis.TryCatch;
import org.junit.platform.commons.function.Try;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            try {
                System.out.println("--------Main Menu--------");
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");

                System.out.println("Chọn 1 option ");

//                int choose = Integer.parseInt(scanner.nextLine());

                switch (TryCatch.check()) {
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
                    default:
                        System.out.println("Input number 1 to 6");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayMenuEmployee() {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        while (true) {
            try {
                System.out.println("--------Employee Menu----------");
                System.out.println("1. Display list employees");
                System.out.println("2. Add new employee");
                System.out.println("3. Edit employee");
                System.out.println("4. Return main menu");

                System.out.println("Chọn 1 option ");

//                int choose = Integer.parseInt(scanner.nextLine());
                switch (TryCatch.check()) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.addNew();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Input number 1 to 4");

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayMenuCustomer() {

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        while (true) {
            try {
                System.out.println("--------Customer Menu----------");
                System.out.println("1. Display list customer");
                System.out.println("2. Add new customer");
                System.out.println("3. Edit customer");
                System.out.println("4. Return main menu");

                System.out.println("Chọn 1 option ");


//                int choose = Integer.parseInt(scanner.nextLine());
                switch (TryCatch.check()) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.addNew();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Input number 1 to 4");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayMenuFacility() {

        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        while (true) {
            try {
                System.out.println("--------Facility Menu----------");
                System.out.println("1. Display list facility");
                System.out.println("2. Add new facility");
                System.out.println("3. Display list facility maintenance");
                System.out.println("4. Return main menu");

                System.out.println("Chọn 1 option ");


//                int choose = Integer.parseInt(scanner.nextLine());
                switch (TryCatch.check()) {
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        addNewMenuFacility();
                        break;
                    case 3:

                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Input number 1 to 4");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addNewMenuFacility() {

        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        while (true) {
            try {
                System.out.println("--------Facility New Menu----------");
                System.out.println("1. Add new villa");
                System.out.println("2. Add new house");
                System.out.println("3. Add new room");
                System.out.println("4. Return main menu");

                System.out.println("Chọn 1 option ");



//                int choose = Integer.parseInt(scanner.nextLine());
                switch (TryCatch.check()) {
                    case 1:
                        facilityService.addNewVilla();
                        displayMenuFacility();
                        break;
                    case 2:
                        facilityService.addNewHouse();
                        displayMenuFacility();
                        break;
                    case 3:
                        facilityService.addNewRoom();
                        displayMenuFacility();
                        break;
                    case 4:
                       return;
                    default:
                        System.out.println("Input number 1 to 4");

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayMenuBooking() {
        BookingServiceImpl bookingService = new BookingServiceImpl();

        while (true) {
            try {
                System.out.println("--------Booking Menu----------");
                System.out.println("1. Add new booking");
                System.out.println("2. display list booking");
                System.out.println("3. Create new constracts");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");

                System.out.println("Chọn 1 option ");

//                int choose = Integer.parseInt(scanner.nextLine());
                switch (TryCatch.check()) {
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
                       return;
                    default:
                        System.out.println("Input number 1 to 6");

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayMenuPromotion() {

        while (true) {
            try {
                System.out.println("--------Promotion Menu----------");
                System.out.println("1. Display list customers use service");
                System.out.println("2. Display list customers get voucher");
                System.out.println("3. Return main menu");

                System.out.println("Chọn 1 option ");


//                int choose = Integer.parseInt(scanner.nextLine());
                switch (TryCatch.check()) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Input number 1 to 3");

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}