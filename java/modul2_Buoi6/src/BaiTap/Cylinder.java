package BaiTap;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public void volume() {
        System.out.println("Volume = " + Math.PI * Math.pow(getRadius(), 2) * height);
    }
}
