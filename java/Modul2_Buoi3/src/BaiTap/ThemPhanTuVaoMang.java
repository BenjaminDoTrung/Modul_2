package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn:");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn:");
        int indexChen = scanner.nextInt();
        if (indexChen <= -1 && indexChen >= arr.length -1 ) {
            System.out.println("Không chèn được phần tử vào mảng");
        }
        int[] arrNew = new  int[arr.length + 1];
        for (int i = 0; i < indexChen + 1; i++) {
            arrNew[i] = arr[i];
            }
        arrNew[indexChen] = x;

        for (int i = indexChen + 1; i < arrNew.length; i++) {
            arrNew[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
