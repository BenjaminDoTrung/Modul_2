package BaiTap;

import java.util.Scanner;

public class PhuongTrinhBac2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào giá trị b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào giá trị c:");
        double c = scanner.nextDouble();
        PTB2_Method tinhNghiem = new PTB2_Method(a, b, c);
        System.out.println("Giá trị delta" + tinhNghiem.getDiscriminant());
        if (tinhNghiem.getDiscriminant() >= 0) {
            System.out.println("Giá trị Nghiệm 1" + tinhNghiem.getRoot1());
            System.out.println("Giá trị Nghiệm 2" + tinhNghiem.getRoot2());
        } else if (tinhNghiem.getDiscriminant() == 0) {
            System.out.println("Giá trị nghiệm kép là: " + tinhNghiem.getRoot1_2());
        } else {
            System.out.println("Phương trình vô Nghiệm");
        }
    }
}
