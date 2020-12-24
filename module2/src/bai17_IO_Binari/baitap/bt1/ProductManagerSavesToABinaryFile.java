package bai17_IO_Binari.baitap.bt1;

import java.io.*;
import java.util.Scanner;

public class ProductManagerSavesToABinaryFile implements Serializable {
    public static void main(String[] args) {
        Product product1 = new Product(1 , "nokia3110 " , "nokia" , 2000 , "none");
        Product product2 = new Product(2 , "nokia6300" , "nokia " , 3000 , "full");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/bai17_IO_Binari/baitap/bt1/product.txt"));
            objectOutputStream.writeObject(product1);
            objectOutputStream.writeObject(product2);
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/bai17_IO_Binari/baitap/bt1/product.txt"));
            Product product = null ;
            do {
                product = (Product) objectInputStream.readObject();
                System.out.println(product);
            }while (product!= null );


        } catch (EOFException e) {
            System.out.println("het file");
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ID san pham ban muon tim kiem : ");
        int a = scanner.nextInt();

        if (a== 1){
            System.out.println(product1);
        } else if (a == 2){
            System.out.println(product2);
        } else {
            System.out.println("chua co thong tin sp");
        }


    }

}
