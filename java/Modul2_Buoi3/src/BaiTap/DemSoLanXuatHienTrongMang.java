package BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 2};
        int dem = 0;
        System.out.println("Nhập số cần kiểm tra");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                dem++;
            }
        }
        System.out.println("Số lần xuất hiện: " + dem);
    }
}
