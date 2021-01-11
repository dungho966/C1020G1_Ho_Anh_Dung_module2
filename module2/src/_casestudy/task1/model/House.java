package _casestudy.task1.model;

public class House extends Services {
    private String standardRoom ; //tiêu chuẩn phòng
    private String otherConvenient ; //tiện nghi khác
    private int floors ;

    public House() {

    }

    @Override
    public void showInfo() {
        System.out.println("ID: " +getId());
        System.out.println("Name Services: " +getNameServices());
        System.out.println("UseArea: " +getUseArea());
        System.out.println("Price: " +getPrice());
        System.out.println("MaximumHuman: " +getMaximumHuman());
        System.out.println("Rental Type: " +getRentalType());
        System.out.println("Standard Room: " +getStandardRoom());
        System.out.println("Other Convenient: " +getOtherConvenient());
        System.out.println("Floors: " +getFloors());

    }

    public House(String standardRoom, String otherConvenient, int floors) {
        this.standardRoom = standardRoom;
        this.otherConvenient = otherConvenient;
        this.floors = floors;
    }

    public House(String ID, String nameServices, int useArea, int price, int maximumHuman, String rentalType, String standardRoom, String otherConvenient, int floors) {
        super(ID, nameServices, useArea, price, maximumHuman, rentalType);
        this.standardRoom = standardRoom;
        this.otherConvenient = otherConvenient;
        this.floors = floors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherConvenient() {
        return otherConvenient;
    }

    public void setOtherConvenient(String otherConvenient) {
        this.otherConvenient = otherConvenient;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
        public String toString() {
            return "House{" +
                    "standardRoom='" + standardRoom + '\'' +
                    ", otherConvenient='" + otherConvenient + '\'' +
                    ", floors=" + floors +
                    '}';
    }
}
