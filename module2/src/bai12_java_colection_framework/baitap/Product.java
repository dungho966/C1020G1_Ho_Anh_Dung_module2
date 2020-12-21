package bai12_java_colection_framework.baitap;
import java.util.ArrayList;

public class Product {
    private int id ;
    private String name ;
    private String productInformation ;
    private int price ;

    public Product(){

    }

    public Product(int id, String name, String productInformation, int price) {
        this.id = id;
        this.name = name;
        this.productInformation = productInformation;
        this.price = price;
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

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return "name: " +name+ "\n id: " +id+ "\n productInformation: " +productInformation+ "\n price: "+price ;
    }
}
