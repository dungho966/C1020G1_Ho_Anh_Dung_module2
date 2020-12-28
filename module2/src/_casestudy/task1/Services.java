package _casestudy.task1;

public class Services {
    private  String ID ;
    private String nameServices ;
    private int useArea ;
    private int price ;
    private int maximumHuman ;
    private String rentalType ;

    public Services() {
    }

    public Services(String ID, String nameServices, int useArea, int price, int maximumHuman, String rentalType) {
        this.ID = ID;
        this.nameServices = nameServices;
        this.useArea = useArea;
        this.price = price;
        this.maximumHuman = maximumHuman;
        this.rentalType = rentalType;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

}
