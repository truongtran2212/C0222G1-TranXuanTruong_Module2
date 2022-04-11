package _08_clean_code.practice.rename_variable_and_split_constant;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
public class NewCalculatorTest {
    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = NewCalculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    public void testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = NewCalculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    public void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = NewCalculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = NewCalculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    public void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                ()-> NewCalculator.calculate(a, b, o));
    }
    @Test
    @DisplayName("Testing wrong operator")
    public void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                ()-> {
                    NewCalculator.calculate(a, b, o);});
    }
}
