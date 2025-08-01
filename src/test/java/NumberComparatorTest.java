import LessonOne.NumberComparator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberComparatorTest {
    @Test
    public void testFirstNumberGreater() {
        assertEquals(NumberComparator.compare(10, 5), "Первое число больше");
    }

    @Test
    public void testSecondNumberGreater() {
        assertEquals(NumberComparator.compare(5, 10), "Второе число больше");
    }

    @Test
    public void testNumbersEqual() {
        assertEquals(NumberComparator.compare(7, 7), "Числа равны");
    }

    @Test
    public void testNegativeNumbersComparison() {
        assertEquals(NumberComparator.compare(-10, -5), "Второе число больше");
    }

    @Test
    public void testCompareWithZero() {
        assertEquals(NumberComparator.compare(1, 0), "Первое число больше");
    }

    @Test
    public void testComparisonNegativePositiveNumbers() {
        assertEquals(NumberComparator.compare(-5, 5), "Второе число больше");
    }
}
