package _casestudy.task1.Controllers;

import _casestudy.task1.commons.comparator.ComparerByDateCustomer;
import _casestudy.task1.commons.converter.*;
import _casestudy.task1.commons.validate.CustomerValidate;
import _casestudy.task1.model.*;

import java.io.*;
import java.util.*;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        int choice;
        do {
            System.out.println("1. Add New Service");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Information of Employee");
            System.out.println("7. Profile");
            System.out.println("8. Exit");
            System.out.println("9. MovieBooking");
            System.out.println("10. Profile");
            System.out.println(" Enter Your Choose: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    ShowInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationofEmployee();
                    break;
                case 7:
                    Profile();
                    break;

                case 8:
                    System.exit(0);
                    break;
                case 9:
                    MovieTheatre();
                    break;

                default:
                    System.out.println("yeu cau nhap lai");
            }

        } while (true);
    }

    private void Profile() {
        Stack<String> employeeStack = new Stack<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/_casestudy/task1/data/employee.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                employeeStack.push(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Enter ID Employee :");
        String id = scanner.nextLine();

        for (String s : employeeStack) {
            String[] array = s.split(",");
            if (array[0].equals(id)) {
                System.out.println("Name: " + array[1] + ", Age: " + array[2] + ", Address: " + array[3]);
            }
        }


    }

    private static void MovieTheatre() {


    }

//    private void InformationofEmployee() {
//
//        int choice = 0;
//        do {
//            System.out.println("1. Show All Employee");
//            System.out.println("2. Add New Employee");
//            System.out.println("3. Back To Menu");
//            System.out.println("4. Exit");
//
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice){
//                case 1:
//                    showInformationofEmployee();
//                    break;
//                case 2:
//                    addNewEmployee();
//                    break;
//                case 3:
//                    displayMainMenu();
//                case 4:
//                    System.exit(0);
//
//            }
//        } while (choice>=1 && choice <= 3 );
//
//
//
//
//
////        Converter<Employee> employeeConverter = new Converter<>(new FormatCSVEmployee());
////        List<Employee> employeeList = employeeConverter.csvToList("src/_casestudy/task1/data/employee.csv");
//
//
//    }

    private void showInformationofEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/_casestudy/task1/data/employee.csv")
                    )
            );
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Employee employee = new Employee(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3]);
                employeeList.add(employee);
            }
            for (Employee element : employeeList) {
                System.out.println(element);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//        Employee employee1 = new Employee("001","An", 5, "Hai Phong");
//        Employee employee2 = new Employee("002","Cuong", 8, "Hai Phong");
//        Employee employee3 = new Employee("003","Binh", 19, "Hai Phong");
//        Employee employee4 = new Employee("004","Dung", 45, "Nghe An");
//        Employee employee5 = new Employee("005","Kien", 78, "Hai Phong");
//        Employee employee6 = new Employee("006","Uyen", 12, "Hai Phong");
//        Employee employee7 = new Employee("007","Minh", 13, "Hai Phong");
//        Employee employee8 = new Employee("008","Ninh", 45, "Hai Phong");
//        Employee employee9 = new Employee("009","Quyen", 14, "Hai Phong");
//        Employee employee10 = new Employee("010","Em", 57, "Hai Phong");
//
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(employee1);
//        employees.add(employee2);
//        employees.add(employee3);
//        employees.add(employee4);
//        employees.add(employee5);
//        employees.add(employee6);
//        employees.add(employee7);
//        employees.add(employee8);
//        employees.add(employee9);
//        employees.add(employee10);
//
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//        try {
//            FileWriter fileWriter = new FileWriter("src/_casestudy/task1/data/employee.csv");
//            for (Employee employee : employees) {
//                fileWriter.write(employee.getName() + "," + employee.getAge() + "," + employee.getAddress() + "\n");
//            }
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void addNewEmployee() {
        Employee employee = new Employee();
        System.out.println("Enter ID");
        String id = scanner.nextLine();
        System.out.println("Enter Employee Name");
        String employeeName = scanner.nextLine();
        System.out.println("Enter Age Employee");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address Of Employee");
        String address = scanner.nextLine();
        employee.setName(employeeName);
        employee.setAge(age);
        employee.setAddress(address);
        Employee employee1 = new Employee(id, employeeName, age, address);


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/_casestudy/task1/data/employee.csv", true));
            bufferedWriter.write(employee.getName() + "," + employee.getAge() + "," + employee.getAddress() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void addNewBooking() {
        int choice;
        do {
            System.out.println("1. Booking Villa");
            System.out.println("2. Booking House");
            System.out.println("3. Booking Room");
            System.out.println("Your Choice:  ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 5);

    }

    private static void ShowInformationOfCustomer() {
        Converter<Customer> customerConverter = new Converter<>(new FormatCSVCustomer());
        List<Customer> customerList = customerConverter.csvToList("src/_casestudy/task1/data/customer.csv");
        for (Customer customer : customerList) {
            customer.showInfor();
        }

        customerList.sort(new ComparerByDateCustomer());
        for (Customer customer : customerList) {
            customer.showInfor();
        }

    }

    private void addNewCustomer() {
        Customer customer = createCustomer();
        Converter<Customer> customerConverter = new Converter<>(new FormatCSVCustomer());
        customerConverter.writeToCSVFile(customer, "src/_casestudy/task1/data/customer.csv");


    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        System.out.println("Enter Name of Customer ");
        String nameCustomer = scanner.nextLine();
        System.out.println("Enter Birthday ");
        String birthday = scanner.nextLine();
        System.out.println("Enter Your Gender");
        String gender = scanner.nextLine();
        System.out.println("Enter ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Phone Number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Email");
        String email = scanner.nextLine();
        System.out.println("Enter TYpe of Customer : ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter Address ");
        String address = scanner.nextLine();
        customer.setName(nameCustomer);
        customer.setBirthday(birthday);
        customer.setGender(gender);
        customer.setId(id);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        customer.setTypeOfCustomer(typeCustomer);
        customer.setAddress(address);
        return customer;
    }


    private void showServices() {
        int choice;
        do {
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show All Name Villa Not Duplicate");
            System.out.println("5. Show All Name House Not Duplicate");
            System.out.println("6. Show All Name Name Not Duplicate");
            System.out.println("7. Back To Menu");
            System.out.println("8. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllVillaNotDuplicate();
                    break;
                case 5:
                    showAllHouseNotDuplicate();
                    break;
                case 6:
                    showAllRoomNotDuplicate();
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
            }
        } while (choice != 7);
    }

    private void showAllRoomNotDuplicate() {
        Converter<Room> converter = new Converter<>(new FormatCSVRoom());
        List<Room> roomList = converter.csvToList("src/_casestudy/task1/data/room.csv");
        Set<String> nameNotDuplicated = new TreeSet<>();
        for (Room room : roomList) {
            nameNotDuplicated.add(room.getNameServices());
        }
        for (String name : nameNotDuplicated) {
            System.out.println(name);
        }
    }

    private void showAllHouseNotDuplicate() {
        Converter<House> converter = new Converter<>(new FormatCSVHouse());
        List<House> houselist = converter.csvToList("src/_casestudy/task1/data/house.csv");
        Set<String> nameNotDuplicated = new TreeSet<>();
        for (House house : houselist) {
            nameNotDuplicated.add(house.getNameServices());
        }
        for (String name : nameNotDuplicated) {
            System.out.println(name);
        }

    }

    private void showAllVillaNotDuplicate() {
        Converter<Villa> converter = new Converter<>(new FormatCSVVilla());
        List<Villa> villaList = converter.csvToList("src/_casestudy/task1/data/villa.csv");
        Set<String> nameNotDuplicated = new TreeSet<>();
        for (Villa villa : villaList) {
            nameNotDuplicated.add(villa.getNameServices());
        }
        for (String name : nameNotDuplicated) {
            System.out.println(name);
        }
    }

    private void showAllRoom() {
        Converter<Room> converter = new Converter<>(new FormatCSVRoom());
        List<Room> roomList = converter.csvToList("src/_casestudy/task1/data/room.csv");
        for (Room room : roomList) {
            room.showInfo();
        }
    }

    private void showAllHouse() {
        Converter<House> converter = new Converter<>(new FormatCSVHouse());
        List<House> houselist = converter.csvToList("src/_casestudy/task1/data/house.csv");
        for (House house : houselist) {
            house.showInfo();
        }
    }

    private void showAllVilla() {
        Converter<Villa> converter = new Converter<>(new FormatCSVVilla());
        List<Villa> villaList = converter.csvToList("src/_casestudy/task1/data/villa.csv");
        for (Villa villa : villaList) {
            villa.showInfo();
        }
    }

    //
    public void addNewServices() {
        int choice;
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back To Menu");
            System.out.println("5. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Villa villa = addNewVilla();
                    Converter<Villa> converter = new Converter<>(new FormatCSVVilla());
                    converter.writeToCSVFile(villa, "src/_casestudy/task1/data/villa.csv");
                    break;
                case 2:
                    House house = addNewHouse();
                    Converter<House> houseConverter = new Converter<>(new FormatCSVHouse());
                    houseConverter.writeToCSVFile(house, "src/_casestudy/task1/data/house.csv");
                    break;
                case 3:
                    Room room = addNewRoom();
                    Converter<Room> roomConverter = new Converter<>(new FormatCSVRoom());
                    roomConverter.writeToCSVFile(room, "src/_casestudy/task1/data/room.csv");
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("yeu cau nhap lai");

            }
        } while (choice != 4);

    }

    private Room addNewRoom() {
        Room room = new Room();
        addNewService(room);
        System.out.println("Enter Free Service: ");
        String freeServices = scanner.nextLine();
        room.setFreeServices(freeServices);

        return room;

    }

    private House addNewHouse() {
        House house = new House();
        addNewService(house);
        System.out.println("Enter Standard Room: ");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter Other otherConvenient: ");
        String otherConvenient = scanner.nextLine();
        System.out.println("Enter Floors: ");
        int floors = Integer.parseInt(scanner.nextLine());
        house.setStandardRoom(standardRoom);
        house.setOtherConvenient(otherConvenient);
        house.setFloors(floors);
        return house;
    }

    private Villa addNewVilla() {
        Villa villa = new Villa();
        addNewService(villa);
        System.out.println("Enter Standard Room: ");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter Other otherConvenient: ");
        String otherConvenient = scanner.nextLine();
        System.out.println("Enter Pool Area: ");
        int poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Floors: ");
        int floors = Integer.parseInt(scanner.nextLine());
        villa.setStandartRoom(standardRoom);
        villa.setOtherConvenient(otherConvenient);
        villa.setPoolArea(poolArea);
        villa.setFloors(floors);
        return villa;
    }

    private void addNewService(Services services) {
        String id = null;
        do {
            System.out.println("Enter id:");
            id = scanner.nextLine();
        } while (CustomerValidate.isValidService(id, CustomerValidate.ServicesRegex));
        System.out.println("Enter Name Services:");
        String nameService = scanner.nextLine();
        System.out.println("Enter Use Area:");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Price:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Maximum Human:");
        int maximumHuman = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Rental Type: ");
        String rentalType = scanner.nextLine();

        services.setId(id);
        services.setNameServices(nameService);
        services.setUseArea(useArea);
        services.setPrice(price);
        services.setMaximumHuman(maximumHuman);
        services.setRentalType(rentalType);

    }

    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.displayMainMenu();
    }


}
