package BaiTap;

import java.util.Scanner;

public class TmGiaTriNhoNhatTrongMang{
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử vào mảng");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
