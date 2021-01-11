package _casestudy.task1.model;

public abstract class Services {
    private String id;
    private String nameServices;
    private int useArea;
    private int price;
    private int maximumHuman;
    private String rentalType;

    public Services() {
    }

    public Services(String id, String nameServices, int useArea, int price, int maximumHuman, String rentalType) {
        this.id = id;
        this.nameServices = nameServices;
        this.useArea = useArea;
        this.price = price;
        this.maximumHuman = maximumHuman;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaximumHuman() {
        return maximumHuman;
    }

    public void setMaximumHuman(int maximumHuman) {
        this.maximumHuman = maximumHuman;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract void showInfo();

}
