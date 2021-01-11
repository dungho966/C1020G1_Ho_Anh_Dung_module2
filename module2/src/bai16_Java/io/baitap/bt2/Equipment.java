package bai16_Java.io.baitap.bt2;

public class Equipment {
    private String name;
    private int datebuy;
    private double price;
    private String buyHuman;

    public Equipment() {
    }

    public Equipment(String name, int datebuy, double price, String buyHuman) {
        this.name = name;
        this.datebuy = datebuy;
        this.price = price;
        this.buyHuman = buyHuman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDatebuy() {
        return datebuy;
    }

    public void setDatebuy(int datebuy) {
        this.datebuy = datebuy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuyHuman() {
        return buyHuman;
    }

    public void setBuyHuman(String buyHuman) {
        this.buyHuman = buyHuman;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", age=" + datebuy +
                ", price=" + price +
                ", buyHuman='" + buyHuman + '\'' +
                '}';
    }


}
