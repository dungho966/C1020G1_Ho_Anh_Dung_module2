package ThiModul2.Model;

public abstract class Phone {
    private String id ;
    private String phoneName ;
    private int price ;
    private int destNumber ;
    private String production ;

    public Phone() {
    }

    public Phone(String id, String phoneName, int price, int destNumber, String production) {
        this.id = id;
        this.phoneName = phoneName;
        this.price = price;
        this.destNumber = destNumber;
        this.production = production;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDestNumber() {
        return destNumber;
    }

    public void setDestNumber(int destNumber) {
        this.destNumber = destNumber;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", destNumber=" + destNumber +
                ", production='" + production + '\'' +
                '}';
    }
}
