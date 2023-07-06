package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("Nhập vào phần tử của mảng");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            arr1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println("Nhập phần tử cần xóa: ");
        int x = scanner.nextInt();
        int index_delete = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (x == arr1[i]) {
                index_delete = i;
            }
        }
        System.out.println("Vị trí cần xóa là: " + index_delete);
            int[] arr2 = new int[arr1.length - 1];
        for (int i = 0; i < index_delete; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = index_delete; i < arr1.length - 1 ; i++) {
            arr2[i] = arr1[i + 1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
