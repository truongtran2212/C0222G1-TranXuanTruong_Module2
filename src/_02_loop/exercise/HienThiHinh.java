package _02_loop.exercise;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();


            switch (choice) {

                case 1:
                    System.out.println(" Print the rectangle");
                    Scanner input1 = new Scanner(System.in);
                    System.out.println(" Chiều dài");
                    int height = input1.nextInt();
                    System.out.println(" Chiều rộng");
                    int width = input1.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");


                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");


                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i*2 -1 ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
            }
        }
    }
}
