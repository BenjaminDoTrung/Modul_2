package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap "+ matrix.length + " dong va " + matrix[0].length + " cot cua matrix:");
        for(int dong = 0; dong < matrix.length ; dong++) {
            for(int cot = 0; cot < matrix[dong].length; cot++) {
                matrix[dong][cot] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Mảng hai chiều có "+ matrix.length + " dòng và " + matrix[0].length + " cột:");
        for(int dong = 0; dong < matrix.length ; dong++) {
            for(int cot = 0; cot < matrix[dong].length ; cot++) {
                System.out.print(matrix[dong][cot] + " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
             if (max < matrix[i][j]) {
                 max = matrix[i][j];
             }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
