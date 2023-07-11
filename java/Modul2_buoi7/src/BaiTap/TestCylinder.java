package BaiTap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder tru1 = new Cylinder(5.0, "blu", 3.0);
        String s = tru1.VolumeCalculation();
        System.out.println(s);
        Circle tru2 = new Cylinder();
        tru2.color = "yellow";
        tru2.radius = 4.0;
        ((Cylinder) tru2).hieght = 9.0;
        String a = ((Cylinder) tru2).VolumeCalculation();
        System.out.println(a);
        System.out.println(tru2.color);
    }
}
