package ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị: ");
        String ten = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(ten)) {
                System.out.println(ten + " có trong lớp students");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(ten + " không có trong lớp students");
        }
    }
}
