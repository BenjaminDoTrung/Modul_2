package BaiTap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0);
        Cylinder cylinder2 = new Cylinder(2.0, "blue", 3.0);
        cylinder2.volume();
    }
}
