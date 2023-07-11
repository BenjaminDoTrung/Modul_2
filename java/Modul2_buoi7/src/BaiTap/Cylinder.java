package BaiTap;

public class Cylinder extends Circle {
    double hieght;
    public Cylinder() {

    }
    public Cylinder(double radius, String color, double hieght) {
        super(radius, color);
        this.hieght = hieght;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }
    public String VolumeCalculation() {
        return "VolumeCalculation = " + (Math.PI * Math.pow(radius, 2) * hieght);
    }
}
