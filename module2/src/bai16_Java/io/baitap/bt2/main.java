//package bai16_Java.io.baitap.bt2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class main {
//    public static final String FILE_PATH = "src/bai16_Java/io/baitap/bt2/dung.csv";
//    Scanner scanner = new Scanner(System.in);
//
//    public void DisplayMenu() {
//        int choice;
//        do {
//            System.out.println("1. Danh Sách Thiết Bị ");
//            System.out.println("2. Giá Thiết bị");
//            System.out.println("3. Thêm Sản Phẩm");
//            System.out.println("4. Xóa Sản Phẩm");
//            System.out.println("5. Quay lai menu");
//            System.out.println("6. Kết thúc");
//            System.out.println("Lựa chọn của bạn: ");
//
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    List<Equipment> list = new ArrayList<>();
//                    getListEquipment(FILE_PATH,list);
//                    for(Equipment equipment: list){
//                        System.out.println(equipment);
//                    }
//                    break;
//                case 2:
////                    PriceList() ;
//                    break;
//                case 3:
//                    createEquipment();
//                    break;
//                case 4:
//                    deleteEquipment();
//                case 5:
//                    break;
//                case 6:
//                    System.exit(0);
//            }
//        } while (choice >= 1 && choice <= 5);
//    }
//
//    private void deleteEquipment(String name) {
//        List<Equipment> list = new ArrayList<>();
//        getListEquipment(FILE_PATH,list);
//        for(Equipment equipment: list){
//            System.out.println(equipment);
//        }
//    }
//
//    private Equipment createEquipment() {
//
//        System.out.println("nhap ten san pham");
//        String name = scanner.nextLine();
//        System.out.println("nhap ngay mua");
//        int day = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap gia");
//        double price = Double.parseDouble(scanner.nextLine());
//        System.out.println("nhap nguoi mua");
//        String human = scanner.nextLine();
//
//        return new Equipment(name, day, price, human);
//    }
//
//    private void saveToCSV(Equipment equipment) {
//        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(
//                    new FileWriter(FILE_PATH, true)
//            );
//            bufferedWriter.write(equipment.getName() + "," + equipment.getDatebuy() + "," + equipment.getPrice() + "," +
//                    equipment.getBuyHuman() + "\n");
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void getListEquipment(String filePath,List<Equipment> list){
//        File file = new File(filePath);
//        try{
//            BufferedReader bufferedReader = new BufferedReader((new FileReader(file)));
//            String line;
//            String[] lineArray;
//            Equipment equipment;
//            while((line = bufferedReader.readLine())!=null){
//                lineArray = line.split(",");
//                equipment = new Equipment(lineArray[0],Integer.parseInt(lineArray[1]),Double.parseDouble(lineArray[2]),lineArray[3]);
//                list.add(equipment);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Equipment equipment1 = new Equipment("a", 54, 4.5, "dung");
//        Equipment equipment2 = new Equipment("d", 54, 4.5, "dung");
//        Equipment equipment3 = new Equipment("b", 54, 4.5, "dung");
//        main main = new main();
//        main.DisplayMenu();
//
//    }
//}
