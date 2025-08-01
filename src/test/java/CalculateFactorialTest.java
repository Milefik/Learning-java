import LessonOne.CalculateFactorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateFactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, CalculateFactorial.factorial(0));
    }

    @Test
    public void testFactorialForMaxAllowableValue() {
        assertEquals(2432902008176640000L, CalculateFactorial.factorial(20));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, CalculateFactorial.factorial(1));
    }

    @Test
    public void testNegativeFactorialThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> CalculateFactorial.factorial(-1));
    }

    @Test
    public void testFactorialOfVeryNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> CalculateFactorial.factorial(-100));
    }

    @Test
    public void testFactorialCausingOverflow() {
        assertTrue(CalculateFactorial.factorial(21) < 0, "Ожидается отрицательное число из-за переполнения long");
    }
}
