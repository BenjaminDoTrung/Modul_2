package BaiTap;

public class ArrHinh {
    public static void main(String[] args) {
        Circle1 hTron = new Circle1();
        hTron.radius = 3.0;
        Rectangle hCN = new Rectangle();
        hCN.length = 5;
        hCN.width = 4;
        Square hVuong = new Square();
        hVuong.Canh = 4;


        Resizeable[] arr = new Resizeable[3];
        arr[0] = hTron;
        arr[1] = hCN;
        arr[2] = hVuong;
        for (int i = 0; i < arr.length; i++) {
            arr[i].kichThuoc();
            arr[i].resize((Math.random() * 100));
        }
    }
}
