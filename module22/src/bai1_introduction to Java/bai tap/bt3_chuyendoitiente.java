package bai1.baitap;
import java.util.Scanner;
public class bt3_chuyendoitiente {
    public static void main(String[] args) {
        double rate = 23000;
        double usd ;
        double vnd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = scanner.nextDouble();
        vnd = rate * usd;

        System.out.println("VND : " +vnd);



    }
}
