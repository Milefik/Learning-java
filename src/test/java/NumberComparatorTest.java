import LessonOne.NumberComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparatorTest {
    @Test
    public void testFirstNumberGreater() {
        assertEquals("Первое число больше", NumberComparator.compare(10, 5));
    }

    @Test
    public void testSecondNumberGreater() {
        assertEquals("Второе число больше", NumberComparator.compare(5, 10));
    }

    @Test
    public void testNumbersEqual() {
        assertEquals("Числа равны", NumberComparator.compare(7, 7));
    }

    @Test
    public void testNegativeNumbersComparison() {
        assertEquals("Второе число больше", NumberComparator.compare(-10, -5));
    }

    @Test
    public void testCompareWithZero() {
        assertEquals("Первое число больше", NumberComparator.compare(1, 0));
    }

    @Test
    public void testComparisonNegativePositiveNumbers() {
        assertEquals("Второе число больше", NumberComparator.compare(-5, 5));
    }
}
