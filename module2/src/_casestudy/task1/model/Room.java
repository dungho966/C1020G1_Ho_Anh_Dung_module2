package _casestudy.task1.model;

import _casestudy.task1.model.Services;

public class Room extends Services {
    private String freeServices ; //dich vu miễn phí đi kèm

    public Room() {
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " +getId());
        System.out.println("Name Services: " +getNameServices());
        System.out.println("UseArea: " +getUseArea());
        System.out.println("Price: " +getPrice());
        System.out.println("MaximumHuman: " +getMaximumHuman());
        System.out.println("Rental Type: " +getRentalType());
        System.out.println("Free Services: " +getFreeServices());
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String ID, String nameServices, int useArea, int price, int maximumHuman, String rentalType, String freeServices) {
        super(ID, nameServices, useArea, price, maximumHuman, rentalType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                '}';
    }
}
