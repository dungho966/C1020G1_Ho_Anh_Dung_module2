//package bai12_java_colection_framework.baitap;
//
//public class one {
//    import java.util.LinkedList;
//import java.util.Scanner;
//    public class ProductManager extends Product{
//        static Scanner input = new Scanner(System.in);
//        static LinkedList<Product> productList = new LinkedList<>();
//        static Product youPhone = new Product("YouPhone", "Red", 1, 1200);
//        static Product xamxung = new Product("XamXung", "Blue", 2, 900);
//        static Product xiaoMine = new Product("XiaoMine", "Yellow", 3, 500);
//        public static void runFirst(){
//            productList.add(youPhone);
//            productList.add(xamxung);
//            productList.add(xiaoMine);
//        }
//        public static void addProduct(){
//            System.out.print("Input Name: ");
//            String name = input.nextLine();
//            System.out.print("Input Color: ");
//            String color = input.nextLine();
//            System.out.print("Input ID: ");
//            double id = input.nextDouble();
//            System.out.print("Input price: ");
//            double price = input.nextDouble();
//            Product a = new Product(name, color, id, price);
//            productList.add(a);
//            displayProduct();
//        }
//        public static void editProduct(){
//            System.out.println("Input ID to edit: ");
//            double id = input.nextDouble();
//            boolean check = false;
//            for (Product product : productList) {
//                if (id == product.getId()) {
//                    System.out.println("Choose what to edit: " + "\n 1.Name" + "\n 2.ID" + "\n 3.Price" + "\n 4.Color");
//                    int choice = input.nextInt();
//                    switch (choice) {
//                        case 1:
//                            System.out.println("Input new name: ");
//                            product.setName(input.next());
//                            break;
//                        case 2:
//                            System.out.println("Input new ID: ");
//                            product.setId(input.nextDouble());
//                            break;
//                        case 3:
//                            System.out.println("Input new price: ");
//                            product.setPrice(input.nextDouble());
//                            break;
//                        case 4:
//                            System.out.println("Input new Color: ");
//                            product.setColor(input.next());
//                            break;
//                        default:
//                            System.out.println("Wrong input!");
//                    }
//                    check = true;
//                }
//            }
//            if(!check){
//                System.out.println("No product match!");
//            }
//            displayProduct();
//        }
//        public static void deleteProduct(){
//            displayProduct();
//            System.out.println("Input ID to delete: ");
//            double id = input.nextDouble();
//            boolean check = false;
//            for(int i = 0; i < productList.size(); i++){
//                if(id == productList.get(i).getId()){
//                    productList.remove(productList.get(i));
//                    check = true;
//                }
//            }
//            if(check){
//                for (Product element : productList){
//                    System.out.println(element);}
//            } else {
//                System.out.println("No product match");
//            }
//        }
//        public static void displayProduct(){
//            for (Product element : productList){
//                System.out.println(element);
//            }
//        }
//        public static void findProduct(){
//            System.out.println("Input Name to find: ");
//            String name = input.next();
//            boolean check = false;
//            for (Product product : productList) {
//                if (name.equals(product.getName())) {
//                    System.out.println(product);
//                    check = true;
//                }
//            }
//            if(!check) {
//                System.out.println("No product match!");
//            }
//        }
//        public static void sortByPrice(){
//            productList.sort(new CompareByPrice());
//            displayProduct();
//        }
//        public static void sortByPriceReverse() {
//            productList.sort(new CompareByPriceReverse());
//            displayProduct();
//        }
//    }
//}
