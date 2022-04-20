package _15_exception_handling_and_debug.exercise.illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
        public IllegalTriangleException() {
        }

        public IllegalTriangleException(String message) {
                super(message);
        }

}
