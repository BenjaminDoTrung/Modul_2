package BTVN;

import java.util.Arrays;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Product ao = new Product(1, "ao", 100000, 5, "là cái áo");
        Product mu = new Product(2, "mũ", 50000, 4, "là cái mũ");
        Product vay = new Product(3, "Váy", 150000, 6, "Là cái váy");
        Product nuocHoa = new Product(4, "Nước hoa", 200000, 2, "Nước hoa");
        Product giay = new Product(5, "Giày", 100000, 3, "Là cái giày");

        // tạo mảng product

        Product[] arrProduct = new Product[5];
        arrProduct[0] = ao;
        arrProduct[1] = mu;
        arrProduct[2] = vay;
        arrProduct[3] = nuocHoa;
        arrProduct[4] = giay;

        //tạo các tính năng

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phương thức");
        int chon = input.nextInt();

        switch (chon) {
            case 1:
                System.out.println("Thêm một phần tử vào mảng:");
                Product product1 = new Product();
                System.out.println("Nhập id sản phẩm");
                product1.setId(input.nextInt());
                System.out.println("Nhập tên sản phẩm");
                Scanner scannerx = new Scanner(System.in);
                String tenNew = scannerx.nextLine();
                product1.setName(tenNew);
                System.out.println("Nhập vào giá trị sản phẩm");
                product1.setPrice(input.nextInt());
                System.out.println("Nhập Số lượng sản phẩm");
                product1.setQuantity(input.nextInt());
                System.out.println("Nhập vào cách nhận dạng sản phẩm");
                product1.setDescription(scannerx.nextLine());

                Product[] newArrProduct = new Product[arrProduct.length + 1];
                for (int i = 0; i < arrProduct.length; i++) {
                    newArrProduct[i] = arrProduct[i];
                }
                newArrProduct[arrProduct.length] = product1;
                System.out.println("Mảng mới là :");
                for (int i = 0; i < newArrProduct.length; i++) {
                    System.out.println(newArrProduct[i].layGiaTriMang());
                }
                break;
            case 2:
                System.out.println("Nhập vào id sản phẩm");
                int newId = input.nextInt();
                Product t = null;
                for (int i = 0; i < arrProduct.length; i++) {
                    if (arrProduct[i].getId() != newId) {
                        System.out.println("Id nhập vào không chính xác");
                    } else {
                        t = arrProduct[i];
                        break;
                    }
                }
                System.out.println("Chỉnh sửa name");
                Scanner input2 = new Scanner(System.in);
                String a = input2.nextLine();
                t.setName(a);
                System.out.println("New Name: " + t.getName());
                System.out.println("Chỉnh sửa giá");
                t.setPrice(input.nextInt());
                System.out.println("Giá mới: " + t.getPrice());
                System.out.println("Chỉnh sửa số lượng");
                t.setQuantity(input.nextInt());
                System.out.println("Số lượng mới: " + t.getQuantity());
                System.out.println("Chỉnh sửa cách nhận dạng");
                t.setDescription(input2.nextLine());
                System.out.println("Đặc điểm nhận dạng mới");
                break;
            case 3:
                System.out.println("Nhập vào iD cần xóa");
                int iD = input.nextInt();
                Product[] arrProduct2 = new Product[arrProduct.length - 1];
                int indexDelete = 0;
                for (int i = 0; i < arrProduct2.length; i++) {
                    indexDelete = i;
                    if (iD != arrProduct[i].getId()){
                        arrProduct2[i] = arrProduct[i];

                    } else {
                        break;
                    }
                }
                for (int i = indexDelete; i < arrProduct2.length; i++) {
                    arrProduct2[i] = arrProduct[i + 1];
                }
                for (int i = 0; i < arrProduct2.length; i++) {
                    System.out.println(arrProduct2[i].layGiaTriMang());
                }
                break;
            case 4:
                for (int i = 0; i < arrProduct.length; i++) {
                    System.out.println(arrProduct[i].layGiaTriMang());
                }
                break;
            case 5:
                int max = arrProduct[0].getPrice();
                int dem = 0;
                for (int i = 1; i < arrProduct.length; i++) {
                    if (max < arrProduct[i].getPrice()){
                        max = arrProduct[i].getPrice();
                        dem = i;
                    }
                }
                System.out.println("Đối tượng có giá trị lớn nhất:");
                System.out.println(max);
                System.out.println("Đối tượng lớn nhất:");
                System.out.println(arrProduct[dem].layGiaTriMang());
                break;
            case 6:
                int min = arrProduct[0].getPrice();
                int dem2 = 0;
                for (int i = 1; i < arrProduct.length; i++) {
                    if (min > arrProduct[i].getPrice()){
                        min = arrProduct[i].getPrice();
                        dem2 = i;
                    }
                }
                System.out.println("Đối tượng có giá trị nhỏ nhất:");
                System.out.println(min);
                System.out.println("Đối tượng nhỏ nhất:");
                System.out.println(arrProduct[dem2].layGiaTriMang());
                break;
            case 7:
                int quantitymax = arrProduct[0].getQuantity();
                int dem3 = 0;
                for (int i = 1; i < arrProduct.length ; i++) {
                    if (quantitymax < arrProduct[i].getQuantity()) {
                        quantitymax = arrProduct[i].getQuantity();
                        dem3 = i;
                    }
                }
                System.out.println("Số lượng lớn nhất: ");
                System.out.println(quantitymax);
                System.out.println("Đối tượng đó là:");
                System.out.println(arrProduct[dem3].layGiaTriMang());
                break;
            case 8:
                int quantitymin = arrProduct[0].getQuantity();
                int dem4 = 0;
                for (int i = 1; i < arrProduct.length ; i++) {
                    if (quantitymin > arrProduct[i].getQuantity()) {
                        quantitymin = arrProduct[i].getQuantity();
                        dem4 = i;
                    }
                }
                System.out.println("Số lượng nhỏ nhất: ");
                System.out.println(quantitymin);
                System.out.println("Đối tượng đó là:");
                System.out.println(arrProduct[dem4].layGiaTriMang());
                break;
            case 9:
                int tong = 0;
                for (int i = 0; i < arrProduct.length; i++) {
                    tong += arrProduct[i].getPrice();
                }
                System.out.println(" Tổng tiền hàng: ");
                System.out.println(tong);
                break;
            default:
                System.out.println("Nhập sai phương thức mời thực hiện lại");
        }
    }
}
