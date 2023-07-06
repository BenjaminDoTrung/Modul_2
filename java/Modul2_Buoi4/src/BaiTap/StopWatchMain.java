package BaiTap;

public class StopWatchMain {
    public static void main(String[] args) {
        long[] arr = new long[100000];
        for (long i = 0; i < arr.length; i++) {
            arr[(int) i] = (long) (Math.random() * 100);
        }
        StopWatchMethod Time = new StopWatchMethod();
        System.out.println("Thời gian bắt đầu " + Time.getStartTime());
        selectionSoft(arr);
        System.out.println("Thời gian kết thúc " + Time.getEndTime());
        System.out.println("Thời gian sắp xếp xong mảng " + Time.getElapsedTime());

    }
    public static long[] selectionSoft(long[] arr) {
        long tem;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] < arr[j]) {
                    tem = arr[j];
                    arr[i] = tem;
                    arr[j] = arr[i];
                }
            }
        }
        return arr;
    }
}
