package BaiTap;

public class Rectangle implements Resizeable{
    int length;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {

    }


    public void kichThuoc() {
        System.out.println("Chiều Dài: " + this.length + "Chiều Rộng: " + this.width);
    }


    @Override
    public void resize(double percent) {
        System.out.println( "chiều dài: " + (this.length * percent) + "Chiều rộng: " + (this.width * percent));
    }
}
