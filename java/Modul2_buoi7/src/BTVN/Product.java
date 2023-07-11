package BTVN;

public class Product {
    private int id;
    String name;
    private int price;
    private int quantity;
    private String description;

    public Product() {

    }

    public Product(int id, String name, int price, int quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String layGiaTriMang() {
        String s= "";
        s += "Tên đối tượng là " + name + "; ";
        s += "Giá tiền là: " + price + "; ";
        s += "Số lượng sản phầm " + quantity + "; ";
        s += "Đặc điểm nhận dạng " + description + "; ";
        return s;
    }
}