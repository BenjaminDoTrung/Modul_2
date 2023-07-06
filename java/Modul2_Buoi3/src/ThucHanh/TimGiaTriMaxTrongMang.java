package ThucHanh;

import java.util.Scanner;

public class TimGiaTriMaxTrongMang {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
            System.out.print("Property list: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }
                int max = arr[0];
                int index = 1;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        index = j + 1;
                    }
                }
                System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
