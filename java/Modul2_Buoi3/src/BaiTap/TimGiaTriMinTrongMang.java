package BaiTap;

public class TimGiaTriMinTrongMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + minValue(arr));
    }

    public static int minValue(int[] array) {
        int min = array[0];
//        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
//                index = i;
            }
        }
        return min;
    }
}
