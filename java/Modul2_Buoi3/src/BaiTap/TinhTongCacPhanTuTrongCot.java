package BaiTap;

import java.util.Scanner;

public class TinhTongCacPhanTuTrongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số hàng");
        int hang = scanner.nextInt();
        System.out.println("Nhập số cột");
        int cot = scanner.nextInt();
        int[][] arr = new int[hang][cot];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ" + (j +1) + "Trong hàng" + (i+1));
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("Mảng nhập vào");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập cột cần tính tổng");
        int sumCot = scanner.nextInt();
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (sumCot == j) {
                    tong += arr[i][sumCot -1];
                }
            }
        }
        System.out.println("Tổng của cột thứ " + sumCot + " là: " + tong);
    }
}
