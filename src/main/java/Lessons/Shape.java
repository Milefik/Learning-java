package Lessons;

public interface Shape {
    String getFillColor();
    String getBorderColor();
    double getSquare();
    default double getPerimeter() {
        return 0;
    }
}