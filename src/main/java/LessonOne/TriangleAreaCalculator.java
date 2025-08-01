package LessonOne;

public class TriangleAreaCalculator {
    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base и height должны быть > 0");
        }
        return (base * height) / 2;
    }
}
