import LessonOne.TriangleAreaCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleAreaCalculatorTest {
    @Test
    public void testValidArea() {
        assertEquals(TriangleAreaCalculator.calculateArea(5, 4), 10.0);
    }

    @Test
    public void testValidAreaDecimalResult() {
        assertEquals(TriangleAreaCalculator.calculateArea(5, 3), 7.5, 0.0001);
    }

    @Test
    public void testValidAreaLargeValues() {
        assertEquals(TriangleAreaCalculator.calculateArea(200, 500), 50000.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidBase() {
        TriangleAreaCalculator.calculateArea(-5, 4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidHeight() {
        TriangleAreaCalculator.calculateArea(5, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testBothNegative() {
        TriangleAreaCalculator.calculateArea(-10, -3);
    }
}
