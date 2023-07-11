package ThucHanh.Hinh;

public class Circle {
    double radius;
    String color;
    boolean filled;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

}
