package _casestudy.task1.model;

import _casestudy.task1.model.Services;

public class Villa extends Services {
    private String  standartRoom ; //tiêu chuẩn phòng
    private String otherConvenient ; //
    private int poolArea ;
    private  int floors ;

    public Villa() {
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " +getId());
        System.out.println("Name Services: " +getNameServices());
        System.out.println("UseArea: " +getUseArea());
        System.out.println("Price: " +getPrice());
        System.out.println("MaximumHuman: " +getMaximumHuman());
        System.out.println("Rental Type: " +getRentalType());
        System.out.println("Standard Room: " +getStandartRoom());
        System.out.println("Other Convenient: " +getOtherConvenient());
        System.out.println("Pool Area: " +getPoolArea());
        System.out.println("Floors: " +getFloors());

    }

    public Villa(String standartRoom, String otherConvenient, int poolArea, int floors) {
        this.standartRoom = standartRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String ID, String nameServices, int useArea, int price, int maximumHuman, String rentalType, String standartRoom, String otherConvenient, int poolArea, int floors) {
        super(ID, nameServices, useArea, price, maximumHuman, rentalType);
        this.standartRoom = standartRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getStandartRoom() {
        return standartRoom;
    }

    public void setStandartRoom(String standartRoom) {
        this.standartRoom = standartRoom;
    }

    public String getOtherConvenient() {
        return otherConvenient;
    }

    public void setOtherConvenient(String otherConvenient) {
        this.otherConvenient = otherConvenient;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
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
