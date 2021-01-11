//package ToDo;
//
//import ToDo.Model.Human;
//import ToDo.validate.HumanValidate;
//import _casestudy.task1.model.Employee;
//import inheritance.baitap.HinhHoc;
//
//import javax.swing.*;
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class MainController {
//    Scanner scanner = new Scanner(System.in);
//
//
//    public void DisplayMenu() {
//        int choice;
//        do {
//            System.out.println("1.Add");
//            System.out.println("2.Delete");
//            System.out.println("3.Edit");
//            System.out.println("4. Back To menu");
//            System.out.println("5. Exit");
//            System.out.println("Your Choice: ");
//            choice = Integer.parseInt(scanner.nextLine());
//
//            switch (choice) {
//                case 1:
//                    AddHuman();
//                    break;
//                case 2:
//                    DeleteHuman();
//                    break;
//                case 3:
//                    EditHuman();
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    System.exit(0);
//            }
//        } while (choice >= 1 && choice <= 5);
//    }
//
//    private void EditHuman() {
//        List<Human> humanList = new ArrayList<>();
//        try {
//            BufferedReader bufferedReader = new BufferedReader(
//                    new FileReader(
//                            new File("src/ToDo/human.csv")
//                    )
//            );
//
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] strings = line.split(",");
//                Human human = new Human(Integer.parseInt(strings[0]), strings[1],
//                        Integer.parseInt(strings[2]), strings[3]);
//                humanList.add(human);
//            }
//
//            for (Human human : humanList) {
//                System.out.println(human);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Enter ID You Want To Edit:");
//        int idEdit = Integer.parseInt(scanner.nextLine());
//        for (Human human : humanList) {
//            if (idEdit == human.getId()) {
//                System.out.println("Enter What You Want To Edit : \n1. ID " + "\n2. Name " + "\n3. Age"
//                        + "\n4. Address" + "\n5. Back to Menu" + "\n6. Exit");
//                int choice = Integer.parseInt(scanner.nextLine());
//                switch (choice) {
//                    case 1:
//                        System.out.println("New ID: ");
//                        human.setId(Integer.parseInt(scanner.nextLine()));
//                        break;
//                    case 2:
//                        System.out.println("New Name");
//                        human.setName(scanner.nextLine());
//                        break;
//                    case 3:
//                        System.out.println("New Age");
//                        human.setAge(Integer.parseInt(scanner.nextLine()));
//                        break;
//                    case 4:
//                        System.out.println("New Address");
//                        human.setAddress(scanner.nextLine());
//                        break;
//                    case 5:
//                        break;
//                    case 6:
//                        System.exit(0);
//                }
//                System.out.println("Element After Edit");
//                System.out.println(humanList);
//                try {
//                    BufferedWriter bw = new BufferedWriter(
//                            new FileWriter("src/ToDo/human.csv")
//                    );
//
//                    bw.write(human.getId() + "," + human.getName() + "," + human.getAge() + "," + human.getAddress() + "\n");
//                    bw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//
//            }
//        }
//    }
//
//
//    private void DeleteHuman() {
//        List<Human> humanList = new ArrayList<>();
//        try {
//            BufferedReader bufferedReader = new BufferedReader(
//                    new FileReader(
//                            new File("src/ToDo/human.csv")
//                    )
//            );
//
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] strings = line.split(",");
//                Human human = new Human(Integer.parseInt(strings[0]), strings[1],
//                        Integer.parseInt(strings[2]), strings[3]);
//                humanList.add(human);
//            }
//            for (Human human : humanList) {
//                System.out.println(human);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if (!humanList.isEmpty()) {
//            System.out.println("Enter ID Of Human You Want To Delete ");
//            int id = Integer.parseInt(scanner.nextLine());
////        try {
////            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ToDo/human.csv"));
////            for (Human human : humanList) {
////                if (id != human.getId()) {
////                    bw.write(human.getId() + "," + human.getName() + ","
////                            + human.getAge() + "," + human.getAddress() + "\n");
////                    bw.close();
////                }
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//
//            for (int i = 0; i < humanList.size(); i++) {
//                if (id == humanList.get(i).getId()) {
//                    humanList.remove(humanList.get(i));
//                    System.out.println("The Rest Element: " + humanList);
//                    if (humanList.size() > 0) {
//                        try {
//                            try (BufferedWriter bw = new BufferedWriter(
//                                    new FileWriter("src/ToDo/human.csv")
//                            )) {
//
//                                bw.write(humanList.get(i).getId() + "," + humanList.get(i).getName()
//                                        + "," + humanList.get(i).getAge() + "," + humanList.get(i).getAddress() + "\n");
//                                bw.close();
//                            }
//                        } catch (IndexOutOfBoundsException e) {
//                            e.printStackTrace();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        try {
//                            FileWriter fileWriter = new FileWriter(new File("src/ToDo/human.csv"));
//                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                            bufferedWriter.write("");
//                            bufferedWriter.close();
//                            System.out.println("empty file");
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//                } else {
//                    System.out.println("empty list");
//                }
//            }
//        }
//    }
//
//    private void AddHuman() {
////        String id;
////        do {
////            System.out.println("Enter ID");
////            id = scanner.nextLine();
////        }
////        while (HumanValidate.checkId(id));
//        System.out.println("Enter ID");
//        int id = Integer.parseInt(scanner.nextLine());
//
//        String name;
//        do {
//            System.out.println("Enter Name :");
//            name = scanner.nextLine();
//        } while (HumanValidate.validateName(name));
//
////        String age ;
////        do {
////            System.out.println("Enter Age");
////            age = scanner.nextLine();
////        }while (HumanValidate.checkAge(age));
//        System.out.println("Enter Age");
//        int age = Integer.parseInt(scanner.nextLine());
//
//        String address;
//        do {
//            System.out.println("Enter Address");
//            address = scanner.nextLine();
//        } while (HumanValidate.validateAddress(address));
//        Human human = new Human(id, name, age, address);
//        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(
//                    new FileWriter("src/ToDo/human.csv", true));
//            bufferedWriter.write(human.getId() + "," + human.getName() + ","
//                    + human.getAge() + "," + human.getAddress() + "\n");
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        MainController mainController = new MainController();
//        mainController.DisplayMenu();
//    }
//
//}
