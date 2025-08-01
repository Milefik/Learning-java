import LessonOne.TriangleAreaCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaCalculatorTest {
    @Test
    public void testValidArea() {
        assertEquals(10.0, TriangleAreaCalculator.calculateArea(5, 4));
    }

    @Test
    public void testValidAreaDecimalResult() {
        assertEquals(7.5, TriangleAreaCalculator.calculateArea(5, 3));
    }

    @Test
    public void testValidAreaLargeValues() {
        assertEquals(50000.0, TriangleAreaCalculator.calculateArea(200, 500));
    }

    @Test
    public void testInvalidBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(-5, 4));
    }

    @Test
    public void testInvalidHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(5, 0));
    }

    @Test
    public void testBothNegative() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(-10, -3));
    }
}
