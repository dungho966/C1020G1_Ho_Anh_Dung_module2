package bai12_java_colection_framework.baitap;

public class Product {
    private String name ;
    private int ID ;
    private int price ;

    public Product() {
    }

    public Product(String name, int ID, int price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String displayProduct() {
        return "Product{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", price=" + price +
                '}';
    }
}
