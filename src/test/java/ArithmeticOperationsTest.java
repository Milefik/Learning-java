import LessonOne.ArithmeticOperations;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticOperationsTest {
    @Test
    public void testAddition() {
        assertEquals(ArithmeticOperations.add(5, 3), 8);
    }

    @Test
    public void testAdditionWithNegative() {
        assertEquals(ArithmeticOperations.add(5, -3), 2);
    }

    @Test
    public void testSubtraction() {
        assertEquals(ArithmeticOperations.subtract(5, 3), 2);
    }

    @Test
    public void testSubtractionWithNegative() {
        assertEquals(ArithmeticOperations.subtract(5, -3), 8);
    }

    @Test
    public void testMultiplication() {
        assertEquals(ArithmeticOperations.multiply(5, 3), 15);
    }

    @Test
    public void testMultiplicationWithNegative() {
        assertEquals(ArithmeticOperations.multiply(5, -3), -15);
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(ArithmeticOperations.multiply(0, 99), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(ArithmeticOperations.divide(6, 3), 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperations.divide(5, 0);
    }

    @Test
    public void testDivisionResultNotRounded() {
        assertEquals(ArithmeticOperations.divide(7, 3), 2);
    }
}
