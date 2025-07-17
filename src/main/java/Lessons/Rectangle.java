package Lessons;

public class Rectangle extends AbstractShape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getSquare() {
        return width * height;
    }
}
