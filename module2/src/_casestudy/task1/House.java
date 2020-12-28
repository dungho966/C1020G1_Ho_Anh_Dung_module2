package _casestudy.task1;

public class House extends Services {
    private String standardRoom ; //tiêu chuẩn phòng
    private String otherConvenient ; //tiện nghi khác
    private int floors ;

    public House() {

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

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", floors=" + floors +
                '}';
    }
}
