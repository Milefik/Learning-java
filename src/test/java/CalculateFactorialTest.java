import LessonOne.CalculateFactorial;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalculateFactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(CalculateFactorial.factorial(0), 1);
    }

    @Test
    public void testFactorialForMaxAllowableValue() {
        assertEquals(CalculateFactorial.factorial(20), 2432902008176640000L);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(CalculateFactorial.factorial(1), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeFactorialThrowsException() {
        CalculateFactorial.factorial(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfVeryNegativeNumber() {
        CalculateFactorial.factorial(-100);
    }

    @Test
    public void testFactorialCausingOverflow() {
        assertTrue(CalculateFactorial.factorial(21) < 0, "Ожидается отрицательное число из-за переполнения long");
    }
}
