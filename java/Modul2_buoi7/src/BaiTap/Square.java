package BaiTap;

public class Square implements Resizeable{
    double Canh;

    public double getCanh() {
        return Canh;
    }

    public void setCanh(double canh) {
        Canh = canh;
    }

    public Square () {

    }


    public void kichThuoc() {
        System.out.println("Độ Dài Cạnh: " + this.Canh);
    }


    @Override
    public void resize(double percent) {
        System.out.println("size Square: " + (this.Canh * percent));
    }
}
