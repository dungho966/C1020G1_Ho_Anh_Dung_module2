package _casestudy.task1;

public class Room extends Services {
    private String freeServices ; //dich vu miễn phí đi kèm

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String ID, String nameServices, int useArea, int price, int maximumHuman, String rentalType, String freeServices) {
        super(ID, nameServices, useArea, price, maximumHuman, rentalType);
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                '}';
    }
}
