package bai17_IO_Binari.baitap.bt1;

import java.io.Serializable;

public class Product implements Serializable {
    private int ID ;
    private String name;
    private String manufacturer;
    private int price ;
    private String other ;

    public Product(int i, String name, String manufacturer, int price, String other) {
        this.ID = ID;
        this.name = name;
        this.manufacturer = manufacturer ;
        this.price = price;
        this.other = other;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public void FindInfo(){

    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }

    public int getProductId() {
        return 0;
    }
}
