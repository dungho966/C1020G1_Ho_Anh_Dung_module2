package _casestudy.task1;

public class Villa extends Services {
    private String  standartRoom ; //tiêu chuẩn phòng
    private String otherConvenient ;
    private String poolArea ;
    private  int floors ;

    public Villa() {
    }

    public Villa(String standartRoom, String otherConvenient, String poolArea, int floors) {
        this.standartRoom = standartRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String ID, String nameServices, int useArea, int price, int maximumHuman, String rentalType, String standartRoom, String otherConvenient, String poolArea, int floors) {
        super(ID, nameServices, useArea, price, maximumHuman, rentalType);
        this.standartRoom = standartRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standartRoom='" + standartRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floors=" + floors +
                '}';
    }


}
