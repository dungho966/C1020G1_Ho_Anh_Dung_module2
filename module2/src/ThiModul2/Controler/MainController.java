package ThiModul2.Controler;

import ThiModul2.Model.Phone;
import ThiModul2.Model.RealPhone;
import ThiModul2.Model.SecondHandPhone;
import ToDo.Model.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

public class MainController {
    Scanner scanner = new Scanner(System.in);


    void DisplayMenu() {
        int choice;
        do {
            System.out.println("Choose One Of All");
            System.out.println("1. Add New Phone");
            System.out.println("2. Delete Phone");
            System.out.println("3. Show Phone List");
            System.out.println("4. Find Phone");
            System.out.println("5. Back To Menu");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewPhone();
                    break;
                case 2:
                    deletePhone();
                    break;
                case 3:
                    showAllPhone();
                    break;
                case 4:
                    findPhone();
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 6);


    }

    private void findPhone() {
        int choice;
        do {
            System.out.println("1. Find Real Phone");
            System.out.println("2. Find SecondHand Phone");
            System.out.println("3. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    findRealPhone();
                    break;
                case 2:
                    findSecondHandPhone();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 3);

    }

    private void findSecondHandPhone() {
        List<SecondHandPhone> secondHandPhoneList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/ThiModul2/Data/SecondHand.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                SecondHandPhone secondHandPhone = new SecondHandPhone(strings[0], strings[1],
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3]),
                        strings[4], strings[5], strings[6]);
                secondHandPhoneList.add(secondHandPhone);
            }
            for (SecondHandPhone secondHandPhone : secondHandPhoneList) {
                System.out.println(secondHandPhone);
            }

            System.out.println("Enter ID Real Phone You Want To File");
            String idFind = scanner.nextLine();
            for (int i = 0; i < secondHandPhoneList.size(); i++) {
                if (idFind == secondHandPhoneList.get(i).getId()) {
                    System.out.println("Phone You Want To Find Is:" + secondHandPhoneList.get(i));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findRealPhone() {
        List<RealPhone> realPhoneList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/ThiModul2/Data/RealPhone.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                RealPhone realPhone = new RealPhone(strings[0], strings[1],
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3]),
                        strings[4], Integer.parseInt(strings[5]), strings[6]);
                realPhoneList.add(realPhone);
            }
            for (RealPhone realPhone : realPhoneList) {
                System.out.println(realPhone);
            }

            System.out.println("Enter ID Real Phone You Want To File");
            String idFind = scanner.nextLine();
            for (int i = 0; i < realPhoneList.size(); i++) {
                if (idFind == realPhoneList.get(i).getId()) {
                    System.out.println("Phone You Want To Find Is:" + realPhoneList.get(i));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
       }
//        Phone phone =(Phone) new RealPhone();
//
//        RealPhone realPhone =(RealPhone) phone;
    }

    private void showAllPhone() {
        int choice;
        do {
            System.out.println("1. Show Real Phone");
            System.out.println("2. Show Second Hand Phone");
            System.out.println("3. Back To Menu");
            System.out.println("4. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showRealPhone();
                    break;
                case 2:
                    showSecondPhone();
                    break;
                case 3:
                    DisplayMenu();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (choice >= 1 && choice <= 4);
    }

    private void showSecondPhone() {
        List<SecondHandPhone> secondHandPhoneList = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/ThiModul2/Data/SecondHand.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                SecondHandPhone secondHandPhone = new SecondHandPhone(strings[0], strings[1],
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4], strings[5]
                        , strings[6] + "\n");
                secondHandPhoneList.add(secondHandPhone);

                for (SecondHandPhone secondHandPhone1 : secondHandPhoneList) {
                    System.out.println(secondHandPhone1);
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showRealPhone() {
        List<RealPhone> realPhoneList = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/ThiModul2/Data/RealPhone.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                RealPhone realPhone = new RealPhone(strings[0], strings[1],
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4], Integer.parseInt(strings[5])
                        , strings[6] +"\n");
                realPhoneList.add(realPhone);

                for (RealPhone realPhone1 : realPhoneList) {
                    System.out.println(realPhone1);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deletePhone() {
        int choice;
        do {
            System.out.println("1. Delete Real Phone");
            System.out.println("2. Delete SecondHand Phone");
            System.out.println("3. Exit");
            System.out.println("4. Back To Menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    deleteRealPhone();
                    break;
                case 2:
                    deleteSecondHandPhone();
                    break;
                case 3:
                    System.exit(0);
                case 4:
                    DisplayMenu();
                    break;
            }
        } while (choice >= 1 && choice <= 4);
    }

    private void deleteSecondHandPhone() {
        List<SecondHandPhone> secondHandPhoneList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/ThiModul2/Data/SecondHand.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                SecondHandPhone secondHandPhone = new SecondHandPhone(strings[0], strings[1],
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3]),
                        strings[4], strings[5], strings[6]);
                secondHandPhoneList.add(secondHandPhone);
            }
            for (SecondHandPhone secondHandPhone : secondHandPhoneList) {
                System.out.println(secondHandPhone);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!secondHandPhoneList.isEmpty()) {
            System.out.println("Enter ID Of RealPhone You Want To Delete ");
            String idDelete = scanner.nextLine();

            for (int i = 0; i < secondHandPhoneList.size(); i++) {
                if (idDelete == secondHandPhoneList.get(i).getId()) {
                    secondHandPhoneList.remove(secondHandPhoneList.get(i));
                    System.out.println("The Rest Element: " + secondHandPhoneList);
                    if (secondHandPhoneList.size() > 0) {
                        try {
                            try (BufferedWriter bw = new BufferedWriter(
                                    new FileWriter("src/ThiModul2/Data/SecondHand.csv")
                            )) {

                                bw.write(secondHandPhoneList.get(i).getId() + "," + secondHandPhoneList.get(i).getPhoneName()
                                        + "," + secondHandPhoneList.get(i).getPrice()
                                        + "," + secondHandPhoneList.get(i).getDestNumber()
                                        + "," + secondHandPhoneList.get(i).getProduction() +
                                        "," + secondHandPhoneList.get(i).getCountryGetPhone()
                                        + secondHandPhoneList.get(i).getStandardPhone() + "," + "\n");
                                bw.close();
                            }
                        } catch (IndexOutOfBoundsException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            FileWriter fileWriter = new FileWriter(new File("src/ThiModul2/Data/SecondHand.csv"));
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            bufferedWriter.write("");
                            bufferedWriter.close();
                            System.out.println("empty file");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                } else {
                    System.out.println("empty list");
                }
            }
        }
    }

    private void deleteRealPhone() {
        List<RealPhone> realPhoneList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            new File("src/ThiModul2/Data/RealPhone.csv")
                    )
            );

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                RealPhone realPhone = new RealPhone(strings[0], strings[1],
                        Integer.parseInt(strings[2]), Integer.parseInt(strings[3]),
                        strings[4], Integer.parseInt(strings[5]), strings[6]);
                realPhoneList.add(realPhone);
            }
            for (RealPhone realPhone : realPhoneList) {
                System.out.println(realPhone);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!realPhoneList.isEmpty()) {
            System.out.println("Enter ID Of RealPhone You Want To Delete ");
            String idDelete = scanner.nextLine();

            for (int i = 0; i < realPhoneList.size(); i++) {
                if (idDelete == realPhoneList.get(i).getId()) {
                    realPhoneList.remove(realPhoneList.get(i));
                    System.out.println("The Rest Element: " + realPhoneList);
                    if (realPhoneList.size() > 0) {
                        try {
                            try (BufferedWriter bw = new BufferedWriter(
                                    new FileWriter("src/ThiModul2/Data/RealPhone.csv")
                            )) {

                                bw.write(realPhoneList.get(i).getId() + "," + realPhoneList.get(i).getPhoneName()
                                        + "," + realPhoneList.get(i).getPrice()
                                        + "," + realPhoneList.get(i).getDestNumber()
                                        + "," + realPhoneList.get(i).getProduction() +
                                        "," + realPhoneList.get(i).getTimeTest()
                                        + realPhoneList.get(i).getAreaTest() + "," + "\n");
                                bw.close();
                            }
                        } catch (IndexOutOfBoundsException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            FileWriter fileWriter = new FileWriter(new File("src/ThiModul2/Data/RealPhone.csv"));
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            bufferedWriter.write("");
                            bufferedWriter.close();
                            System.out.println("empty file");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                } else {
                    System.out.println("empty list");
                }
            }
        }
    }

    private void addNewPhone() {
        int choice;
        do {
            System.out.println("1. Add Real Phone");
            System.out.println("2. Add SecondHand Phone");
            System.out.println("3. Back To Menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addRealPhone();
                    break;
                case 2:
                    addSecondHandPhone();
                    break;
                case 3:
                    DisplayMenu();
                    break;
            }
        } while (choice >= 1 && choice <= 3);

    }

    private void addSecondHandPhone() {
        List<SecondHandPhone> secondHandPhoneList = new ArrayList<>();
        System.out.println("Enter ID");
        String id = scanner.nextLine();
        System.out.println("Enter PhoneName");
        String name = scanner.nextLine();
        System.out.println("Enter Price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Quantity"); //so luong
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Product");
        String product = scanner.nextLine();
        System.out.println("Enter Country Get");
        String countryGet = scanner.nextLine();
        System.out.println("Enter Standard Phone");
        String standard = scanner.nextLine();
        SecondHandPhone secondHandPhone = new SecondHandPhone(id, name, price, quantity, product, countryGet, standard);

        secondHandPhoneList.add(secondHandPhone);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/ThiModul2/Data/SecondHand.csv")
            );
            bufferedWriter.write(secondHandPhone.getId() +
                    "," + secondHandPhone.getPhoneName() + ","
                    + secondHandPhone.getPrice() + ","
                    + secondHandPhone.getDestNumber() +
                    "," + secondHandPhone.getProduction() + ","
                    + secondHandPhone.getCountryGetPhone() + ","
                    + secondHandPhone.getStandardPhone() + "\n");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addRealPhone() {
        List<RealPhone> realPhoneList = new ArrayList<>();
        System.out.println("Enter ID");
        String id = scanner.nextLine();
        System.out.println("Enter PhoneName");
        String name = scanner.nextLine();
        System.out.println("Enter Price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Quantity"); //so luong
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Product");
        String product = scanner.nextLine();
        System.out.println("Enter Time Test");
        int timeTest = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Area Test");
        String areaTest = scanner.nextLine();
        RealPhone realPhone = new RealPhone(id, name, price, quantity, product, timeTest, areaTest);


        realPhoneList.add(realPhone);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/ThiModul2/Data/RealPhone.csv", true)
            );
            bufferedWriter.write(realPhone.getId() +
                    "," + realPhone.getPhoneName() + "," + realPhone.getPrice() + "," + realPhone.getDestNumber() +
                    "," + realPhone.getProduction() + "," + realPhone.getTimeTest() + ","
                    + realPhone.getAreaTest() + "\n" );
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.DisplayMenu();
    }
}
