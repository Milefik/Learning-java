package Lessons;

public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * (radius * radius);
    }
}
