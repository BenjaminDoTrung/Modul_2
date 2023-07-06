package BaiGiang;

import java.util.Scanner;

public class Test2 {
    // Tính tổng dãy nhập vào từ bàn phím
    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị thứ nhất");
        int x = scanner.nextInt();
        System.out.println("Nhập vào giá trị thứ hai");
        int y = scanner.nextInt();
        System.out.println("Tổng dãy từ " + x + " đến " + y + " : " + sum(x,y));
    }
}
