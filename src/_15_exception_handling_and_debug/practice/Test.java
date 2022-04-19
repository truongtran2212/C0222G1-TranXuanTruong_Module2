package _15_exception_handling_and_debug.practice;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import javafx.scene.transform.Scale;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("number 1: ");
            int number1 = scanner.nextInt();

            System.out.println("number 2: ");
            int number2 = scanner.nextInt();

            System.out.println("Thương của 2 số:");
            int result = number1 / number2;

            System.out.println("Result: " + result);

        }
        catch(Exception e){
            System.out.println("Input error. " + e);
        }
    }
}
