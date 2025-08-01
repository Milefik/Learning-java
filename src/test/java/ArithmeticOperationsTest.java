import LessonOne.ArithmeticOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {
    @Test
    public void testAddition() {
        assertEquals(8, ArithmeticOperations.add(5, 3));
    }

    @Test
    public void testAdditionWithNegative() {
        assertEquals(2, ArithmeticOperations.add(5, -3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, ArithmeticOperations.subtract(5, 3));
    }

    @Test
    public void testSubtractionWithNegative() {
        assertEquals(8, ArithmeticOperations.subtract(5, -3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, ArithmeticOperations.multiply(5, 3));
    }

    @Test
    public void testMultiplicationWithNegative() {
        assertEquals(-15, ArithmeticOperations.multiply(5, -3));
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(0, ArithmeticOperations.multiply(0, 99));
    }

    @Test
    public void testDivision() {
        assertEquals(2, ArithmeticOperations.divide(6, 3));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5, 0));
    }

    @Test
    public void testDivisionResultNotRounded() {
        assertEquals(2, ArithmeticOperations.divide(7, 3));
    }
}
