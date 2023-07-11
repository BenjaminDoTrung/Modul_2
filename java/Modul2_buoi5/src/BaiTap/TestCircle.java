package BaiTap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        circle.setColor("blu");
        circle.setRadius(2.0);
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
    }
}
