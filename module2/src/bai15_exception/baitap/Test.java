package bai15_exception.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = null;
        try {
            System.out.println("nhap a: ");
            int a = scanner.nextInt();

            System.out.println("nhap b:  ");
            int b = scanner.nextInt();

            System.out.println("nhap c:  ");
            int c = scanner.nextInt();
            triangle = new Triangle(a,b,c);
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
        System.out.println("sso do cua tam giac la: \n a:  " +triangle.getA()+ "\n b: "+triangle.getB()+ "\n c: " +triangle.getC() );
        System.out.println("ket thuc");
//        try {
//            System.out.println("nhap a: ");
//            int a = scanner.nextInt();
//
//            System.out.println("nhap b:  ");
//            int b = scanner.nextInt();
//
//            System.out.println("nhap c:  ");
//            int c = scanner.nextInt();
//
//            Triangle triangle = new Triangle();
//        } catch (){
//
//        }
    }
}
