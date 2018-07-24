package models;

/**
 * Created by COM2-00-PC on 7/24/2018.
 */
public class Subject { //รองเท้า
    private String id, brand, color; //รหัส,ยี่ห้อ, สี
    private int size; //ขนาดเบอร์
    private double price, discountRate, net;
    // ราคาส่วนลด, อัตราส่วนลด, ราคาหลังหักส่วนลด

    public Subject() {
    }

    public Subject(String id, String brand, String color, int size, double price, double discountRate) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.discountRate = discountRate;
        setNet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        setNet();
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        setNet();
    }

    public double getNet() {
        return net;
    }

    private void setNet() {
        net = price - (price * discountRate);
    }
}

