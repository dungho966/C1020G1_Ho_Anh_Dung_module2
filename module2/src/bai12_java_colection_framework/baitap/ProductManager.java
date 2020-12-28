package bai12_java_colection_framework.baitap;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager extends Product {
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Product> productList = new LinkedList<>();
    static Product product1 = new Product("iphone" , 1 , 200);
    static Product product2 = new Product("samsung" , 2 , 100 );
    static Product product3 = new Product("nokia" , 3 , 300);

    public static void add() {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public static void AddProduct() {
        System.out.println("Enter Name :  ");
        String name = scanner.nextLine();
        System.out.println("Enter ID : ");
        int id = scanner.nextInt();
        System.out.println("Enter Price:  ");
        int price = scanner.nextInt();
        Product d = new Product(name,id ,price );
        productList.add(d);
    }

    public static void editProduct() {
        System.out.println("Enter ID of Product Want To Edit:  ");
        int id = scanner.nextInt();
        boolean check = false;
        for (Product product: productList) {
            if (id ==product.getID() ) {
                System.out.println("Enter What You Want To Edit : \n1. Name " + "\n2. ID " + "\n3. Price"  );
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("New name: ");
                        product.setName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter New ID:  ");
                        product.setID(scanner.nextInt());
                        break;
                    case 3:
                        System.out.println("Enter New Price:  ");
                        product.setPrice(scanner.nextInt());
                        break;
                    default:
                        System.out.println("Wrong Input");
                }
                check = true;
            }

            }
        if (!check){
            System.out.println("Do Not Have This ID");
        }

    }
    public static void deleteProduct() {
        System.out.println("Enter ID of Product You Want Delete: ");
        int idDelete = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (idDelete == productList.get(i).getID()){
                productList.remove(productList.get(i));
                check = true;
            }
        } if (!check){
            System.out.println("Do Not Have This ID ");
        }

    }
    public static void showProduct() {
        System.out.println("Enter ID You Want To ShowInfo:  ");

    }
}
