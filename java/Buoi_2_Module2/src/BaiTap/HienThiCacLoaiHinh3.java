package BaiTap;

public class HienThiCacLoaiHinh3 {
    public static void main(String[] args) {
        char a = '*';
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
