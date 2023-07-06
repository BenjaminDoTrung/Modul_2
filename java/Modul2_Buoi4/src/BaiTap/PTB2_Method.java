package BaiTap;

public class PTB2_Method {
private double a, b, c;
public PTB2_Method(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
}
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return ((-b) + Math.sqrt((getDiscriminant())))/(2 * a);
    }
    public double getRoot2() {
        return ((-b) - Math.sqrt((getDiscriminant())))/(2 * a);
    }
    public double getRoot1_2() {
        return ((-b)/(2*a));
    }
}
