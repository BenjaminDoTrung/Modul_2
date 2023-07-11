package BaiTap;

public class Circle1 implements Resizeable{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle1() {

    }


    public void kichThuoc () {
        System.out.println("Radius : " + this.radius);
    }


    @Override
    public void resize(double percent) {
        System.out.println("size Circle1: " + ((percent) * radius));
    }
}
