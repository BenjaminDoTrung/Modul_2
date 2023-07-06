package BaiTap;

import java.util.Arrays;

public class GopHaiMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arrNew = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrNew[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < arrNew.length; i++) {
                arrNew[i] = arr2[j];
                j++;
            }
        System.out.println(Arrays.toString(arrNew));
    }
}
