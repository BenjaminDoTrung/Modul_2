package ThucHanh;

public class HeCacDoiTuongHinhHoc {
    String color = "blue";
    boolean filled = true;
    HeCacDoiTuongHinhHoc() {
    }
    HeCacDoiTuongHinhHoc(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;

    }
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
