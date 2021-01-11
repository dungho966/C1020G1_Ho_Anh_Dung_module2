package _casestudy.task1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Customer   {
    private String name ;
    private String birthday ;
    private String gender ;
    private int id ;
    private int phoneNumber ;
    private String email ;
    private String typeOfCustomer;
    private String address ;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, int id, int phoneNumber, String email, String typeOfCustomer, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void showInfor() {
        System.out.println("Name Customer: " +getName());
        System.out.println("Birthday:" +getBirthday());
        System.out.println("Gender: " +getGender());
        System.out.println("ID: " +getId());
        System.out.println("Phone Number: " +getPhoneNumber());
        System.out.println("Email: " +getEmail());
        System.out.println("Type Of Customer: " +getTypeOfCustomer());
        System.out.println("Address: " +getAddress());

    }




}
