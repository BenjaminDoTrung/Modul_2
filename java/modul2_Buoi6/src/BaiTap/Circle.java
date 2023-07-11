package BaiTap;

public class Circle {
    private double radius;
    private String color;
    Circle() {
    }
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
